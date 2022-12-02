
class CloneDemo
{
    public static void main(String A[])
    {
        try
        {
            Employee eobj1 = new Employee(101,"Rahul", 11000);
            Employee eobj2 = (Employee)eobj1.clone(); //Employee is class name which is typecasting

            System.out.println("Name of 1st employee :"+eobj1.Name);
            System.out.println("Name of 2nd employee :"+eobj2.Name);

            System.out.println("Salary of 1st employee :"+eobj1.Salary);
            System.out.println("Salary of 1st employee :"+eobj2.Salary);

            eobj1.Name = "Sagar"; //deep copy

            System.out.println("Name of 1st employee :"+eobj1.Name);
            System.out.println("Name of 2nd employee :"+eobj2.Name);
        }
        catch(CloneNotSupportedException obj)
        {}
    }
}

class Employee implements Cloneable
{
    public int Eid;
    public String Name;
    public int Salary;

    public Employee(int No, String str, int Value)
    {
        this.Eid = No;
        this.Name = str;
        this.Salary = Value;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}