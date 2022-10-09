public class Student 
{
    int ID;
    String name;
    double per;

    Student(int ID, String name, double per)
    {
        this.ID=ID;
        this.name=name;
        this.per=per;
    }

    public static void main(String[] args) 
    {
        Student ref=new Student(001,"Vishal",88);
        System.out.println("ID: "+ref.ID);
        System.out.println("Name: "+ref.name);
        System.out.println("Percentage: "+ref.per);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        Student ref2=new Student(002,"Sandeep",89);
        System.out.println("ID: "+ref2.ID);
        System.out.println("Name: "+ref2.name);
        System.out.println("Percentage: "+ref2.per);
    }
}