package Methods;

public class calculator 
{

public static void add(int a, int b, int c, int d, int e)
{
    int z=a+b+c+d+e;
    System.out.println(z);
}

public static void add(int a, int b)
{
    int z=a+b;
    System.out.println(z);
}

public static void sub(int a, int b)
{
    int z=a-b;
    System.out.println(z);
}

public static void mul(int a, int b, int c)
{
    int z=a*b*c;
    System.out.println(z);
}

public static void mul(int a, int b)
{
    int z=a*b;
    System.out.println(z);
}

public static void sub(int a, int b, int c)
{
    int z=a-b-c;
    System.out.println(z);
}

 public static void main(String args[])
 {
    add(10,10,10,10,10);
    add(10,10);
    sub(100,10);
    mul(2,2,4);
    mul(200, 10);
    sub(10000,500,9000);
 }   

}