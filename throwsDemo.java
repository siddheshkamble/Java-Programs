import java.util.*;

class throwsDemo
{
    public static void main(String a[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter 2nd number");
        int iNo2 = sobj.nextInt();

        Arithematic aobj = new Arithematic();
        
        try
        {
            int Ret = aobj.Division(iNo1, iNo2);
            System.out.println("Division is :"+Ret);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Exception occured");
            System.out.println(obj);
        }
    }
}

class Arithematic
{
    public int Division(int A, int B) throws ArithmeticException
    {
        int Ans = 0;
        Ans = A/B;
        return Ans;
    }
}