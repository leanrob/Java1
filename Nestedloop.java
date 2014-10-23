import java.util.*;

public class Nestedloop
{
	public static void main (String arg[])
		{
		Scanner s=new Scanner (System.in);
		System.out.print("Enter n:");
		int n=s.nextInt();
		for (int i=1; i<=n; i++)
			{
			for (int j=1; j<=n; j++)
				{
				if(i==j || i+j==n+1)
					System.out.print("x");
				else
					System.out.print(" ");
			}
			System.out.println();
			}
		}
}