import java.util.Scanner;
public class Frequency {
 public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 System.out.println("enter no.of.elements in the array");
 int n=s.nextInt();
 int arr[][]=new int[n][2];
 System.out.println("enter the elements of the array");
 int i,j;
 for(i=0;i<n;i++)
 {
 arr[i][0]=s.nextInt();
 }
 for(i=0;i<n;i++)
 {
 arr[i][1]=1;
 }
 for(i=0;i<n;i++)
 {
 for(j=i+1;j<n;j++)
 {
 if(arr[i][0]==arr[j][0])
 {
 arr[j][0]=-1;
 arr[i][1]=arr[i][1]+1;
 }
 }
 }
 System.out.println("the output table is:=");
 System.out.println("element | frequency");
 System.out.println("---------------------");
 for(i=0;i<n;i++)
 {
 if(arr[i][0]!=-1)
 {
 System.out.println(" "+arr[i][0]+" | "+arr[i][1]); 
 }
 }
 }
}
