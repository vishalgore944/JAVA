/*
 use non static members inside a static context 
 by one way
 1> With the help of object
 */
public class red5
{
    int a=10;
    public static void main(String[] args) 
    {
        red5 ref=new red5();
        System.out.println(ref.a);    
    }
}
