public class thiskeyword 
{
    public void sonali()
    {
        System.out.println(this);
    }    

    public static void main(String[] args) 
    {
        thiskeyword ref1=new thiskeyword();
        System.out.println(ref1);
        thiskeyword ref2=new thiskeyword();
        System.out.println(ref2);
        ref1.sonali();
        ref2.sonali();    
    }
}
