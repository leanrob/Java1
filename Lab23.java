import java.util.*;

public class Lab23
{
   public static void main(String arg[])
   {
      int n;

      Scanner s=new Scanner (System.in);
      System.out.print("Enter a number (between 1-7): ");
      int number=s.nextInt();

    switch(number)
      {
      case 1 :
	System.out.println("The first day of the week is Sunday\nAlmost time for school again :("); 
	break;
      case 2 : 
	System.out.println("The second day of the week is Monday"); 
	break;
      case 3 : 
	System.out.println("The third day of the week is Tuesday"); 
	break;
      case 4 : 
	System.out.println("The fourth day of the week is Wednesday"); 
	break;
      case 5 : 
	System.out.println("The fifth day of the week is Thursday"); 
	break;
      case 6 : 
	System.out.println("The sixth day of the week is Friday\nThe Weekend!! OOHH YAA"); 
	break;
      case 7 : 
	System.out.println("The seventh day of the week is Saturday"); 
	break;
      //I Loves me programmin' by!
      }
   }
}