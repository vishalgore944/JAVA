//Odd from 100 - 1

public class findoddnumber
{
    public static void main(String args[])
    {
        int a=100;
        while(a>=1)
        {
            if(a%2!=0)
            {
                System.out.println(a);
            }
            --a;
        }
    }   
}
