package thiskeyword;

public class Usingconstructors {
	int x;
	int y;
	
	Usingconstructors(int x,int y) {
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		Usingconstructors usmet=new Usingconstructors(100,200);
		usmet.display();

	}

}
