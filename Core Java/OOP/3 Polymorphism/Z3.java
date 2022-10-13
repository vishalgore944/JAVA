//Variable Shadowing
class Z1
{
    int a=10;
}

class Z2 extends Z1
{
    int a=20;
}

class Z3
{
    public static void main(String[] args) 
    {
        // Z1 ref1=new Z1();
        // System.out.println(ref1.a);//10
        
        // Z2 ref2=new Z2();
        // System.out.println(ref2.a);//10

        Z1 ref3=new Z2();
        System.out.println(ref3.a); //10

        Z2 ref4=(Z2) ref3;
        System.out.println(ref4.a);//20
    }
}