class six 
{
    public static void main(String[] args)
    {
        int a=10;
        int b=13;
        int c=++a + b++;
        int d=++b - ++c;
        int e=d++ + ++a;
        a=++b + 50;
        e=a+b+ ++d;
        e++;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
        System.out.println("e: "+e);
    }    
}