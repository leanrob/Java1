import java.util.*;

public class Lab41 {

  public static void main (String arg[]) {

    Scanner s=new Scanner (System.in);
    System.out.print("Enter n: ");
    int n=s.nextInt();
    if (isEven(n))
      System.out.println(n + " is an even number");
    else
      System.out.println(n + " is an odd number"); 
  }
  
  public static boolean isEven(int n) {
    if (n%2==0)
      return true;
    else
      return false;
  }
}
