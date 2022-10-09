public class red3 
{
    int a=10;   
    public static void main(String[] args) 
    {
        red ref=new red(); //New object created and address of that object is saved inside a ref variable
        System.out.println(ref); //Object address saved in ref is printed
        System.out.println(ref); //Object address saved in ref is printed
        System.out.println(ref); //Object address saved in ref is printed
        red ref1=new red();
        System.out.println(ref1); //This is second object created and store inside a ref1
    }    
}


/*
 o/p: 
red@3fee733d
red@3fee733d
red@3fee733d
red@5acf9800 */