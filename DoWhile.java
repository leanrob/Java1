import java.util.*;

public class DoWhile
	{
	public static void main(String arg[])
		{
		Scanner s=new Scanner (System.in);
		int a, b;
		do
			{
			System.out.print("Enter a:");
			a=s.nextInt();
			System.out.print("Enter b:");
			b=s.nextInt();
			}
		while (a<b);
		}
	}