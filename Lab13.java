import java.util.*;
public class Lab13
    {
    public static void main(String arg[])
        {
        Scanner s=new Scanner (System.in);
        //remember that Scanner line above is only put in once!
	System.out.print ("Enter first Integer:");
        int first=s.nextInt();
        System.out.print ("Enter second Intiger:");
        int second=s.nextInt();
       
        int sum= first+second;
        int difference= first-second;
        int product= first*second;
        int quotient= first/second;
        int remainder = first-(quotient*second);

        System.out.println("Sum: " + sum + "\ndifference: " + difference +  "\nproduct: " + product +  "\nquotent: " + quotient  + "\nremainder: " + remainder);
        }
}