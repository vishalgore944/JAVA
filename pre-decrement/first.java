class first 
{
    public static void main(String[] args)
    {
        int a=99;
        int b=89;
        int c=100 - --b;
        a=--c;
        c= c + --b;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
    }    
}
