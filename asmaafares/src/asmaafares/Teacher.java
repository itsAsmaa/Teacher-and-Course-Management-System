package asmaafares;
//Name:: Asmaa Abed AL-Rahman Fares
//Section :: 9
//STD.NO :: 1210084

public class Teacher {

	private String name; 
	private int id; 
	private double basicSalary; 
	private double extraPaymentRate; 
	private Course[] coursesTaught; 
	
	//default constructor
	public Teacher(){
		this.name = "";
		this.id = 0;
		this.basicSalary = 0.0;
		this.extraPaymentRate = 0.0;
		this.coursesTaught = null;
	}
	
	//non-default constructor
	public Teacher(String name, int id, double basicSalary, double extraPaymentRate, Course[] coursesTaught){
		this.name = name;
		this.id = id;
		this.basicSalary = basicSalary;
		this.extraPaymentRate = extraPaymentRate;
		this.coursesTaught = coursesTaught;
	}
	
	//getters
	public String getName(){
		return this.name;
	}
	
	public int getId(){
		return this.id;
	}
	
	public double getBasicSalary(){
		return this.basicSalary;
	}
	
	public double getExtraPaymentRate(){
		return this.extraPaymentRate;
	}
	
	public Course[] getCoursesTaught(){
		return this.coursesTaught;
	}
	
	//setters
	public void setName(String name){
		this.name = name;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setBasicSalary(double basicSalary){
		this.basicSalary = basicSalary;
	}
	
	public void setExtraPaymentRate(double extraPaymentRate){
		this.extraPaymentRate = extraPaymentRate;
	}
	
	public void setCoursesTaught(Course[] coursesTaught){
		this.coursesTaught = coursesTaught;
	}
	
	//method to print out the attributes and their values
	public void printInfo(){
		System.out.println("Name: " + this.name);
		System.out.println("Id: " + this.id);
		System.out.println("Basic Salary: " + this.basicSalary);
		System.out.println("Extra Payment Rate: " + this.extraPaymentRate);
		System.out.println("Courses Taught: ");
		for (Course c : this.coursesTaught){
			c.printInfo();
		}
	}
	
	//method to count the number of courses of a certain level
	public int countCourseLevel(int level){
		int count = 0;
		for (Course c : this.coursesTaught){
			int id = c.getId();
			if (id/100 == level){
				count++;
			}
		}
		return count;
	}
	
	//method to calculate the extra payment
	public double calculateExtraPayment(){
		double extraPayment = 0;
		for (int i = 1; i <= 4; i++){
			int count = this.countCourseLevel(i);
			extraPayment += count * i * this.extraPaymentRate;
		}
		return extraPayment;
	}
	
	//method to calculate the total salary 
	public double calculateTotalSalary(){
		return this.basicSalary + this.calculateExtraPayment();
	}
}
