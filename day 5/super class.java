import java.io.*;
import java.util.*;
class base
{
	int i;
	base(int a)
	{
		i=a;
	}
}
class derived extends base
{
	int j;
	derived(int a,int b)
	{
		super(a);
		i=a;
		j=b;
	}
	void print()
	{
		System.out.println("Super class ");
		System.out.println(super.i);
		System.out.println("Sub Class ");
		System.out.println(j);
	}
}

class superdemo
{
	public static void main(String []arg)
	{
           try
           {
                Scanner sc=new Scanner(System.in);
                int a,b,c;
                System.out.println();
                a=sc.nextInt();
                System.out.println();
                b=sc.nextInt();
		derived d = new derived(a,b);
		d.print();
           }
           catch(Exception e)
           {
              System.out.println("Invalid due to string");
           }
	}
}
