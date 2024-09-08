package task6.GuviTask6;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String name , int age) {
		this.name=name;
		this.age=age;
		System.out.println("My name is "+this.name);
		System.out.println("My age is " +this.age);
	}

	public String getName() {
		return name;
	
	}
	
	public int getage() {
		return age;
	
	}
	
	public static void main(String[] args) {
	
Person p=new Person("Jesh" , 3);
p.getage();
p.getName();

	}

}
