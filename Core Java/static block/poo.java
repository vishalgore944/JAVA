class poo
{
    static int a=10;
    static
        {
            System.out.println("Welcome to jumanji");
            System.out.println("Stage 1");
        }
        static double b;

        public static void ashu() 
        {
            System.out.println("Satge 2");
            sonali();    
        }

        static
        {
            System.out.println("Hiii Nishant");
            sonali();
        }

        public static void sonali() 
        {
            System.out.println("Hiii prachi");
            System.out.println(poo.a);    
        }

        public static void main(String[] args) 
        {
            System.out.println("Hello world");
            System.out.println(a);
            ashu();
            System.out.println(poo.b);
            sonali();
        }
       
}