/*zadanie nr 3 (slajd 22 --> rysunki) z prezentacji OOP:
Klasa Point modeluje punkt na plaszczyznie w polozeniu (x, y). Posiada:
- dwa pola prywatne x i y
- konstruktory, gettery, settery
- metody setXY i getXY, pozwalajace operowac na dwoch polach jednoczesnie
- napisana metode toString()
- trzy przeciazone wersje metody distance
*/
/**
 * Punkty tej klasy mozna tworzyc tylko w II cw ukladu wspolrzednych
 * x <= 0, y >= 0
 */
/**
 * Punkty tej klasy mozna tworzyc tylko w II cw ukladu wspolrzednych
 * x <= 0, y >= 0
 */
public class Point {

    private double x, y;

    public Point() {

    }

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)", x, y);
    }

    public double[] getXY() {
        double[] tab = {x, y};
        return tab;
    }

    public void setXY(double x, double y) {
        setX(x);
        setY(y);
    }

    //odl od tego punktu do wsp x, y
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
    //odl od tego punktu do innego punktu
    public double distance(Point another) {
        return distance(another.getX(), another.getY());
    }
    //odl od tego punktu do poczatku ukl wsp (0, 0)
    public double distance() {
        return distance(0, 0);
    }

    public static Point deepCopy(Point source) {
        return new Point(source.getX(), source.getY());
    }

}
