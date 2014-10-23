import java.util.*;

public class Lab43 {
  
  public static void main (String arg[]) {
    
    Scanner s=new Scanner(System.in);
    System.out.print("Enter n: ");
    int n=s.nextInt();
    generatePrimes(n);
    }
  
  public static void generatePrimes(int n) {
    int p=2;
    int count=1;
    while (count<=n) {
      if (isPrime (p)) {
	System.out.print (p + " ");
	count++;
	}
	p++;
	}
      System.out.println();
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