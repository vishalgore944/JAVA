public class printfactorsfrom1to10 
{
    public static void main(String[] args) 
    {
        for(int n=1;n<=10;n++)
        {
            int prod=1;
            for(int i =1;i<=n;i++)
            {
                prod=prod*i;
            }
            System.out.println(n+ " !="+prod);
        }
    }    
}
