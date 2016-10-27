/**
 * Created by svitlana.merezhko on 27.10.16.
 */
public class Main {
    public static void main(String[] args) {

        Vector3d a = new Vector3d(2,3,4);
        Vector3d b = new Vector3d(4,5,6);
        System.out.println(Vector3d.multiplyVectorsScalar(a,b));
        System.out.println(Vector3d.multiplyVectors(a,b));
        System.out.println(Vector3d.addVectors(a,b));

    }

}
