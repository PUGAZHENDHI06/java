
import java.util.*;
import java.io.*;
public class buz
{
	public static void main(String[] args)
	{
		int n = 3;

		
		for (int a=1; a<=n; a++)								
		{
			
			if (a%15==0)												
				System.out.println("FizzBuzz");
			
			else if (a%5==0)	
				System.out.println("Buzz");

			
			else if (a%3==0)	
				System.out.println("Fizz");
				
			else
				System.out.println(a);						
		}
	}
}
