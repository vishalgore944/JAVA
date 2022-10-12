// TO print private data or access private datawe use get method
// TO set or modify the private data we use set method
class ATM
{
    private double Money=98000; //States
 
    public double getMoney() //Get method to get private
    {
        return Money;
    }

    public void setMoney(double b) //Set methohd to set or modify the private data
    {
        this.Money=b;
    } 
}

//Driver class

class Sbi3
{
    public static void main(String args []) 
    {
        ATM ref=new ATM(); // Object created for ATM class
        System.out.println(ref.getMoney()); //Get method calling statement TO get private set
        ref.setMoney(120000);
        System.out.println(ref.getMoney());
    }
}