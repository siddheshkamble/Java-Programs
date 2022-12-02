import java.sql.*;  //1

class Database
{
    public static void main(String arg[]) throws Exception
    {
        Connection cobj = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppa4", "root", "root"); //2

        Statement sobj = cobj.createStatement();        //3
    
        ResultSet robj = sobj.executeQuery("select * from student");      //4

        while(robj.next())              //5
        {
            System.out.println("RID : "+robj.getInt("RID"));
            System.out.println("Name : "+robj.getString("Name"));
            System.out.println("City : "+robj.getString("City"));
            System.out.println("Marks : "+robj.getInt("Marks"));
        }
    }
}
//execute()         Create Table
//executeQuery      select
//executeUpdate     delete/update/alter/insert