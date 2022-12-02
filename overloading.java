import java.lang.*; //Default package in java

class overloading
{
     public static void main(String arg[])
     {
          Demo dobj = new Demo();
          dobj.fun();
          dobj.fun(11);
          dobj.fun(11,21);
          dobj.fun(11,21);
     }
}

class Demo
{
     public void fun()        //fun@0
     {
          System.out.println("fun without parameter");
     }
     public void fun(int i)   //fun@1i
     {
          System.out.println("fun with one parameter");
     }
     public void fun(int i,int j)  //fun@2ii
     {
          System.out.println("fun with two parameter");
     }
     public void fun(double i)     //fun@1d
     {
          System.out.println("fun with one double parameter");
     }
}