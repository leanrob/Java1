public class Smallest {
	public static void main (String arg[]) {
		int [] a = new int[10];
		int smallest=0;
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*10);
			System.out.print(a[i] + " ");
			}
		smallest = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]<smallest)	
				smallest=a[i];
		}
		System.out.println("smallest: " + smallest);
	}
}