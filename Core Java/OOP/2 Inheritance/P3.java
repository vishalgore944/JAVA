class P1
{
    static
    {
        System.out.println("India is great");
    }
}

class P2 extends P1
{
    static String s="I love india";
    static
    {
        System.out.println("India has biggest democracy");
    }
}

class P3
{
    static
    {
        System.out.println("India has 28 states");
    }
    public static void main(String[] args) 
    {
        System.out.println("MB");
        P2 ref=new P2();
        System.out.println(ref.s);
        System.out.println("ME");    
    }
}