package asmaafares;
//Name:: Asmaa Abed AL-Rahman Fares
//Section :: 9
//STD.NO :: 1210084

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of teachers: ");
		int numTeachers = input.nextInt();
		Teacher[] teachers = new Teacher[numTeachers];
		
		//ask the user to enter the different attributes and fill them for each teacher
		for (int i = 0; i < numTeachers; i++){
			System.out.println("Enter teacher's name, id, basic salary, and extra payment rate");
			String name = input.next();
			int id = input.nextInt();
			double basicSalary = input.nextDouble();
			double extraPaymentRate = input.nextDouble();
			
			System.out.println("Enter number of courses taught");
			int numCourses = input.nextInt();
			Course[] coursesTaught = new Course[numCourses];
			
			//ask the user to enter the course info
			for (int j = 0; j < numCourses; j++){
				System.out.println("Enter Course names and ids");
				String courseName = input.next();
				int courseId = input.nextInt();
				
				Course course = new Course(courseName, courseId);
				coursesTaught[j] = course;
			}
			
			Teacher teacher = new Teacher(name, id, basicSalary, extraPaymentRate, coursesTaught);
			teachers[i] = teacher;
		}
		
		//program should keep running until the user selects 5 Exit
		boolean running = true;
		while (running){
			System.out.println("Enter your choice of tasks (1-5): ");
			System.out.println("1- Print Teacher Information");
			System.out.println("2- Display teachers' total salaries");
			System.out.println("3- Change basic salary for a teacher");
			System.out.println("4- Display sum of total salaries for all teachers");
			System.out.println("5- Exit");
			
			int choice = input.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter teacher's id");
				int id = input.nextInt();
				
				for (Teacher t : teachers){
					if (t.getId() == id){
						t.printInfo();
						break;
					}
				}
				break;
			case 2:
				for (Teacher t : teachers){
					System.out.println("Name: " + t.getName());
					System.out.println("Total Salary: " + t.calculateTotalSalary());
				}
				break;
			case 3:
				System.out.println("Enter teacher's id");
				int id2 = input.nextInt();
				System.out.println("Enter new basic salary");
				double newBasicSalary = input.nextDouble();
				
				for (Teacher t : teachers){
					if (t.getId() == id2){
						t.setBasicSalary(newBasicSalary);
						break;
					}
				}
				break;
			case 4:
				double sumTotalSalaries = 0.0;
				for (Teacher t : teachers){
					sumTotalSalaries += t.calculateTotalSalary();
				}
				System.out.println("The sum of total salaries for all teachers is: " + sumTotalSalaries);
				break;
			case 5:
				running = false;
				break;
			default:
				System.out.println("Invalid input!");
				break;
			}
		}
		
		input.close();
	}

}