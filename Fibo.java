import java.util.*;

public class Fibo{

  public static void main(String arg[]){

    int current, prev=1, prevprev=0;
    for(int i=0; i<20; i++) {
      current = prev + prevprev;
      System.out.print(current + " ");
      prevprev = prev;
      prev = current;
    }
    System.out.println();
  }
}