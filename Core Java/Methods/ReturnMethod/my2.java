public class my2 
{
    public static void main(String[] args) 
    {
        System.out.println("main begind");
        int res=add(10,20);
        System.out.println(res);
        System.out.println("Main ends");
    }
    
    public static int add(int a)
    {
        int c=a;
        return c;
    }
    
    public static int add(int a, int b)
    {
        int c=a+b;
        return c;
    }

    public static int add(int a, int b, int c)
    {
        int d=a+b+c;
        return d;
    }
}
