package thiskeyword;

public class Usingmethods {
	int x;
	int y;
	
	void add(int x,int y) {
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		Usingmethods usmet=new Usingmethods();
		usmet.add(100, 200);
		usmet.display();

	}

}
