import java.util.*;      // Inbuilt package
import Marvellous.Arithematic;     // User defined package

class DemoPackage
{
     public static void main(String arr[])
     {
          Scanner sobj = new Scanner(System.in);

          System.out.println("Enter first number");
          int iNo1 = sobj.nextInt();

          System.out.println("Enter second number");
          int iNo2 = sobj.nextInt();

          Arithematic aobj = new Arithematic(iNo1,iNo2);

          int iResult = aobj.Addition();
          System.out.println("Addition is  : "+iResult);

          iResult = aobj.Substraction();
          System.out.println("Substraction is  : "+iResult);
     }
}