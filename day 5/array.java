import java.util.*;
public class array {
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		int arr[] = new int[5];
		int b = 0;
		while (b < 5) {
			arr[b++] = a.nextInt();
		}
		System.out.println(
			"Array elements are as follows: ");
		for (int c = 0; c < 5; c++)
			System.out.print(arr[c] + " ");
	}
}
