import java.util.*;

public class Prime
{
public static void main(String arg[])
	{
	Scanner s=new Scanner (System.in);
	System.out.print("Enter n:");
	int n=s.nextInt();
	int count = 0;
	for (int i=1; i<=n; i++)
		{
		if(n%i==0)
		count++;
		}
		if(count==2)
			System.out.println(n+" is prime");
		else
			System.out.println(n+" is not prime");
}
}