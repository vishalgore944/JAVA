public class Spider2 
{
     int a=29;
     Spider2()
     {
        //PLI (Pre loading instructions)
        //IIB (Instance initializer block)
        //UWS (User written statements)
        System.out.println("I am constructor");
     }
     public static void main(String[] args) 
     {
        System.out.println("MB");
        Spider2 ref=new Spider2();
        System.out.println("ME");

        System.out.println(ref.a);
     }

     
     {
        System.out.println("IIB");
     }     
}
