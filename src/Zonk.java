/* Zad. 5 //funkcje, pętle
Pamiętacie teleturniej z "zonkiem"? Licencja gry-show telewizyjnego "Let's Make a Deal" zakłada, że przed graczem
stawia się możliwość wyboru jednego spośród 3 drzwi. Za jednym z drzwi jest nagroda, za 2 - nie. Kiedy gracz wybierze
drzwi, prowadzący otwiera jedno z pozostałych dwóch drzwi (oczywiście nigdy nie to, które zawiera nagrodę!). Wtedy
daje się graczowi wybór: może pozostać przy swoim pierwszym wyborze, lub zmienić go, wybierając pozostałe drzwi.
Zastosujemy statystykę i symulację, żeby sprawdzić, która ze strategii gry jest lepsza. Zgodnie z intuicją oba drzwi
powinny nieść taką samą szansę wygrania.
Napisz program, który przyjmuje wartość n, oznaczającą, ile razy powinna być rozegrana gra, stosując jedną jak i drugą
strategię (zawsze zmiana wyboru lub nigdy zmiana wyboru). Po przeprowadzonej symulacji wyświetl prawdopodobieństwo
odniesienia sukcesu w jednej i drugiej strategii.
 */

import java.util.Scanner;

public class Zonk {

    private int userGateNumber;
    private int prizeGateNumber;
    private int numberOfTests;
    private boolean changeGateStrategy;

    private int successChange = 0;
    private int successNoChange = 0;

    public Zonk(int numberOfTests, boolean changeGate) {

        this.numberOfTests = numberOfTests;
        this.changeGateStrategy = changeGate;
    }

    public void userGateDraw() {

        this.userGateNumber = (int) (Math.random() * 3 + 1);
    }

    public void prizeGateDraw() {

        this.prizeGateNumber = (int) (Math.random() * 3 + 1);
    }

    public void runTheGame() {

        for (int x = 0; x < this.numberOfTests; x++) {

            this.userGateDraw();
            this.prizeGateDraw();

            //Strategia zmiany bramki
            if (this.changeGateStrategy) {

                if (this.prizeGateNumber == 1) {

                    // ad1. zamknięcie bramki 3 i zmiana z 2 na 1
                    // ad1. zamknięcie bramki 2 i zmiana z 3 na 1
                    if (this.userGateNumber == 2 || this.userGateNumber == 3) this.successChange++;
                    //w przeciwnym wypadku zamknięcie bramki nr 2 lub 3, a następnie ZONK po zmianie

                } else if (this.prizeGateNumber == 2) {

                    // ad1. zamknięcie bramki nr 3, a następnie zmiana na 2
                    // ad2. zamknięcie bramki 1 i zmiana z 3 na 2
                    if (this.userGateNumber == 1 || this.userGateNumber == 3) this.successChange++;
                    //w przeciwnym wypadku zamknięcie bramki 1 lub 2, a następnie ZONK po zmianie

                } else // nagroda w 3. bramce

                    //ad1. zamknięcie bramki nr 2, a następnie zmiana na 3
                    //ad2. zamknięcie branki nr 1, a następnie zmiana na 3
                    if (this.userGateNumber == 1 || this.userGateNumber == 2) this.successChange++;
                //w przeciwnym wypadku zamknięcie bramki 1 lub 2, a następnie ZONK po zmianie

                //Strategia BEZ ZMIANY bramki
            } else {

                if (this.userGateNumber == this.prizeGateNumber) this.successNoChange++;
            }
        }
    }

    public void showProbabilityResults() {

        if (this.changeGateStrategy) System.out.println("Prawdopodobieństwo sukcesu po "+this.numberOfTests+" prób przy wariancie ZMIANY bramki to: " + (double) this.successChange/this.numberOfTests);
        else System.out.println("Prawdopodobieństwo sukcesu "+this.numberOfTests+" BEZ ZMIANY bramki: " + (double) this.successNoChange/this.numberOfTests);
    }

    public static int getNumberOfTests() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę prób do przeprowadzenia: ");

        return scan.nextInt();
    }
}