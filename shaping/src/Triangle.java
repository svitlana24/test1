
public class Triangle extends Shape {
    private Point pA;
    private Point pB;
    private Point pC;

    public Triangle(Point pA, Point pB, Point pC) {
        this.pA = pA;
        this.pB = pB;
        this.pC = pC;
    }


    public Triangle() {
    }

    @Override
    public double getPerimeter() {
        double perimeter = pA.getDistansTo(pB)+pA.getDistansTo(pC)+ pB.getDistansTo(pC);
        return perimeter;
    }

    @Override
    public double getArea() {
        double p = getPerimeter()/2;
        double area = Math.sqrt(p*(p-pA.getDistansTo(pB))*(p-pA.getDistansTo(pC))*(p-pB.getDistansTo(pC)));
        return area;
    }




}
