package javamethods;

//taking parameters,taking return outputs

public class Method4 {
	int x;
	int y;

	int add(int a, int b) {
		x = a;
		y = b;
		return (x + y);
	}

	public static void main(String[] args) {
		  
		Method4 me = new Method4();
//System.out.println(me.add(100, 200));
		int res = me.add(100, 200);
		System.out.println(res);
	}

}
