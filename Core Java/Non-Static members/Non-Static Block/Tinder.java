class Tinder
{
    {
        System.out.println("Koii nhi millgii"); //Non static blocks
    }

    {
        System.out.println("Koi to mill jatti"); //Non static blocks
    }

    public static void main(String[] args) 
    {
        System.out.println("Koi hai kyaa");    
        Tinder ref=new Tinder(); //When we created this object all the non static block executes
        System.out.println("Koi nahi milla bhai");
    }
}