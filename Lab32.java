import java.util.*;

public class Lab32
  {
  public static void main(String arg[])
    {
    int i, prev, n;
  
    Scanner s=new Scanner(System.in);
    System.out.print("Enter n:");
    n=s.nextInt();

    prev=0;
    i=1;

    while (i<=n) {
      if (n%i==0)
    prev=prev+i;
      i++;
    }
  
    if (prev==2*n)
      System.out.println (n + " is a perfect number");
    else
      System.out.println (n + " is not a perfect number");
    }
  }