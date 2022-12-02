/*
class Object
{
     //code
}
*/

class Single
{
     public static void main (String arg[])
     {
          //Base bobj1 = new Base();           //no casting
          Derived dobj1 = new Derived();     //no casting
          Base bobj2 = new Base();           //upcasting
          // Derived dobj2 = new Derived();  //downcasting

          dobj1.fun();
          dobj1.fun(11);
          dobj1.gun();
          dobj1.sun();

          bobj2.fun();
          bobj2.fun(11);
          bobj2.gun();
          //bobj2.sun();

     }
}
class Base
{
     public int A,B;
     public Base()
     {
          System.out.println("Base constructor");
          this.A = 10;
          this.B = 20;
     }
     public void fun()        //Defination
     {
          System.out.println("Inside Base fun");
     }
     public void gun()        //Defination
     {
          System.out.println("Inside Base gun");
     }
     public void fun(int No)  //Overloaded Defination
     {
          System.out.println("Inside Base fun with one integer");
     }

}

class Derived extends Base         //class Derived:public Base
{
     public int X,Y;
     public Derived()
     {
          System.out.println("Derived constructor");
          this.X = 30;
          this.Y = 40;        
     }
     public void sun()        //Defination
     {
          System.out.println("Inside Derived sun");
     }
     public void gun()        //Overrided Defination
     {
          System.out.println("Inside Derived gun");
     }
}    
