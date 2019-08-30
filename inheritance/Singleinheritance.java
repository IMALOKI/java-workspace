package inheritance;

class Parent
{
	void show(String a)
	{
		System.out.println(a);
	}
}

class Child extends Parent
{
	void display(String x)
	{
		System.out.println(x);
	}
}

public class Singleinheritance {
	

	public static void main(String[] args) {
Child ch=new Child();
ch.show("hello");
ch.display("hello");
	}

}
