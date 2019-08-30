package arrays;

public class Singledimensionalarray {
	/*
	 * 1)to declare and initialize an array 2)to find out the length of the array
	 * 3)to extract elements from the array
	 */

	/*
	 * int a []=new int[5];//declaration
	 * 
	 * a[0]= 100; a[1]= 200; a[2]= 300; a[3]= 400; a[4]= 500;
	 * 
	 * System.out.println(a.length); System.out.println(a[1]);
	 */

	public static void main(String[] args) {

		int a[] = { 100, 200, 300, 400, 500 };
		/*
		 * for(int i:a) { System.out.println(i); }
		 */
		System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		String b[]= {"hello","john","hi"};
		System.out.println(b.length);

		for (int j = 0; j<b.length; j++) {
			System.out.println(b[j]);
		}
		
	}
}