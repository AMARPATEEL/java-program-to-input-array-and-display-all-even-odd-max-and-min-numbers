import java.util.Scanner;
public class Array
{
	public static void main(String [] args)
	{
		int n,i;
		Scanner Scan=new Scanner(System.in);
		System.out.print("Enter length of array:");
		n=Scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter element");
		for (i=0;i<n;i++)
		{
			a[i]=Scan.nextInt();
		}
		System.out.print("10 nos are");
		for (i=0; i<n; i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println("  ");
		System.out.print("odd numbers:");
		for (i=0; i<n; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(" "+a[i]);
			}
		}
		System.out.println(" ");
		System.out.print("even numbers are");
		for (i=0; i<n; i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(" "+a[i]);
			}
		}
		System.out.println(" ");

		int max=a[0];
		for(i=0; i>n; i++)
		{
			if (max<a[i])
			{
				max=a[i];
			}
		}
		System.out.print("max:"+max);
		System.out.print("  ");
		int min=a[0];
		for(i=0; i<n; i++)
		{
			if (min>a[i])
			{
				min=a[i];
			}
		}
		System.out.print("min:"+min);
	}
}
