class Dhirubhai
{
    String Company="Reliance";
    String Company2="Jio";
    public void thinkingstyle()
    {
        System.out.println("Think big, think fast, think ahead");
    }

    public void speakingstyle() 
    {
        System.out.println("If you don't build your dream, someone else will hire you to help them build theirs");    
    }
}

class Mukesh extends Dhirubhai
{

}

class Gujrat
{
    public static void main(String[] args) 
    {
        Mukesh ref=new Mukesh();
        ref.thinkingstyle();
        ref.speakingstyle();

        System.out.println("                                                                                  ");
        System.out.println(ref.Company);
        System.out.println(ref.Company2);
    }
}