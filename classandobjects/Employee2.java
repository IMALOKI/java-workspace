package classandobjects;

//assigning values  based on method approach
public class Employee2 {
	int eid;
	String ename;

	void getValues(int id, String name) {
		eid = id;
		ename = name;
	}

	void display() {
		System.out.println(eid);
		System.out.println(ename);

	}
}
