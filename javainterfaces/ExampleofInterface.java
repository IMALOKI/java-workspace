package javainterfaces;

interface A {
	int a = 100;

	void display();
}

public class ExampleofInterface implements A {
	public void display() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);
		// ExampleofInterface ein=new ExampleofInterface();
		A ein = new ExampleofInterface();
		System.out.println("inmplennting the interface");
		ein.display();

	}

}
