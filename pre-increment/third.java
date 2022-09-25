class third 
{
    public static void main(String[] args)
    {
        int s=100;
        int u=++s;
        int r=++u + 20;
        int a=++r;
        int j=++s;
        s=++a - 26;
        u=45 + ++j;
        ++r;
        ++j;
        System.out.println("a: " +a);
        System.out.println("j: " +j);
        System.out.println("s: " +s);
        System.out.println("r: " +r);
        System.out.println("u: " +u);
    }   
}
