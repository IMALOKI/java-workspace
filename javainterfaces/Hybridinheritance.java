package javainterfaces;

class A1
{
	void m1()
	{
		System.out.println("the methos is m1....................");
	}
}

interface B1
{
	void m2();
}

interface C1
{
	void m3();
}

public class Hybridinheritance extends A1 implements B1,C1 {
	public void m2()
	{
		System.out.println("the method is from m2...................");
	}
	public void m3()
	{
		System.out.println("the method is from m3...................");
	}

	public static void main(String[] args) {
		Hybridinheritance hin = new Hybridinheritance();
		hin.m1();
		hin.m2();
		hin.m3();
	
	}

}
