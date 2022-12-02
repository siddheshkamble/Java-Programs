class Loops
{
    public static void main(String arg[])
    {
        int Arr[] = {10,20,30,40};
        int iCnt = 0;

        System.out.println("Traversal of Array");
        for(iCnt = 0; iCnt<Arr.length; iCnt++)  //same in C,C++,java
        {
            System.out.println(Arr[iCnt]);
        }

        System.out.println("Traversal of Array using while loop");   
        iCnt = 0;
        while(iCnt<Arr.length)              //same in C,C++,java
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }

        System.out.println("Traversal of Array using do while loop");   
        iCnt = 0;
        do             //same in C,C++,java
        {
            System.out.println(Arr[iCnt]);
            iCnt++;
        }while(iCnt<Arr.length);
    
        System.out.println("Traversal of Array using for-each loop");   
        for(int iNo : Arr)    //only in java
        {
            System.out.println(iNo);
        }
    }
}