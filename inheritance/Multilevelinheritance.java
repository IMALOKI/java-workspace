package inheritance;

class A
{
	void display(String a)
	{
		System.out.println(a);
	}
}

class B extends A
{
	void show(String b)
	{
		System.out.println(b);
	}
}

class C extends B
{
	void print(String c)
	{
		System.out.println(c);
	}
}


public class Multilevelinheritance {
	

	public static void main(String[] args) {
	C cobj=new C();
	cobj.display("hello");
	cobj.show("poki");
	cobj.print("hru");
	
	
	
	
	}

}
