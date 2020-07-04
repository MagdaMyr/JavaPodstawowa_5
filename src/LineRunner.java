public class LineRunner {
        public static void main(String[] args) {
            Point p1 = new Point();
            Point p2 = new Point(10, 10);
            Line l = new Line(p1, p2);
            System.out.println(l);  //toString
            System.out.println("Dlugosc linii wynosi: " + l.calcLength());
        }
}
