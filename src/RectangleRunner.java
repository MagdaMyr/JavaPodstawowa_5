public class RectangleRunner {

    public static void main(String[] args) {
        Point a = new Point();  //ref = abcd
        Point b = new Point(5, 0);
        Point c = new Point(5, 5);
        Point d = new Point(0, 5);

        Rectangle rect = new Rectangle(a, b, c, d);
        System.out.println(rect);

        //teraz juz nie modyfikuje miejsca w pamieci dzieki utworzeniu deepCopy
        Point aRef = rect.getA();   //ref = abcd!!!
        aRef.setXY(-100, 100);

        System.out.println(rect);
    }

}