interface Printable
{  
      void print(int num);        
}  
  
class A implements Printable
{  
    public void print(int num)
    {
        System.out.println("The value of the number is : "+ num);
    }  
}  
  
class B implements Printable
{  
    public void print(int num)
    {
        System.out.println("The square of the number is : "+ (num * num));
    }  
}   

public class Session6Assignment1
{
    public static void main(String [] args) 
    {
          A obj1= new A();  
          B obj2=new B();  
          obj1.print(4);
          obj2.print(6);

          obj1.print(3);
          obj2.print(7);        
          
   }
}