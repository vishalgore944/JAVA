public class Emp 
{
    int id;
    String name;
    double sal;
    
    Emp()
    {
        System.out.println("No argument Constructor");
    }

    Emp(int id)
    {
        System.out.println("1 formal Argument");
    }

    Emp(int id, String name)
    {
        this(id);
        System.out.println("2 Formal argument");
    }

    Emp(int id,String name, double sal)
    {
        this(id,name);
        System.out.println("3 Formal argument");
    }

    public static void main(String[] args) 
    {
        System.out.println("MB");
        Emp ref=new Emp(10,"VISHAL",10.5);
        System.out.println(ref);
        System.out.println("ME");
    }
}