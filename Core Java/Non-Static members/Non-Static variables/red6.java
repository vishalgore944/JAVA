public class red6 
{
    static int a=10;
    public static void main(String[] args) 
    {
        red6 ref=new red6();
        System.out.println(a);
        System.out.println(ref);
        System.out.println(ref.a); //Here a is in CSA and every object pointing towards the CSA
    }    
}
