import java.lang.*; //Default package in java

class RMD
{
     public static void main(String arg[])
     {
          Base bobj = new Derived();
          bobj.fun();
          bobj.gun();
          bobj.sun();
     }
}

class Base
{
     public void fun()
     {
          System.out.println("Base Fun");
     }
     public void gun()
     {
          System.out.println("Base gun");
     }
     public void sun()
     {
          System.out.println("Base sun");
     }
}

class Derived extends Base
{
     public void fun()
     {
          System.out.println("Derived Fun");
     }
     public void gun()
     {
          System.out.println("Derived gun");
     }
}

/* 
     Base bobj = new Base();
     Derived bobj = new Derived();
     Base bobj = new Derived();
     Derived bobj = new Base();
*/