package callbyvalueandcallbyreference;

public class Callbyreference {
	int x;
	void add(Callbyreference a)
	{
		System.out.println("the value before passing the pobject as a parameter" + " " + a.x );
		x=a.x+5;
		System.out.println("the value after passing the pobject as a parameter" + " " + x );
	}

	public static void main(String[] args) {
		Callbyreference cr=new Callbyreference();
cr.x=10;
cr.add(cr);
	}

}
