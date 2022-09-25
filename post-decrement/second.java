class second 
{
    public static void main(String[] args)
    {
        int a=99;
        int b=--a + 2;
        int c=++b - 12;
        a=--b + c--;
        b=++a - c;
        int d=++a + c-- - b++;
        d=--a + c++ - b--;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
    }    
}
