package Lab6_2;

public class Jewerely_store extends Jawel {
   private String name;
    private Jawel a = new Jawel();
    private Jawel b = new Jawel();
    public void Init(String n, int v1, int c1)
    {
        name = n;
        super.Init(v1, c1);
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
