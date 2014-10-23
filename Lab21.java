import java.util.*;

public class Lab21
{
  public static void main(String arg[])
  {
    Scanner s=new Scanner (System.in);
    System.out.print("Enter Integer: ");
    int Integer=s.nextInt();
      if (Integer<0)
	System.out.println(Integer + " is Less than zero");
      else
	if (Integer>0)
	  System.out.println(Integer + " is Greater than zero");
      if (Integer==0)
	System.out.println(Integer + " is Equal to zero");
   }
}