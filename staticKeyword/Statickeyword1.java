package staticKeyword;

//accessing static & non static variables and method in a different classes through main `class
public class Statickeyword1 {
	
	static int a=100;
	int b=200;
	
	static void main1()
	{
		System.out.println("this is static method");
	}
	
	void main2()
	{
		System.out.println("this is a non static method");
	}
	
	void main3()
	{
		System.out.println(a);
		System.out.println(b);
		main1();
		main2();
	}
}
	