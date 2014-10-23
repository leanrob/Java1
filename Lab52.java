public class Lab52 {

  public static void main(String arg[]) {

    int a[] = {1,3,5,7,9};

    int x = sum(a);
      System.out.println("Sum of numbers: " + x);

    int y = largest(a);
      System.out.println("Smallest number: " + y);

    int z = smallest(a);
      System.out.println("Largest number: " + z);
    }

    public static int sum(int a[]) {

      int sums = 0;
      for(int i = 0; i < a.length; i++)
	sums = sums + a[i];
      return sums;
    }

    public static int largest(int a[]) {

      int large = a[0];
      for(int i = 0; i < a.length; i++) {
	if (a[i] > large)
	  large = a[i];
      }
      return large;
    }

     public static int smallest(int a[]) {

      int small = a[0];
      for(int i = 0; i < a.length; i++) {
	if (a[i] < small)
	  small = a[i];
      }
      return small;
    }
}
    