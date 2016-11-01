import java.lang.reflect.Array;

/**
 * Created by svitlana.merezhko on 01.11.16.
 */
public class Board {
    private Shape[] whiteboard = new Shape[4];

    public Board() {
    }
    
    public void addShape(Shape shape, int i){
        if (whiteboard[i] == null){
            whiteboard[i] = shape;
            System.out.println(shape.getClass().getName() + " was added on sub-board " + i);
        }

        else System.out.println("Sub-board " + i +" already has a shape on it. Please select another sub-board");
    }

    public void clearBoard(int i){
        whiteboard[i]=null;
        System.out.println(String.format("Sub-board %s is clear!", i));
    }

    public void getBoardInformation(){
        double perimeter = 0;
        double area = 0;
        System.out.println();
        System.out.println("!!!! General board information:");

        for (int i=0; i<whiteboard.length; i++){
            if (whiteboard[i]==null){
                System.out.println(String.format("Sub-board %s is empty", i));
            }
            else {
                perimeter += whiteboard[i].getPerimeter();
                area += whiteboard[i].getArea();
                System.out.println(String.format("Sub-board %s has a ", i) + whiteboard[i].getClass().getName());
            }
        }
        System.out.println();
        System.out.println("Total area of all shapes is " + area);
        System.out.println("Total perimeter of all shapes is " + perimeter);

    }
    

}
