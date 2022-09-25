//Here we used both actual and parameterized arguments thats why it is called as parameterized methods
package Methods.parameterized;

public class formalactualarguments 
{
    public static void add(int a, int b)
    {
        int c=a+b;
        System.out.println(c);    
    }
    public static void main(String args[]) 
    {
        add(30, 30);
        add(40, 90);
        add(40, 70);
    }    
}
