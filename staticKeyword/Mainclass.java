package staticKeyword;

public class Mainclass {

public static void main(String[] args) {		// main method is a static method
		
		//accessing static methods and variables directly
		System.out.println(Statickeyword1.a);
		Statickeyword1.main1();
		
		//accessing non static methods through object 
		Statickeyword sk=new Statickeyword();
		System.out.println(sk.b);
		sk.main2();
		sk.main3();

		

	}

}
