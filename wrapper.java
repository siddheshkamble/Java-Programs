class wrapper
{
    public static void main(String A[])
    {
        int no =11;

        Integer iobj = new Integer(no); //Boxing converting primitive to wrapper

        System.out.println(no);
        System.out.println(iobj);

        int x = iobj;   //Unboxing converting wrapper to primitive
        System.out.println(x);
    }
}