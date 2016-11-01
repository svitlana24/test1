/**
 * Created by svitlana.merezhko on 31.10.16.
 */
public class Main {
    public static void main(String[] args){

        Triangle ABC = new Triangle(new Point(1, 3), new Point(1, 6), new Point(3, 7));
        System.out.println(ABC.getPerimeter());
        System.out.println(ABC.getArea());

        Circle NewCircle = new Circle(new Point(1,3), new Point(1,6));
        System.out.println(NewCircle.getPerimeter());
        System.out.println(NewCircle.getArea());

        Rectangle ABCD = new Rectangle(new Point(0,0), new Point(2,0), new Point(2,2), new Point(0,2));
        System.out.println(ABCD.getPerimeter());
        System.out.println(ABCD.getArea());

        Board newBoard = new Board();
        newBoard.addShape(ABC, 1);
        newBoard.addShape(ABCD, 1);
        newBoard.clearBoard(1);
        newBoard.addShape(ABCD, 1);
        newBoard.addShape(ABCD, 2);
        newBoard.addShape(ABC,0);
        newBoard.addShape(NewCircle,3);


        newBoard.getBoardInformation();





    }
}
