package first_class_practice;

public class Numan {

	String name = "Numan";// initialized variable
	String name2;// declared variable

	public Numan() { // default constructor
		System.out.println("default constructor");

	}

	public Numan(int age) { // parameterized constructor
		System.out.println("parameterized constructor");
	}

	public Numan(String name, int age) {// another parameterized constructor
		System.out.println("Another parameterized constructor");

	}
	
	public void num() {
		System.out.println("This my void type method");
		int c = 10 + 20 - 5;
		System.out.println(c);
		
	}
	
	public String numan(String firstName, String lastName) {//
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		return fullName;
	}

	public static void main(String[] args) {
		Numan obj1 = new Numan();
		Numan obj2 = new Numan(11);
		Numan obj3 = new Numan("Numan",30);
		obj1.num();
		obj2.numan("Al", "Numan");
	}

}
