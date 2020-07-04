/* Zad. nr 4, slajd 55, preznetacja OOP
Wykorzystamy napisaną w ćwiczeniu #3 klasę Point, aby zdefiniować nową klasę Line, w której wykorzystamy ponownie
klasę Point, realizując tym samym kompozycję.
Zauważmy, że mówimy „Odcinek ma dwa punkty” – jest to relacja typu „ma” czy też „składa się z”
 */

public class Line {
    private Point begin, end;

    public Line(double x1, double y1, double x2, double y2) {
        begin = new Point(x1, y1);
        end = new Point(x2, y2);
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    @Override
    public String toString() {
        return String.format("Odcinek: [początek=%s, koniec=%s]", begin, end);
    }

    public double calcLength() {
        return end.distance(begin);
    }

    //getters & setters
    public Point getBegin() {
        return begin;
    }

    public double getBeginX() {
        return begin.getX();
    }

    public double getBeginY() {
        return begin.getY();
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setBeginX(double x) {
        this.begin.setX(x);
    }

    public void setBeginY(double y) {
        this.begin.setY(y);
    }

    public void setBeginXY(double x, double y) {
        this.begin.setXY(x, y);
    }

    public double[] getBeginXY() {
        return this.begin.getXY();
    }

    public Point getEnd() {
        return end;
    }

    public double getEndX() {
        return end.getX();
    }

    public double getEndY() {
        return end.getY();
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public void setEndX(double x) {
        this.end.setX(x);
    }

    public void setEndY(double y) {
        this.end.setY(y);
    }

    public void setEndXY(double x, double y) {
        this.end.setXY(x, y);
    }

    public double[] getEndXY() {
        return this.end.getXY();
    }
}
