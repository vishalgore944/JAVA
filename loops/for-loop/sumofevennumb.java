public class sumofevennumb
{
    public static void main(String args[])
    {
        int sum=0;
        for(int a=10; a<=40;++a)
        {
            if(a%2==0)
            {
                sum=sum+a;
            }
        }
        System.out.println(sum);
    }
}
