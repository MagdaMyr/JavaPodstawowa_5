import java.util.Scanner;

public class SimpleZonk {

    public static void main(String[] args) {
        //1. Pytam uzytkowanika, ile razy ma być przeprowadzona gra
        Scanner scan = new Scanner(System.in);
        System.out.println("Please specify number of games: ");
        int n = scan.nextInt();
        scan.close();
        neverchange(n);
        alwayschange(n);
    }

    //2. Strategia 1 (nigdy zmiana wyboru)
    public static void neverchange(int x){

        int win = 0;

        for (int i=0 ; i < x; i++ ){
            int prize = (int) (Math.random() * 3);
            int playerchoice = (int) (Math.random() * 3);
            if (playerchoice == prize) {
                win+=1;
            }
        }
        System.out.println("The probability of winning in 'never change' strategy is: " + (double) win/x);
    }

    //3. Strategia 2 (zawsze zmiana wyboru)
    public static void alwayschange(int x){

        int win = 0;

        for (int i=0 ; i < x; i++ ){
            int prize = (int) (Math.random() * 3);
            int playerchoice = (int) (Math.random() * 3);
            if (playerchoice != prize) {
                win+=1;
            }
        }
        System.out.println("The probability of winning in 'always change' strategy is: " + (double) win/x);
    }

/*    public static void main(String[] args) {
        boolean[] gates = new boolean[3];   //false, false, false
        int prizeGateNo = (int)(Math.random() * 3);
        gates[prizeGateNo] = true;

        //[false, true, false]

        int userChoice = (int)(Math.random() * 3);

        //losujemy bramke do odrzucenia

        //strategia bez zmiany bramki
        //userChoice == prizeGateNo -> nonChangingWins++

        if(userChoice == prizeGateNo) {
            nonChangingWins++;
        }
    }*/

}
