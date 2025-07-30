import java.util.*;
public class Greatest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the valur of a: ");
		int a = sc.nextInt();
		System.out.print("Enter the valur of b: ");
		int b = sc.nextInt();
		System.out.print("Enter the valur of c: ");
		int c = sc.nextInt();
		if(a==b&&b==c)
		{
			System.out.print(a+ "and "+b+" and "+c+" are equal");
		}
		if(a>b&&a>c)
		{
			System.out.print(a+" is greatest");
		}
		else if(c>b&&c>a)
		{
			System.out.print(c+" is greatest");
		}
		else
		{
			System.out.print(a+" is greatest");
		}
	}
}