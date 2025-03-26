package asmaafares;
//Name:: Asmaa Abed AL-Rahman Fares
//Section :: 9
//STD.NO :: 1210084

public class Course {
	private String name; 
	private int id; 
	
	//default constructor
	public Course(){
		this.name = "";
		this.id = 0;
	}
	
	//non-default constructor
	public Course(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	//getters
	public String getName(){
		return this.name;
	}
	
	public int getId(){
		return this.id;
	}
	
	//setters
	public void setName(String name){
		this.name = name;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	//method to print out the attributes and their values
	public void printInfo(){
		System.out.println("Name: " + this.name);
		System.out.println("Id: " + this.id);
	}
}