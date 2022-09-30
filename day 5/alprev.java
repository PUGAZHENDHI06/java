import java.io.*;
import java.util.*;
import java.util.Arrays;
class alprev

{

	public static void main(String[] args) throws Exception
	{
		
		String str;
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the string:");
                str=sc.next();
	
		
		char arr[] = str.toCharArray();

		
	
		char temp;

		int a = 0;
		while (a < arr.length) {
			int b = a + 1;
			while (j < arr.length) {
				if (arr[b] > arr[a]) {
				
					
					temp = arr[a];
					arr[a] = arr[b];
					arr[b] = temp;
				}
				b += 1;
			}
			a += 1;
		}

		
		System.out.println("alphabetical order:");
                System.out.println(arr);
	}
}
