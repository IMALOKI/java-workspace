package superkeyword;
class Dog{
String color="white";
void eat()
{
	System.out.println("eating food................");
}
}
class Goldenretriver extends Dog{
	String color="gold";
	void eat()
	{
		System.out.println("fighting with the reteiver");
		super.eat();
	}

	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class Retriver {
public static void main(String[] args) {
	Goldenretriver gdog=new Goldenretriver();
	gdog.display();
	gdog.eat();
}	
	
	
	}
	

