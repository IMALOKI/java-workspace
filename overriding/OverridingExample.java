package overriding;

class Bank {
	double rateOfInterest() {
		return 0;
	}
}

class Sbi extends Bank {
	double rateOfInterest() {
		return 12.5;
	}
}

class Icici extends Bank {
	double rateOfInterest() {
		return 15;
	}
}

public class OverridingExample {

	public static void main(String[] args) {

		Sbi sbiobj = new Sbi();
		System.out.println(sbiobj.rateOfInterest());

		Icici iciciobj = new Icici();
		System.out.println(iciciobj.rateOfInterest());

	}

}
 