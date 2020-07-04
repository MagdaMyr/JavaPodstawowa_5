import java.util.Arrays;

public class Passing {

    public static void main(String[] args) {
        Point2ndQuarter p = new Point2ndQuarter(-10, 10);
        printAndSetToBeginning(p);
        System.out.println(p);

        int x = 7;
        printAndSetTo0(x);
        System.out.println(x);

        //String zachowuje sie tak jak typ prosty
        String toPrint = "hello world";
        printAndSetToName(toPrint, "Przemek");
        System.out.println(toPrint);

        Point2ndQuarter p1 = new Point2ndQuarter();
        Point2ndQuarter p2 = new Point2ndQuarter(-5, 5);
        Point2ndQuarter p3 = new Point2ndQuarter(-7, 7);
        Point2ndQuarter p4 = new Point2ndQuarter(-20, 10);

        Point2ndQuarter[] point2ndQuarters = {p1, p2, p3, p4};
        System.out.println("Przed wywolaniem metody: " + Arrays.toString(point2ndQuarters));
        printFailingPointsForIncreasing(point2ndQuarters, 10, 0);
        System.out.println("Po wywolaniu metody: " + Arrays.toString(point2ndQuarters));
    }

    //metoda operujace na typie referencyjnym
    public static void printAndSetToBeginning(Point2ndQuarter p) {
        System.out.println(p);
        p.setX(0);
        p.setY(0);
    }

    public static void printAndSetTo0(int x) {
        System.out.println(x);
        x = 0;
    }

    public static void printAndSetToName(String toPrint, String name) {
        System.out.println(toPrint);
        toPrint = name;
    }

    public static void printFailingPointsForIncreasing(Point2ndQuarter[] point2ndQuarters, double xInc, double yInc) {
        //chcemy jednak uchronic punkty przed modyfikacja, wiec dzialamy na ich kopii:
        //Arrays.copyOf robi kopie po referencji, chcemy kopie 'gleboka' - tzn nowe obiekty o takich samych wartosciach
        Point2ndQuarter[] pointsCopy = new Point2ndQuarter[4];
        for(int i = 0; i < point2ndQuarters.length; i++) {
            pointsCopy[i] = deepCopy(point2ndQuarters[i]);
        }

        for(Point2ndQuarter p : pointsCopy) {
            //for(int i = 0; i < points.length; i++) {
            p.setX(p.getX() + xInc);
            p.setY(p.getY() + yInc);
        }
        int pointsWithCoord0 = 0;
        for(Point2ndQuarter p : pointsCopy) {
            //for(int i = 0; i < points.length; i++) {
            if(isZero(p.getX()) || isZero(p.getY())) {
                pointsWithCoord0++;
            }
        }
        System.out.println("Number of failing points: " + pointsWithCoord0);
    }

    public static boolean isZero(double value) {
        return value >= -0.0000001 && value <= 0.0000001;
    }

    public static Point2ndQuarter deepCopy(Point2ndQuarter source) {
        Point2ndQuarter copy = new Point2ndQuarter();
        copy.setX(source.getX());
        copy.setY(source.getY());
        return copy;
    }

}