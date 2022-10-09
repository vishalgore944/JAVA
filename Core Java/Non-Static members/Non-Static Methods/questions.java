/* How to use non static members inside non static context
1)Directly
2)With help of this reference
*/

public class questions
{
    int a=23;
    public void sonali()
    {
        System.out.println(a);
        System.out.println(this.a);
    }
    public static void main(String[] args) 
    {
        questions ref1=new questions();
        ref1.sonali();    
    }
}
