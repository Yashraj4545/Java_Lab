import java.util.*;

public class NoThird
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("The value of a is "+a+" and b is "+b);
        sc.close();
    }
}
