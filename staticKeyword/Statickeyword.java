package staticKeyword;

//accessing static & non static variables and method in a same class
public class Statickeyword {
	
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
	

	public static void main(String[] args) {		// main method is a static method
		
		//accessing static methods and variables directly
		System.out.println(a);
		main1();
		
		//accessing non static methods through object 
		Statickeyword sk=new Statickeyword();
		System.out.println(sk.b);
		sk.main2();
		sk.main3();
 

	}

}
