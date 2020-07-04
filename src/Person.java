/* zadanie 1 workboook, str. 104
Stwórz klasę Person ◦ dodaj pola: name, surname, gender, age, pesel
- dodaj metodę sprawdzającą, czy dana osoba osiągnęła wiek emerytalny (np. hasReachedRetirementAge());
dla kobiet wiek emerytalny przyjmijmy >=60 lat, a dla mężczyzn >=65 lat
- dodaj metodę zwracającą różnicę wieku pomiędzy daną osobą a inną osobą ▪ niech metoda przyjmuje parametr typu Person
- niech nie zwraca wartości ujemnych jako różnicy lat
- dodaj metodę, która wylicza i zwraca, ile lat brakuje
do emerytury
*/
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Class representing Polish Citizen born only before 1999 and after 1900.
 */
public class Person {

    private static final int RETIREMENT_AGE_M = 65;
    private static final int RETIREMENT_AGE_K = 60;

    private String fullName, pesel;
    private char gender;
    private int age;

    public Person(String fullName, String pesel) {
        this.fullName = fullName;
        this.pesel = pesel; //setPesel(pesel) - walidator numeru pesel
        setAge();
        setGender();
    }

    public void printYearsToRetirement() {
        if(hasReachedRetirementAge()) {
            System.out.println("Jestem juz na emeryturce :)");
        }
        else {
            System.out.println("Dasz rade, do emerytury pozostalo: " + calcYearsTillRetirement());
        }
    }

    private int calcYearsTillRetirement() {
        if(gender == 'K')
            return RETIREMENT_AGE_K - age;
        else
            return RETIREMENT_AGE_M - age;
    }

    public void printHasReachedRetirementAge() {
        System.out.println("Czy osiagnal/ela wiek emerytalny? " + hasReachedRetirementAge());
    }

    public boolean hasReachedRetirementAge() {
        if( (gender == 'K' && age >= RETIREMENT_AGE_K) || (gender == 'M' && age >= RETIREMENT_AGE_M) )
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public void printYearsDiff(Person other) {
        System.out.println(calcYearsDiff(other));
    }

    public int calcYearsDiff(Person other) {
        return Math.abs(calcYearsDiff(this.getBirthdate(), other.getBirthdate()));
    }

    private int calcYearsDiff(LocalDate d1, LocalDate d2) {
        return (int)ChronoUnit.YEARS.between(d1, d2);
    }

    private void setGender() {
        gender = calcGender();
    }

    private char calcGender() {
        int value = getIntFromChars(1, 9, 10);
        if(value % 2 == 0) {
            return 'K';
        }
        else {
            return 'M';
        }
    }

    private void setAge() {
        age = calcAge();
    }

    //age wyznaczany jest na podstawie peselu
    private int calcAge() {
        LocalDate today = LocalDate.now();  //zwraca date dzisiejsza
        LocalDate birthDate = getBirthdate();
        return calcYearsDiff(birthDate, today);
    }

    //kobieta: 86071975344
    //mezyczna: 47040262973
    private LocalDate getBirthdate() {
        int year = getYear();
        int month = getMonth();
        int day = getDay();

        return LocalDate.of(year, month, day);
    }

    private int getYear() {
        return Integer.parseInt("19" + getIntFromChars(2, 0, 2));
    }

    private int getMonth() {
        return getIntFromChars(2, 2, 4);
    }

    private int getDay() {
        return getIntFromChars(2, 4, 6);
    }

    private int getIntFromChars(int charsTabSize, int startIdx, int endIdx) {
        char[] chars = new char[charsTabSize];
        pesel.getChars(startIdx, endIdx, chars, 0);
        return Integer.parseInt(new String(chars));
    }

}
