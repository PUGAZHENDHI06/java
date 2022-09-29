import java.util.Scanner;
import java.io.*;
public class vo
 {
 public static void main(String[] args)
 {
 Scanner in = new Scanner(System.in);
 int count=0;
 System.out.print("Input the string: ");
 String str = in.nextLine();
 for (int a = 0; a < str.length(); a++)
 {
 if (str.charAt(a) == 'a' || str.charAt(a) == 'e' || str.charAt(a) == 'i'
 || str.charAt(a) == 'o' || str.charAt(a) == 'u'||str.charAt(a) == 'A'||str.charAt(a) == 'E'||str.charAt(a) == 'I'||str.charAt(a) == 'O'||str.charAt(a) == 'U')
 {
 count++;
 }
 }
 System.out.print(" Vowels in the string: " + count);
}
}
