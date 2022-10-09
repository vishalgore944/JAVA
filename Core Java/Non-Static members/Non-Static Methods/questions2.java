/* How to use static method inside non static context
1)Directly
2)With the help of class name
3)With the help of "this" reference 
*/
public class questions2 
{
    static int a=23;
    public void sonali()
    {
        System.out.println(a);
        System.out.println(questions2.a);
        System.out.println(this.a);
    }

    public static void main(String[] args) 
    {
        questions2 ref1=new questions2();
        ref1.sonali();    
    }
}
