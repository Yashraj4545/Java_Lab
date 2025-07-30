import java.util.*;
public class Reverse
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		n=sc.nextInt();
		for(i = n; i<=n;i++)
		{
			System.out.prinln(i);
		}
		System.out.println("After reversing");
		
		for(i = n; i>0; i--)
		{
			System.out.println(i);
		}
	}
}