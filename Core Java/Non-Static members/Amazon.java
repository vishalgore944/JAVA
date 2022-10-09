class Amazon
{
    static int a;
    int b;

    static
    {
        System.out.println("SIB1");
    }

    {
        System.out.println("IIB1");
    }

    public static void add()
    {
        System.out.println(a);
        int a=10;
    }

    public void sub()
    {
        System.out.println("Non static block");
        this.a=20;
        System.out.println(a);
        System.out.println(this.b);
        Amazon ref2=new Amazon();
        this.b=89;
        System.out.println(b);
        System.out.println(ref2.a);
    }

    static
    {
        System.out.println("SIB2");
        add();
    }

    public static void main(String args[])
    {
        int b=25;
        int a=10;
        System.out.println("Hello world");
        Amazon ref1=new Amazon();
        ref1.sub();
        System.out.println(ref1.b);
    }

    {
        System.out.println("Hiii");
    }

}