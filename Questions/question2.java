class inter 
{
    static int a=10;
    int b=25;

    public static void add() 
    {
        System.out.println("Hii Sandeep");    
    }    
}

class question2
{
    public static void main(String[] args) 
    {
        System.out.println("MB");
        inter ref1=new inter();
        System.out.println(ref1.a);
        System.out.println(ref1.b);
        ref1.add();

        inter2 ref2=new inter2();
        ref2.sub();
    }
}

class inter2
{
    
    public static void sub() 
    {
        System.out.println("New world");    
    }
}