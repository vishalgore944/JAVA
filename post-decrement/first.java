class first 
{
    public static void main(String[] args)
    {
        int a=90;
        int b=60;
        int c=30;
        a=--b + c--;
        b=++a - --c;
        ++c;
        c++;
        a--;
        --a;
        b=a + c++;
        a=c-- + 1;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        }    
}
