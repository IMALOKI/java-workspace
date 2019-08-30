package hasmap;


import java.util.HashMap;
import java.util.Map;

public class Hashmapexample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(101, "hari");
		hm.put(102, "loki");
		hm.put(103, "suri");
		hm.put(104, "boop");
		System.out.println(hm);
		System.out.println(hm.size());
		hm.remove(102);
		System.out.println(hm);
		for(Map.Entry m:hm.entrySet())
		{System.out.println(m.getKey()+ "  "+ m.getValue());
			m.getKey();
			m.getValue();
			
		}
	}

}
