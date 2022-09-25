class fourth 
{
    public static void main(String[] args)
    {
        int a=90;
        int b=100;
        a++;
        b=++a;
        a=100 + b++;
        b++;
        b=a++;
        int c=++a + b++;
        System.out.println("a: " +a);
        System.out.println("b: "+b);
        System.out.println("c: " +c);
    }    
}
