package classandobjects;

//assigning values  based on constructor approach
public class Employee3 {
	int eid;
	String ename;

	Employee3(int id, String name) {
		eid = id;
		ename = name;
	}

	void display() {
		System.out.println(eid);
		System.out.println(ename);

	}
}
