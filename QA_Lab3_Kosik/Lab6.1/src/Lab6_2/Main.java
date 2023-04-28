package Lab6_2;
import Lab6_2.Jewerely_store;
import Lab6_2.New_b_class;
import Lab6_2.Jawel;
public class Main {
    public static void main(String[] args) {
        New_b_class  bb = new New_b_class ();
        bb.Init("Shiny", 100, 100, 300, 300);
        bb.Display();
        System.out.println("Удвоенная сумма: " + bb.summary_cost( ));
    }
}
