package Methods;

public class calculator2 
{
    public static void add()
    {
        int a=10,b=20,c=60;
        int d=a+b+c;
        System.out.println(d);
    }
    
    public static void sub()
    {
        int a=100,b=25;
        int d=a-b;
        System.out.println(d);
    }

    public static void mul()
    {
        int a=2,b=2,c=6,e=3,f=5;
        int d=a*b*c*e*f;
        System.out.println(d);
    }

    public static void div()
    {
        int a=500,b=20;
        int d=a/b;
        System.out.println(d);
    }

    public static void main(String args[])
    {
        add();
        sub();
        mul();
        div();
    }
}
