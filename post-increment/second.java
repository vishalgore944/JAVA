class second 
{
    public static void main(String[] args)    
    {
        int a=50;
        int b=a++ - 2;
        int c=b++ - a++;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
    }   
}
