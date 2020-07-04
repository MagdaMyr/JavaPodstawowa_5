/*Z0ad. 6 //modelowa klasa
Napisz klasę Java modelującą obiekty z kategorii Pojazd.
Utwórz nowy plik z publiczną klasą Pojazd.
Pola, które określają cechy tej klasy powinny mieć modyfikator dostępu prywatnego (private) i przechowywać
następujące informacje: marka, model, rok produkcji, przebieg, prędkość maksymalna, pojemność silnika, ilość koni
mechanicznych, cena, waga.
Dodatkowo obiekty tej klasy powinny potrafić wykonywać następujące akcje:
1) ubytek ceny, wzrost przebiegu, zmiana (zwiększenie lub zmniejszenie) prędkości maksymalnej i koni mechanicznych
- akcje te modyfikują właściwości obiektu (zmieniają wartości pól)
2) wypisanie informacji o sobie - wykorzystanie wartości pól
3) akcja jazdy, wypisująca tekst korzystając z niektórych pól, np.: "Moje " + km + " porusza " + waga + " kg i
rozpędza je do " + vmax
4) akcja lans, wspóldzielona przez wszystkie obiekty tej klasy, wypisująca tekst: "Mam auto, nieważne jakie, i tak jest szpan."
Następnie utwórz klasę Runner, zawierającą metodę main, w której utworzysz 2 obiekty auta: jedno posiadane przez siebie
 (lub takie którym jeździłeś), drugie auto marzeń i dla każdego z nich wykonasz sekwencję metod: przedstawić się ->
 jazda -> ubytek ceny, wzrost przebiegu, modyfikacja vmax lub km -> przedstawić się -> lans.
 */

public class Vehicle {
    private String brand;
    private String model;
    private int productionYear;
    private long distance;
    private long speedMax;
    private long engineCapacity;
    private long horsepower;
    private long price;
    private long weight;

}
