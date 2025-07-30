import java.util.*;

public class First
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Enter to cheak positive or not");
		a=sc.nextInt();
		if(a==0)
		{
			System.out.print("0 is not negative nor positive");
			
		}
		else if(a>0)
		{
			System.out.print(a+" is a positive Number");
		}
		else
		{
			System.out.print(a+" is a NEgative number");
		}
		sc.close();
	}
}