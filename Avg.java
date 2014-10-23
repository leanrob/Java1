public class Avg {
	public static void main(String arg[]) {
		int[] a = new int[5];
		int sum = 0;
		double avg = 0.0;
		for(int i=0; i<a.length; i++) {
			a[i] = (int) (Math.random()*10);
			System.out.print(a[i] + " ");
			sum = sum + a[i];
			}
		System.out.println();
	avg = (double)sum/(double)a.length;
	System.out.println("avg: " + avg);
	}
}