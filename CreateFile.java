import java.io.*;

class CreateFile
{
    public static void main(String arg[]) throws Exception
    {
        File fobj = new File("Marvellous.txt");

        if(fobj.createNewFile())
        {
            System.out.println("File created successfully");
        }
        else
        {
            System.out.println("Unable to create file");
        }
    }
}