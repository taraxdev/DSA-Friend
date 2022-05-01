import java.util.Arrays;
import java.util.Scanner;

public class sum {

public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int n,p,temp=0;
int t =8;
System.out.println("enter the size of array");
n=sc.nextInt();
int[] arr = new int[n];
System.out.println("enter numbers");

for(int j=0;j<arr.length;j++)
{
arr[j]=sc.nextInt();

}

for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
System.out.println(arr[i]);
}

}

}
