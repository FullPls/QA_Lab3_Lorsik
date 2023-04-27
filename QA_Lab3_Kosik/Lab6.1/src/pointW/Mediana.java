package pointW;

public class Mediana extends Point{
    private double A;

    public double get_dlina() {
        return A;
    }

    public void put_dlina(double a)
    {
        A = a;
    }

    public Mediana()
    {
        super();
        A = 2;
    }
    public Mediana(int d, int e,int s,int a)
    {
        super(d,e,s);
        A = a;
    }
    public void Init(int x, int y, int z, int a)//d. Выполняется перегрузка функций Init, Display для производного класса с вызовом функции базового класса.
    {
        super.Init(x, y, z);
        A = a;
    }

    public void distance()//c. Метод базового класса перегружается для производного с учетом нового поля, при этом базовый  метод не вызывается, а доступ к полям базового класса обеспечивает  модификатор protected.
    {
        double a0 = Math.sqrt(x ^ 2 + y ^ 2 + z ^ 2);
        double dist0 = Math.abs(Math.abs(A / 2) - a0);
        System.out.printf("Расстояние от центра отрезка до 0 = %f \n", dist0);
    }
    public void Display()//d. Выполняется перегрузка функций Init, Display для производного класса с вызовом функции базового класса.
    {
        super.Display();
        System.out.printf("A = %f \n", A);
    }
}
