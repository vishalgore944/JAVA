class second 
{
    public static void main(String[] args)
    {
        int e=234;
        int a=123;
        --a;
        e=--a + 12;
        int s=34;
        int y=s + --e;
        --y;
        System.out.println("e: "+e);
        System.out.println("s: "+s);
        System.out.println("y: "+y);
        System.out.println("a: "+a);   
    }    
}
