import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
/*        //explicite
        Point p1 = new Point();
        String pointData = p1.toString();
        System.out.println(pointData);

        //implicite
        //konkatenacja
        String text = "Byl sobie punkt o parametrach " + p1 + " i cos tam, cos tam...";
        System.out.println(text);
        //przekazac do metody przyjmujacej parametr typu String
        System.out.println(p1);*/

        Point2ndQuarter p0 = new Point2ndQuarter(); //tworzy punkt umieszczony w poczatku ukl wsp
        Point2ndQuarter p1 = new Point2ndQuarter(5, -5);    //nie przejdzie przez settery, zostanie punkt 0, 0
        Point2ndQuarter p2 = new Point2ndQuarter(-5, 5);
        System.out.printf("Odleglosc pomiedzy punktami %s a %s wynosi %f\n",
                p2, p0, p2.distance(p0));   //p2.distance(p0.getX(), p0.getY())
        System.out.printf("Odeglosc pomiedzy punktem %s a poczatkiem ukladu wspolrzednych wynosi %f\n",
                p2, p2.distance());
        Point2ndQuarter p3 = new Point2ndQuarter(-13, 17);
        System.out.printf("Odleglosc pomiedzy punktami %s a %s wynosi %f\n",
                p3, p2, p3.distance(p2));   //p3.distance(0, 0)

        //java.util.Arrays.toString(arr) pozwala wydrukowac 'ladnie' tablice
        System.out.println(Arrays.toString(p1.getXY()));

        OOPConcepts oopConcepts = new OOPConcepts();
        oopConcepts.packagePrivateMethod();
        oopConcepts.pubMethod();

        //PrivateConstructor pc = new PrivateConstructor();
    }
}

