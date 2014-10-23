import java.util.*;

public class Lab42 {

  public static void main (String arg[]) {

    Scanner s=new Scanner(System.in);
    System.out.print("Enter n: ");
    int n=s.nextInt();
    if (isPrime(n))
      System.out.println(n + " is a prime number");
    else
      System.out.println(n + " is not a prime number");
    }

  public static boolean isPrime(int p) {
    int count=0;
    for (int i=1; i<=p; i++) {
      if (p%i==0)
	count++;
    }
    if (count==2)
      return true;
    else
      return false;
    }
}