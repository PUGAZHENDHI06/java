import java.util.Scanner;
class factorialn
{
 public static void main(String[] args)
 {
   try
   {
    int n,fact=1,a;
    Scanner s= new Scanner(System.in);
    System.out.print(" enter the number : ");
    n= s.nextInt();
    if(n<=0)
    {
       System.out.print("enter only positive numbers");
    }
    else
    {
        for(a=1;a<=n;a++)
         {
              fact=fact*a;
          }
        System.out.print("the factorial of "+n+" is "+fact); 
    } 
    }
    catch(exception e)
    {
        System.out.print("enter only numbers");
    }
  }
}
