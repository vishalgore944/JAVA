// TO print private data we use get method
class ATM
{
    private double Money=98000; //States
    // public void withdraw() //Behaviours
    // {
    //     System.out.println("Successfull transaction");
    // }

    // public void deposite() //Behaviours
    // {
    //     System.out.println("Enter the amount");
    // }void

    public double getMoney() //Get method to get private
    {
        return Money;
    }

    public void setMoney()
    {

    } 
}

//Driver class

class Sbi2
{
    public static void main(String args []) 
    {
        ATM ref=new ATM(); // Object created for ATM class
        System.out.println(ref.getMoney()); //Get method calling statement TO get private data
        // ref.deposite();
        // ref.withdraw(); 
    }
}