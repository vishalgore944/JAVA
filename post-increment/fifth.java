class fifth 
{
    public static void main(String[] args)
    {
        int a=198;
        int b=a++ + 90;
        int c=a++ + b++;
        int d=a++ - b;
        d=a + ++c;
        c=b-a;
        d=100 + b++;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
    }    
}
