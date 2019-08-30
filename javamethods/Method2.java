package javamethods;

// not taking parameters,taking return values

public class Method2 {
	int x = 100;
	int y = 200;

	int add() {
		return (x + y);
	}

	public static void main(String[] args) {

		Method2 me = new Method2();
		//System.out.println(me.add());
		int res=me.add();
		System.out.println(res);
	}
 
}
