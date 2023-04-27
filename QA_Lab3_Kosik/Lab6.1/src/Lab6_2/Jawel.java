package Lab6_2;

public class Jawel {
    protected int weight = 0;
    protected int cost = 0;
    public void Init(int weight1, int cost1)
    {
        weight = weight1;
        cost = cost1;
    }
    public void Display()
    {
        System.out.println("Вес изделия = "+ weight);
        System.out.println("Цена изделия за грамм = "+ cost);
    }
    public int jawel_cost()
    {
        return (weight * cost);
    }
}
