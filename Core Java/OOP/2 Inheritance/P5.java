//Super calling statement

class P0
{
    P0()
    {
        System.out.println("This is Superrrrr classss Constructor");
    }
}

class P1 extends P0
{
    P1()
    {
        super();
        System.out.println("This is Super class constructor");
    }
}

class P2 extends P1
{
    P2()
    {
        super();
        System.out.println("Sub class constructor");
    }
}

class P5
{
    public static void main(String[] args) 
    {
        System.out.println("MB");
        P2 ref=new P2();
        System.out.println("ME");    
    }
}