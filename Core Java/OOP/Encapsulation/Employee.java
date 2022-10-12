class Emp 
{
    int id;
    String name;
    private double Salary;

    public double getSalary() 
    {
        return Salary;    
    }

    Emp(int id,String name,double Salary)
    {
        this.id=id;
        this.name=name;
        this.Salary=Salary;
    }
}

class Employee
{
    public static void main(String[] args) 
    {
        Emp ref1=new Emp(001,"Vishal",56000);
        Emp ref2=new Emp(002,"Sandeep",60000);
        Emp ref3=new Emp(003,"Ashutosh",70000);

        System.out.println("ID= "+ref1.id);
        System.out.println("Name= "+ref1.name);
        System.out.println("Monthly Salary= "+ref1.getSalary());

        System.out.println("================================================");

        System.out.println("ID= "+ref2.id);
        System.out.println("Name= "+ref2.name);
        System.out.println("Salary= "+ref2.getSalary());

        System.out.println("================================================");

        System.out.println("ID= "+ref3.id);
        System.out.println("Name= "+ref3.name);
        System.out.println("Salary= "+ref3.getSalary());

    }
}