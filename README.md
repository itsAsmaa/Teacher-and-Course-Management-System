# Teacher and Course Management System (java)

## Project Overview

This Java project simulates a simple Teacher and Course Management System. It allows users to manage teacher details, calculate salaries, and display course information. The system offers functionalities like:

- Adding teacher details (name, ID, basic salary, and extra payment rate).
- Assigning courses to each teacher.
- Printing teacher information, including their salary details.
- Calculating the total salary by considering the basic salary and extra payments based on the courses taught.
- Modifying a teacher's basic salary.
- Displaying the sum of the total salaries for all teachers.

## Files in the Project

### 1. **Course.java**

This file defines the `Course` class, which contains information about a course, including its name and ID.

Key Methods:
- **getName()**: Returns the name of the course.
- **getId()**: Returns the ID of the course.
- **setName(String name)**: Sets the name of the course.
- **setId(int id)**: Sets the ID of the course.
- **printInfo()**: Prints the course information.

### 2. **Teacher.java**

This file defines the `Teacher` class, which holds details about a teacher, such as their name, ID, basic salary, extra payment rate, and the courses they teach. It includes methods for calculating the total salary based on the basic salary and extra payments.

Key Methods:
- **getName()**, **getId()**, **getBasicSalary()**, **getExtraPaymentRate()**, **getCoursesTaught()**: Getter methods for teacher attributes.
- **setName()**, **setId()**, **setBasicSalary()**, **setExtraPaymentRate()**, **setCoursesTaught()**: Setter methods for teacher attributes.
- **printInfo()**: Prints teacher details along with courses taught.
- **countCourseLevel(int level)**: Counts the number of courses of a specific level.
- **calculateExtraPayment()**: Calculates extra payment based on the courses taught.
- **calculateTotalSalary()**: Calculates the total salary by adding the basic salary and extra payments.

### 3. **Driver.java**

This is the main driver class of the program. It handles user input, allows users to manage multiple teachers and their courses, and provides options to print information and calculate salaries.

Key Features:
- **Teacher Input**: Allows users to input teacher details, including name, ID, salary, and courses taught.
- **Menu System**: Provides an interactive menu for the user to choose various tasks such as printing teacher information, calculating total salary, and modifying teacher details.
- **Task Options**: Allows the user to:
  - Print teacher information.
  - Display teachers' total salaries.
  - Modify a teacher's basic salary.
  - Display the sum of total salaries for all teachers.

## How to Use

1. **Run the program**: Execute the `Driver.java` file.
2. **Enter teacher information**: Input the number of teachers and their corresponding details (name, ID, basic salary, extra payment rate, and courses taught).
3. **Choose a task**: After entering the teacher details, the program will display a menu with the following options:
   - Option 1: Print teacher information by entering the teacher's ID.
   - Option 2: Display the total salary for each teacher.
   - Option 3: Change a teacher's basic salary.
   - Option 4: Display the sum of all teachers' total salaries.
   - Option 5: Exit the program.



