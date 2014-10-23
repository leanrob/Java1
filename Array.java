public class Array {

	public static void main(String arg[]) {

		int [] a = new int[5];
		for(int i=0; i<a.length;i++)
			System.out.print(a[i] + " ");
		System.out.println();
		char[] b = {'a','b','c','d','e'};
		for(int i=0; i<b.length;i++)
			System.out.print(b[i] + " ");
		System.out.println();
		double[] c = new double[5];
		for(int i=0; i<c.length; i++) {
			c[i] = 10*Math.random();
			System.out.print(c[i] + " ");
		}
		System.out.println();
	}
}