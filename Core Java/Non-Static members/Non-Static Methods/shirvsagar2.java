public class shirvsagar2 
{
    int a=10;
    public void sonali()
    {
        System.out.println(a); //directly print a both are non static
    }

    public static void main(String[] args) 
    {
        shirvsagar2 ref= new shirvsagar2();
        ref.sonali();    
    }
}