public class Spider4 
{
    int a=29;
    Spider4()
    {
        System.out.println("No argument Constructor");
    }
    
    Spider4(int a)
    {
        System.out.println("1 Formal argument Constructor");
        System.out.println(a);
    }
    
    Spider4(int b, int c)
    {
        System.out.println("2 Formal argument Constructor");
        System.out.println(b);
        System.out.println(c);
    }

    Spider4(int d, int e, int f)
    {
        System.out.println("3 Formal argument Constructor");
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

    public static void main(String[] args)
    {
        Spider4 ref1=new Spider4();
        Spider4 ref2=new Spider4(12);
        Spider4 ref3=new Spider4(91,20);
        Spider4 ref4=new Spider4(43,55,88);
        System.out.println("End Constructors");

        System.out.println(ref1.a);
        System.out.println(ref2.a);
        System.out.println(ref3.a);
        System.out.println(ref4.a);
    }
}
