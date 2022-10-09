//Parameterzed Constructor
public class Spider3 
{
    int a=29;
    Spider3(int b, int c)
    {
        System.out.println(b);
        System.out.println(c);
        System.out.println("I am Constructor");
        System.out.println(this.a);
    }

    public static void main(String[] args) 
    {
        System.out.println("MB");
        Spider3 ref=new Spider3(10, 20);
        System.out.println("ME");
        System.out.println(ref.a);
    }
}
