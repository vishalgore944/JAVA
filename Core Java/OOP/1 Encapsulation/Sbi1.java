class ATM
{
    /*private=>CTE */ double Money=98000; //States
    public void withdraw() //Behaviours
    {
        System.out.println("Successfull transaction");
    }

    public void deposite() //Behaviours
    {
        System.out.println("Enter the amount");
    }
}

//Driver class

class Sbi1
{
    public static void main(String args []) 
    {
        ATM ref=new ATM();
        System.out.println(ref.Money);
        ref.deposite();
        ref.withdraw(); 
    }
}