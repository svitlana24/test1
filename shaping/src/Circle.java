/**
 * Created by svitlana.merezhko on 01.11.16.
 */
public class Circle extends Shape{
    private Point center;
    private Point pointOnCircle;

    public Circle(Point center, Point pointOnCircle) {
        this.center = center;
        this.pointOnCircle = pointOnCircle;
    }

    public Circle() {
    }

    public Point getCenter() {
        return center;
    }

    public Point getPointOnCircle() {
        return pointOnCircle;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2*Math.PI*center.getDistansTo(pointOnCircle);
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = Math.PI*Math.pow(center.getDistansTo(pointOnCircle), 2);
        return area;
    }
}
