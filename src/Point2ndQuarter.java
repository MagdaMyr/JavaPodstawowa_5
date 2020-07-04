/**
 * Punkty tej klasy mozna tworzyc tylko w II cw ukladu wspolrzednych
 * x <= 0, y >= 0
 */
public class Point2ndQuarter {
        private double x, y;

        public Point2ndQuarter() {
        }

        public Point2ndQuarter(double x, double y) {
            setX(x);
            setY(y);
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            if(x <= 0)
                this.x = x;
            else {
                System.out.printf("Wartosc wspolrzednej x zostala zmodyfikowana na: 0 zamiast %f. x moze przyjmowac wartosci <= 0\n", x);
                this.x = 0;
            }
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            if(y >= 0)
                this.y = y;
            else
                System.out.printf("Wartosc wspolrzednej y nie zostala zmodyfikowana na: %f. y moze przyjmowac wartosci >= 0\n", y);
        }

        @Override
        public String toString() {
            return String.format("(%f, %f)", x, y);
        }

        public double[] getXY() {
            double[] tab = {x, y};
            return tab;
        }

        public void setXY(int x, int y) {
            setX(x);
            setY(y);
        }

        //odl od tego punktu do wsp x, y
        public double distance(double x, double y) {
            return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        }
        //odl od tego punktu do innego punktu
        public double distance(Point2ndQuarter another) {
            return distance(another.getX(), another.getY());
        }
        //odl od tego punktu do poczatku ukl wsp (0, 0)
        public double distance() {
            return distance(0, 0);
        }
}
