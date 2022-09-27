import java.util.*;
class binary
{
 public static void main(String[] args)
 {
  try
 {
 Scanner scan;
 int num;
 
 scan = new Scanner(System.in);
 System.out.println("decimal Number: ");
 num = Integer.parseInt(scan.nextLine());
 
 
 String binary = Integer.toBinaryString(num);
 System.out.println("binary number = " + binary);
 
 String octal = Integer.toOctalString(num);
 System.out.println("octal = " + octal);
 }
 catch(Exception e)
  {
     System.out.println("enter only numbers");
 }
}
}
