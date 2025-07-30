import java.util.*;

public class Prime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("Enter the number: ");
		a=sc.nextInt();
		int found=0;
		if(a<0)
		{
			System.out.print()s
		}
		if(a==0||a==1||)
		{
			System.out.print("Not prime ");
		}
		else
		{
			for(int i = 2; i <= a/2; i++)
			{
				if(a%i==0)
				{
					found = 1;
					System.out.print(a+" is Composite number");
					break;
				}
			}
			if(found==0)
			{
				System.out.print(a+ "is Prime number");
			}
		}	
			
		

	}
}