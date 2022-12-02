class ThreadDemo1
{
    public static void main(String A[])
    {
        System.out.println("Inside main method");

        System.out.println("Name of Current Thread :" +Thread.currentThread().getName());
        System.out.println("priority of Current Thread :" +Thread.currentThread().getPriority());

    }
}