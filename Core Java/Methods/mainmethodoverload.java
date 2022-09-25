// Can we overload main method ye we can
class mainmethodoverload
{
    public static void main(String[] args) 
    {
        System.out.println("Hii");
        main(10);
        main(20,87);    
    }

    public static void main(int a) 
    {
        System.out.println(a);
    }

    public static void main(int a, int b) 
    {  
        System.out.println(a);
        System.out.println(b);    
    }
}