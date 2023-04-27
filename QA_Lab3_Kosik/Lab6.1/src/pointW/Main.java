package pointW;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Конструктор");
        Mediana aa = new Mediana(1,1,1,1);//e. В базовом и производном классах создать конструкторы с параметрами.Продемонстрировать в конструкторе производного класса с параметрами вызов конструктора базового класса.
        aa.Display();

        System.out.println("Инициализация ");
        aa.Init(1, 2, 3, 10);

        double a = aa.get_dlina();
        System.out.println("Расстояние " + a);
        System.out.println("Замена");
        a = 1234;
        aa.put_dlina(a);
        aa.Display();

        aa.distance();
        aa.Display();
    }
}