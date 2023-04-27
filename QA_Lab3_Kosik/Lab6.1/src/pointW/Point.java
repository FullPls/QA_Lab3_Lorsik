package pointW;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Point {
    protected  int x;
    protected  int y;
    protected  int z;

    public void Init(int d, int e,int s)
    {
        x = d;
        y = e;
        z = s;
    }
    public Point()
    {
        x = 0;
        y = 0;
        z = 0;
    }
    public Point(int d, int e, int s)
    {
        x = d;
        y = e;
        z = s;
    }
    void Read()
    {
        Scanner imp=new Scanner(System.in);

        System.out.printf("введите x:");
        x=imp.nextInt();
        System.out.printf("введите y:");
        y=imp.nextInt();
        System.out.printf("введите z:");
        z=imp.nextInt();
    }
    void Display()
    {
        System.out.printf("x= %d y= %d z= %d \n", x, y, z);
    }

    void distance()
    {
        double a = sqrt(x ^ 2 + y ^ 2 + z ^ 2) ;
        System.out.printf("расстояние от начала координат %f \n",a);
    }
    public Point Add(Point a, Point b)
// Record Record:: первый Record–  тип возврата,  функция возвращает Record,
// второй Record:: - Add относится к классу Record
    {
        Point c = new Point();    // локальная переменная типа Record
        c.x = a.x + b.x;
        c.y = a.y + b.y;
        c.z = a.z + b.z;
        return c;              // функция возвращает объект класса Record
    }
}
