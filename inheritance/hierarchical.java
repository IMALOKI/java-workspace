 package inheritance;

class Super
{
	void display(String a)
	{
		System.out.println(a);
	}
}

class Sub1 extends Super
{
	void show(String x)
	{
		System.out.println(x);
	}
}

class Sub2 extends Super
{
	void print(String c)
	{
		System.out.println(c);
	}
}
public class hierarchical {
	

	public static void main(String[] args) {
Sub1 ch1=new Sub1();
System.out.println("the strings are from sub 1 classes");
ch1.display("hello");
ch1.show("john");

Sub2 su2=new Sub2();
System.out.println("the strings are from sub class 2");
	su2.display("hello");
	su2.print("loki");
	
	}
	
	

}
