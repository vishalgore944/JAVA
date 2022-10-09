public class insta 
{
    String un;
    public static void main(String[] args) 
    {
        insta ref1=new insta(); //Created objects to store each name and also address is saved inside a ref1
        insta ref2=new insta();
        insta ref3=new insta();
        insta ref4=new insta();
        ref1.un="VISHAL"; //ref1 is storing data
        ref2.un="SANDEEP";
        ref3.un="ASHUTOSH";
        ref4.un="SHREYASH";
        System.out.println(ref1.un); //printing ref1
        System.out.println(ref2.un);
        System.out.println(ref3.un);
        System.out.println(ref4.un); 
    }    
}

/*
 OUTPUT
 VISHAL
SANDEEP
ASHUTOSH
SHREYASH
 */