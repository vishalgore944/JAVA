class examplestatic
{
    static int a=10;
    public static void main(String[] args) 
    {
        int a=20;
        System.out.println(examplestatic.a); //Printing static variable in local method
        System.out.println(a);   //Printing a local variable 
    }
}