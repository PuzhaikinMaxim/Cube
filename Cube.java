public class Cube {
    public Cube(/*Facet f1, Facet f2, Facet f3, Facet f4, Facet f5, Facet f6*/)
    {
        Facet[] Facets = new Facet[6];
        Facets[0] = new Facet(new Vector(0,0,0), new Vector(1,0,0), new Vector(0,1,0), new Vector(1,1,0));
        Facets[1] = new Facet(new Vector(1,1,0), new Vector(1,1,1), new Vector(0,1,0), new Vector(0,1,1));
        Facets[2] = new Facet(new Vector(1,0,0), new Vector(1,0,1), new Vector(0,0,1), new Vector(0,0,0));
        Facets[3] = new Facet(new Vector(1,0,1), new Vector(1,1,1), new Vector(0,0,1), new Vector(0,1,1));
        Facets[4] = new Facet(new Vector(0,0,0), new Vector(0,0,1), new Vector(0,1,1), new Vector(0,1,0));
        Facets[5] = new Facet(new Vector(1,0,1), new Vector(1,0,0), new Vector(1,1,0), new Vector(1,1,1));
    }
    public void print()
    {
        double x;
        double y;
        double z;
        for(int i = 0; i < 6; ++i)
        {

        }
    }
}
