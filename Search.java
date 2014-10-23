import java.util.*;

public class Search {

	public static void main(String arg[]) {

		int[] a = new int[10];
		print(a);
		init(a);
		print(a);
		System.out.print("Enter target: ");
		Scanner s=new Scanner (System.in);
		int target=s.nextInt();
		if(search (a,target))
			System.out.println(target + " is in array");
		else
			System.out.println(target + " is not in array");
		}
	public static void print(int[]a) {
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		}
	public static void init(int[]a) {
		for(int i=0; i<a.length; i++)
			a[i]=(int)(Math.random()*50);
		}
	public static boolean search(int[]a, int target) {
		boolean found=false;
		for(int i=0; i<a.length && !found; i++){
			if(a[i]==target)
				found=true;
		}
	return found;
	}
}