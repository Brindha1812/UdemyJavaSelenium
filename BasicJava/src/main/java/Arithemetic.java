public class Arithemetic
{
    public static void  main(String[] args)
    {
        // (2+5)*(4+8+10)
        Arithemetic ar = new Arithemetic();
        int a = ar.addition(2,5);
        int b = ar.addition(4,8);
        int c = ar.addition(b,10);
        int d = ar.multiplication(a,c);
        System.out.println("The Calculation of the numbers are :   " +d);

    }
    protected int addition(int x, int y)
    {
        int z;
        return z = x+y;
    }
    protected int multiplication(int x, int y)
    {
        int z;
        return z = x*y;
    }
}
