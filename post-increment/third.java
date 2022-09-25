class third 
{
    public static void main(String[] args)
    {
        int a=80;
        int b=100;
        int c=a++ - 65;
        int d=150 - b++;
        a=b++;
        b=c++ - 1;
        d=a++ + 4;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
    }    
}
