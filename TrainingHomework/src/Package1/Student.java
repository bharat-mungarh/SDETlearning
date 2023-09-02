package Package1;

public class Student

{

	int age; // This is variable age of int type
	int rollNo; // This is variable rollNo of int type
	
	public static void main(String[] args) {
		Student ob = new Student();
		ob.display1();
		ob.display2();
		ob.age = 30;
		System.out.println("value of age " + ob.age);
		ob.rollNo = 1;
		System.out.println("value of rollNo " + ob.rollNo);
	}

	public void display1() // This is method named display1
	{
		System.out.println("Welcome to all of you");
	}

	public void display2() // This is method named display1
	{
		System.out.println("Automation is very easy");
	}
	
}
