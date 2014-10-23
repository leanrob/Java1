import java.util.*;

public class Lab22
{
  public static void main(String arg[])
  {
    Scanner s=new Scanner (System.in);
    System.out.print("Enter Grade (between 0-100): ");
    int Grade=s.nextInt();
      if (Grade>=85 && Grade<=100)
	System.out.println("Grade: A");
      else
	if (Grade>=65 && Grade<=84)
	{
	System.out.println("Grade: B");
	}
      else
      if (Grade>=55 && Grade<=64)
	{  
	System.out.println("Grade: C");
	}
      else
      if (Grade>=50 && Grade<=54)
	{
	System.out.println("Grade: D");
	}
      else
      if (Grade >=0 && Grade<=49)
	{
	System.out.println("Grade: F");
	}
  }
}