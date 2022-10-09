public class Spider5 
{
    int a;
    
    Spider5(int b)
    {
        this.a=b;
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) 
    {
        System.out.println("MB");
        Spider5 ref=new Spider5(56);
        System.out.println(ref.a);
        System.out.println("ME");    
    }
}   
