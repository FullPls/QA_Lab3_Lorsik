package Lab6_2;

public class Jewerely_store extends Jawel {
   private String name;
    private Jawel a = new Jawel();
    private Jawel b = new Jawel();
    private int x;
    private int y;
    public void Init(String n, int v1, int c1, int x1, int y1)
    {
        name = n;
        super.Init(v1, c1);
        x = x1;
        y = y1;
    }
    public void Display()
    {
        System.out.println("Название магазина " + name);
        super.Display();
    }
    public int jawel_cost()
    {
        return weight*cost;
    }
}