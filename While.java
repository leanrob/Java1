public class While
{
  public static void main(String args[])
  {
    int i, n, count;

    System.out.print("Enter an integer: ");
    n = In.readInt();
  
    count = 0;
    i = 1;
  
    while(i <= n) {
      if(n % i == 0)
        count++;
      i++;
    }

    if(count == 2)
      System.out.println(n + " is a prime number.");
    else
      System.out.println(n + " is not a prime number.");
  }
}
