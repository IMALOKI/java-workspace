package constructors;

public class Defaultconstructor {
	int x;
	int y;

	Defaultconstructor() {
		x = 100;
		y = 200;
	}

	void display() {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		Defaultconstructor decon = new Defaultconstructor();
		decon.display();
	}

}
