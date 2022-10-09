/* Static members inside a static context
in 3 ways
1> Directly
2> With the help of class name
3> By using object references
*/
class red4
{
    static int a=10;
    public static void main(String[] args) 
    {
           int a=20;
            System.out.println(a); //preference is given to local area
            System.out.println(red4.a); //calling a class static area using class name
    }
}