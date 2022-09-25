import javax.lang.model.util.ElementScanner14;

class grades 
{
    public static void main(String[] args)
    {
        int a=75;
        if(a<=100 && a>=80)
        {
           System.out.println("Excellent");       
        }
        else if(a<=80 && a>=70)
        {
            System.out.println("Great");
        }
        else if(a<=60 && a>=50)
        {
            System.out.println("Good");
        }
        else if(a<=40 && a>=35)
        {
            System.out.println("Passed");
        }
        else if(a<=35)
        {
            System.out.println("Failed");
        }
        else 
        {
            System.out.println("Invalid markes entered");
        }
    }
}
