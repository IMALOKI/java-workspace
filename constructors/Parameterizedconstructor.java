package constructors;

public class Parameterizedconstructor {
	int x;
	int y;

	Parameterizedconstructor(int a, int b)

	{
		x = a;
		y = b;
	}

	void display() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {

		Parameterizedconstructor paracon = new Parameterizedconstructor(100, 200);
		paracon.display();
	}

}
