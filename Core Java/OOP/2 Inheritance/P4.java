class P1
{
    
    {
        System.out.println("India is great");
    }
}

class P2 extends P1
{
    static String s="India's Capital is new delhi";
    
    {
        System.out.println("Prime minister of india is narendra modi");
    }
}

class P4
{
    static
    {
        System.out.println("India is 7th largest country by area");
    }
    public static void main(String[] args) 
    {
        System.out.println("MB");
        P2 ref=new P2();
        System.out.println(ref.s);
        System.out.println("ME");    
    }
}