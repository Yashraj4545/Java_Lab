import java.util.*;

public class What
{
	Scanner sc = new Scanner(System.in);
	int a,b,c,ans;
	System.out.print("Enter first number: ");
	a=sc.nextInt();
	System.out.print("Enter second value: ");
	b=sc.nextInt();
	
	System.out.print("Enter third value");
	c=sc.nextInt();
	ans = (a>b&&a>c)?a:(b>c):b:c);
	System.out.print(ans);
}