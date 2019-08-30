package javainterfaces;

interface X {
	int x = 100;

	void show();
}

interface Y {
	int y = 200;

	void print();
}

public class Multipleinheritance implements X, Y {
	public void show() {
		System.out.println(x + 100);
	}

	public void print() {
		System.out.println(y + 200);
	}

	public static void main(String[] args) {
		System.out.println("the valus of x and y ");
		System.out.println(x);
		System.out.println(y);
		System.out.println("the valus of x and y afteer implementing methods");
		Multipleinheritance min = new Multipleinheritance();
		min.show();
		min.print();
	}

}
