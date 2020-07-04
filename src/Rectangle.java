public class Rectangle {
    private Point a, b, c, d;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    public Point getA() {
        return Point.deepCopy(a);
    }

    public Point getB() {
        return Point.deepCopy(b);
    }

    public Point getC() {
        return Point.deepCopy(c);
    }

    public Point getD() {
        return Point.deepCopy(d);
    }
}

