//Method Overriding Non static MEthods
class Z1
{
    int a=10;
    public void Ashutosh() 
    {
        System.out.println("Hello Grandpaa");    
    }
}

class Z2 extends Z1
{
    int a=20;
    public void Ashutosh() 
    {
        System.out.println("Hello Dude");    
    }
}

class Z5
{
    public static void main(String[] args) 
    {
        Z1 ref1=new Z1();
        System.out.println(ref1.a);//10
        ref1.Ashutosh();

        Z2 ref2=new Z2();
        System.out.println(ref2.a);//10
        ref2.Ashutosh();

        Z1 ref3=new Z2();
        System.out.println(ref3.a); //10
        ref3.Ashutosh();

        Z2 ref4=(Z2) ref3;
        System.out.println(ref4.a);//20
        ref4.Ashutosh();
    }
}