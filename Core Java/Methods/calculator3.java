public class calculator3
{
    public static void add(int a, int b, int c, int o, int e)
    {
        int d=a+b+c+o+e;
        System.out.println(d);
    }
    
    public static void add(int a, int b)
    {
        int d=a+b;
        System.out.println(d);
    }

    public static void sub(int a, int b)
    {
        int d=a-b;
        System.out.println(d);
    }

    public static void mul(int a, int b, int c)
    {
        int d=a*b*c;
        System.out.println(d);
    }

    public static void mul(int a, int b)
    {
        int d=a*b;
        System.out.println(d);
    }

    public static void sub(int a, int b, int c)
    {
        int d=a-b-c;
        System.out.println(d);
    }

    public static void main(String args[])
    {
        add(10,10,10,10,10);
        add(12,2);
        sub(20,2);
        mul(2,5,3);
        mul(3,5);
        sub(500,8,2);
    }
}
