/**
 * Created by svitlana.merezhko on 27.10.16.
 */
public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3d() {
    }

    public static Vector3d addVectors(Vector3d a, Vector3d b) {
        return new Vector3d(a.x + b.x, a.y + b.y, a.z + b.z );
    }


    public static Vector3d multiplyVectors(Vector3d a, Vector3d b) {
//a × b = {aybz - azby; azbx - axbz; axby - aybx}
        return new Vector3d(a.y * b.z - a.z * b.y, a.z * b.x - a.x * b.z, a.x * b.y - a.y * b.x);
    }


    public static double multiplyVectorsScalar(Vector3d a, Vector3d b) {
        return a.x * b.x + a.y * b.y + a.z * b.z;

    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
