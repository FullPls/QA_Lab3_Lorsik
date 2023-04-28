package Lab6_2;

public class New_b_class {
    private String name;
    private Jawel S = new Jawel();
    private Jewerely_store  R = new Jewerely_store ();
    public void Init(String n, int v1, int c1, int v2, int c2)
    {
        name = n;
        S.Init(v2, c2);
        R.Init(n, v1, c1, /*v2, c2,*/ x1, y1);
    }
    public void Display()
    {
        R.Display();
        S.Display();
    }
    public int summary_cost()
    {
        return (R.jawel_cost() + S.jawel_cost())*2 ;
    }
}
