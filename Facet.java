public class Facet {
    private Vector[] vertex;
    //Color color;
    public int angle;
    public Facet(Vector a, Vector b, Vector c, Vector d)
    {
        vertex = new Vector[] {a,b,c,d};
    }
    public Facet Rotate(Facet g)
    {

        return new Facet(a,b,c,d);
    }
    public void Print(Facet a)
    {
        for(int i = 0;i < 4; ++i)
        {
            double x;
            double y;
            double z;
            x = vertex[i].GetX(vertex[i]);
            y = vertex[i].GetY(vertex[i]);
            z = vertex[i].GetZ(vertex[i]);
            /*System.out.print(x);
            System.out.print(" ");
            System.out.print(y);
            System.out.print(" ");
            System.out.print(z);
            System.out.println("");*/
            System.out.print("Координаты начала:" + vertex[0].GetX(vertex[0]) + " " + vertex[0].GetY(vertex[0]) + " " + vertex[0].GetZ(vertex[0]));
            System.out.print("Координаты конца" + ver);
        }
    }
}
