/**
 * Created by svitlana.merezhko on 31.10.16.
 */
public class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public  double getDistansTo(Point a){
        double length = Math.sqrt(Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.y, 2));
        return length;

    }


}
