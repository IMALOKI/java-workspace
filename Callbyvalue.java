package callbyvalueandcallbyreference;

public class Callbyvalue {
int x;
void add(int a)
{
	System.out.println("the value before" + " " +a);
	x=a+5;
	System.out.println("the value after" + " "  + x);
}
	public static void main(String[] args) {
		
		Callbyvalue cv=new Callbyvalue();
		cv.add(10);
	}

}
