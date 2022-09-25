public class prodofoddnumb 
{
    public static void main(String args[])
    {
        int prod=1;
        for(int a=1;a<=6;++a)
        {
            if(a%2!=0)
            {
                prod=prod*a;
            }
        }
        System.out.println(prod);
    }    
}
