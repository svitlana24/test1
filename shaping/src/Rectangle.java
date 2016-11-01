/**
 * Created by svitlana.merezhko on 01.11.16.
 */
public class Rectangle extends Shape {
    private Point pA, pB, pC, pD;

    public Rectangle() {
    }

    public Rectangle(Point pA, Point pB, Point pC, Point pD) {

        this.pA = pA;
        this.pB = pB;
        this.pC = pC;
        this.pD = pD;
    }

    @Override
    public double getPerimeter() {
        double perimeter = pA.getDistansTo(pB)+pB.getDistansTo(pC)+pC.getDistansTo(pD)+pD.getDistansTo(pA);
        return perimeter;
    }

    @Override
    public double getArea() {
        double p = getPerimeter()/2;
        double area = Math.sqrt((p-pA.getDistansTo(pB))*(p-pB.getDistansTo(pC))*(p-pC.getDistansTo(pD))*(p-pD.getDistansTo(pA)));
        return area;
    }
}
