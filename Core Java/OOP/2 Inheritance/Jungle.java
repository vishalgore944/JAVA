//Upcasting
class Animal
{
    int a=10;
}

class Monkey extends Animal
{
    int b=20;
}

class Jungle
{
    public static void main(String[] args) 
    {
        Animal ref1=new Monkey();
        System.out.println(ref1.a);
        
        // Monkey ref2=(Monkey) ref1; Down Casting
        // System.out.println(ref2.b); CTE
    }
}