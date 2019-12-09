public class Facet {
    private Vector[] vertex;
    //Color color;
    public double angle;
    public Facet(Vector a, Vector b, Vector c, Vector d) {
        vertex = new Vector[]{a, b, c, d};
    }

    /*public Facet Rotate(Facet g) {

        return new Facet();
    }*/
    public void rotate(double angleX, double angleY, double angleZ) {
        rotateOX(angleX);
        rotateOY(angleY);
        rotateOZ(angleZ);
    }
    public void rotateOX(double angle){
        vertex[0].rotateOX(angle);
        vertex[1].rotateOX(angle);
        vertex[2].rotateOX(angle);
        vertex[3].rotateOX(angle);
    }
    public void rotateOY(double angle){
        vertex[0].rotateOY(angle);
        vertex[1].rotateOY(angle);
        vertex[2].rotateOY(angle);
        vertex[3].rotateOY(angle);
    }
    public void rotateOZ(double angle){
        vertex[0].rotateOZ(angle);
        vertex[1].rotateOZ(angle);
        vertex[2].rotateOZ(angle);
        vertex[3].rotateOZ(angle);
    }
    public void this_rotate(Facet a)
    {
        a.rotate(1,2,3);
        double x;
        double y;
        double z;
        for(int i = 0; i < 4; ++i)
        {
            x = vertex[0].GetX(vertex[i]);
            y = vertex[0].GetY(vertex[i]);
            z = vertex[0].GetZ(vertex[i]);
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
        }
    }
}