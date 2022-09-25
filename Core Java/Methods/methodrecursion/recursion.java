package methodrecursion;

public class recursion 
{
    public static void main(String[] args) 
    {
        System.out.println("Hii Hr");
        resume();    
    }    

    public static void resume() 
    {
        System.out.println("Pll give me job");
        resume();    
    }
}
