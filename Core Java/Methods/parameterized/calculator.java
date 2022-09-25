package Methods.parameterized;

public class calculator 
{
    public static void add(int a, int b) 
    {
        int c=a+b;
        System.out.println(c);    
    }

    public static void sub(int a, int b) 
    {
        int c=a-b;
        System.out.println(c);    
    }

    public static void mul(int a, int b, int c) 
    {
        int d=a*b*c;
        System.out.println(d);    
    }

    public static void div(int a, int b) 
    {
        int c=a/b;
        System.out.println(c);    
    }

    public static void main(String args[]) 
    {
        add(20, 40);
        sub(50, 10);
        mul(2, 2, 2);
        div(60, 3);
    }
}
