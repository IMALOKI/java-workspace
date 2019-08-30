package overloading;

public class Constructoroverloading {
	int x;
	int y;
	double z;

	Constructoroverloading() // default constructor
	{
		x = 100;
		y = 200;
	}

	Constructoroverloading(int a, int b) // parameterized constructor
	{
		x = a;
		y = b;
	}

	Constructoroverloading(int a, int b, double c) // parameterized constructor with different variables
	{
		x = a;
		y = b;
		z = c;
	}

	void display() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		// Constructoroverloading conover=new Constructoroverloading();
		// Constructoroverloading conover=new Constructoroverloading(100,200);
		Constructoroverloading conover = new Constructoroverloading(100, 200, 0.25);
		conover.display();
	}

}
