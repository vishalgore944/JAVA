// Can we Create object of one class inside another class=> Yes
class question1
{
    public static void main(String[] args) 
    {
        System.out.println("Hello world");
        inter ref=new inter();
        ref.sub();
        System.out.println(ref);    
    }
}

class inter
{
    public static void sub()
    {
        System.out.println("Hiii");
    }
}