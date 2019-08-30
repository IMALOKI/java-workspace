package overloading;

public class Methodoverloading {
	int x;
	int y;
	double z;

	void add() { // method 1:not taking any parameters and not returning any value
		x = 100;
		y = 200;
		System.out.println(x + y);
	}

	int add(int a, int b) { // method 2:taking parameters and returning value
		x = a; 
		y = b;
		return (x + y);
	}

	void add(int a, int b, double c) { // method 3:taking parameters and not returning any value
		x = a;
		y = b;
		z = c;
		System.out.println(x + y + z);
	}

	void add(int a, double c) { // method 3:taking parameters and not returning any value
		x = a;
		z = c;
		System.out.println(x + y + z);
	}

	public static void main(String[] args) {
		Methodoverloading methodover = new Methodoverloading();
		// methodover.add();
		/*
		 * int res=methodover.add(100,200); System.out.println(res);
		 */
		 //methodover.add(100, 200, 0.25);
		methodover.add(100, 0.5);
	}

}
