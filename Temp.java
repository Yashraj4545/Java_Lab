import java.util.*;

public class Temp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,temp;
		System.out.print("Enter the value of a: ");
		a=sc.nextInt();
		System.out.print("Enter the value of b: ");
		b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.print("The value of a is "+ a+" and value of b is "+b);
	}
		
}