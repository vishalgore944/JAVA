class checkcharacter
{
    public static void main(String args[])
    {
        char ch='+';
        if(ch>='A' && ch<='Z')
        {
            if((ch=='A') || (ch=='E') || (ch=='I') || (ch=='O') || (ch=='U'))
            {
                System.out.println("Entered character is uppercase vowel");
            }
            else
            {
                System.out.println("Entere character is uppercase consonant");
            }
        }
        else if(ch>='a' && ch<='z')
        {
            if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u'))
            {
                System.out.println("Entered character is lowercase vowel");
            }
            else
            {
                System.out.println("Entere character is lowercase consonant");
            }
        }
        else if(ch>='0' && ch<='9')
        {
         System.out.println("Entere character is number");
        }
        else
        {
            System.out.println("Entere character is special character");
        }       
    }
}