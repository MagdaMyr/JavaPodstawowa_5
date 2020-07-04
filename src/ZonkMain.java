public class ZonkMain {

    public static void main(String[] args) {

        int numberOfTests = Zonk.getNumberOfTests();

        Zonk test1 = new Zonk(numberOfTests, true);
        test1.runTheGame();
        test1.showProbabilityResults();

        Zonk test2 = new Zonk(numberOfTests, false);
        test2.runTheGame();
        test2.showProbabilityResults();
    }
}