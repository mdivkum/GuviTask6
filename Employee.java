package task6.GuviTask6;

public class Employee {
	
	private int ID;
	private String firstname;
	private String lastname;
	private int salary;
	
	public Employee(int ID , String firstname , String lastname , int salary)
	{
		this.ID=ID;
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
		System.out.println("Employee ID : "+ this.ID);
		System.out.println("Employee firstname : " +this.firstname);
		System.out.println("Employee lastname :" +this.lastname);
		System.out.println("Salary "+this.salary);
	}
	public int getID() {
		return ID;
	}
	
	public String getfirstname() {
		return firstname;
	} 
	public String getlastname() {
		return lastname;
	}
	public int getsalary()
	{
		return salary;
	}
    public void setsalary(int salary)
    {
    	this.salary=salary;
    	System.out.println(this.salary);
    }
	public int getannualsalary()
	{
		this.salary=salary*12;
		return salary;
	}
	public double getraisesalary()
	{
		return getsalary()*0.20;
	}
	
	public static void main(String[] args) {

Employee e=new Employee(22 , "Jeshvith" , "Santhosh" , 20000);
e.getID();
e.getfirstname();
e.getlastname();

System.out.println("Annual Salary "+e.getannualsalary());
System.out.println("Salary after increased by 20% " +e.getraisesalary());
	
	}

}
