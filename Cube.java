public class Cube {
    public static void main(String[] args)
    {
        Vector a = new Vector(0,0,0);
        Vector b = new Vector(1,0,0);
        Vector c = new Vector(0,1,0);
        Vector d = new Vector(1,1,0);
        Facet g = new Facet(a,b,c,d);
        g.Print(g);
    }
}
