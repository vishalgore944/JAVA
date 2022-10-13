class P1
{
    private int a=50000;
    public int getData()
    {
        return a;
    }

    public void setData(int b)
    {
        this.a=b;
    }
}

class Question
{
    public static void main(String[] args)
    {
    P1 ref=new P1();
    System.out.println(ref.getData());
    ref.setData(100000);
    System.out.println(ref.getData());
    }
}