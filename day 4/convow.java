import java.util.*;
class convow
{
 public static void main(String[] args) 
{
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter a string: ");
 String line= sc.nextLine();
 int vowels = 0, consonants = 0, digits = 0, spaces = 0;
 line = line.toLowerCase();
 System.out.print("Vowels: ");
 for (int a = 0; a < line.length(); ++a)
 {
 char ch = line.charAt(a);
 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
 {
 ++vowels;
 System.out.print(ch);
 }
 }
 System.out.print("\n");
 System.out.print("Consonants: ");
 for (int a = 0; a < line.length(); ++a)
 {
 char ch = line.charAt(a);
 if (ch >= 'a' && ch <= 'z'&&ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u')
 {
 ++consonants;
 System.out.print(ch);
 }
 }
 
}
}
