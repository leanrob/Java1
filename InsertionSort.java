import java.util.*;

public class InsertionSort {

	public static void main(String arg[]) {
		int[]a = new int[10];
		init(a);
		print(a);
		sort(a);
		print(a);
		}
	public static void init(int[]a) {
		for (int i=0; i<a.length; i++)
			a[i] = (int)(Math.random() * 50);
		}
	public static void print(int[]a) {
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		}
	public static void sort(int[]a) {
		for(int i=1; i<a.length; i++) {
			int pivot = a[i];
			for(int j=i-1; j>=0; j--) {
				if (a[j]>pivot) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}