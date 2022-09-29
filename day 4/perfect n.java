import java.util.Scanner; 
public class perfectn
{ 
  public static void main(String args[]) 
  { 
     try
     {
        long n, sum=0; 
        Scanner sc=new Scanner(System.in); 
        System.out.print("enter the number: "); 
        n=sc.nextLong(); 
        int a=1; 
        if(n<=0)
        {
          System.out.println("enter the valid number "); 
        }

        else
        {
          while(a <= n/2) 
          { 
            if(n % a == 0) 
            { 
              sum = sum + a; 
            } 
            i++; 
          } 

          if(sum==n) 
          { 

             System.out.println(n+" is a perfect number."); 
          }  
          else
          { 
          System.out.println(n+" is not a perfect number."); 
          } 
        }
       }
       catch(Exception e)
       {
           System.out.print("enter the valid number");
       }
    }
}
