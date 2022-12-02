import java.io.*;

class BufferedInput
{
    public static void main(String A[]) throws IOException
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);
        //BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        String Name = null;
        int Age = 0; 
        float Marks = 0.0f;

        System.out.println("Enter You Name :");
        Name = bobj.readLine();

        System.out.println("Enter Your Age :");
        Age = Integer.parseInt(bobj.readLine());

        System.out.println("Enter Your Marks :");
        Marks = Float.parseFloat(bobj.readLine());
        
        System.out.println("Name :" +Name);
        System.out.println("Age :" +Age);
        System.out.println("Marks :" +Marks);
    }
}