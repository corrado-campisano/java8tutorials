package javaBrainsCourse.lambdasTutorial.f_functionInterfaces;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	
	
	public Person(String fn, String ln, int a) {
		firstName=fn; lastName=ln; age=a;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age +"]";
	}
}
