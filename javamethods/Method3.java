package javamethods;

// taking parameters,not returning outputs

public class Method3 {
 int a;
 int b;
	void add(int x,int y)
	{
		a=x;
		b=y;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Method3 me=new Method3();
		me.add(100, 200);
	

	}

}
