package OOPConcepts;
import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int id,age, bonus, stud_id ;
		int zipcode;
		String name, major, jobTitle, club;
		String street,city,state;
		char gender;
		double salary, subject1, subject2, subject3;
		
		
		Scanner scan = new Scanner(System.in);
		
		//Employee display
		
	/*	System.out.println("Enter Employee id: ");
		id = scan.nextInt();
		
		System.out.println("Enter Employee name: ");
		name = scan.next();
		
		System.out.println("Enter Employee age: ");
		age = scan.nextInt();
		
		System.out.println("Enter Employee Gender: ");
		gender = scan.next().charAt(0);
		
		System.out.println("Enter Street: ");
		street = scan.next();
		
		scan.nextLine();
		System.out.println("Enter City: " );
		city = scan.next();
		
		System.out.println("Enter State: ");
		state = scan.next();
		
		System.out.println("Enter Zipcode: ");
		zipcode= scan.nextInt();
		
		
		System.out.println("Enter Employee Salary: ");
		salary = scan.nextDouble();
		
		System.out.println("Enter Employee Bonus: ");
		bonus = scan.nextInt();
		
		Employee emp1 = new Employee(id,name, age,gender,salary);
		 
		emp1.createAddress(street, city, state, zipcode);
		
		emp1.display();
		//System.out.println(emp1.createAddress(street,city,state, zipcode));
		
		System.out.println("Enter Job title: ");
		jobTitle = scan.next();
		
		System.out.println("Job Title: " +emp1.title(jobTitle));
		System.out.println("netSalary with bonus:  "+emp1.calculate(bonus));
		System.out.println("");
		
		//End of Employee input */
		

		//Student display
		
		System.out.println("Enter student name: ");
		//scan.nextLine();
		name = scan.next();
	
		
		System.out.println("Enter student id: ");
		stud_id = scan.nextInt();
		
		System.out.println("Enter student age: ");
		age = scan.nextInt();
		
		System.out.println("Enter Student Gender: ");
		gender = scan.next().charAt(0);
		
		System.out.println("Enter grade for subject 1: ");
		subject1 = scan.nextFloat();
		
		System.out.println("Enter grade for subject 2: ");
		subject2 = scan.nextFloat();
		
		System.out.println("Enter grade for subject 3: ");
		subject3 = scan.nextFloat();
		
		System.out.println("Enter student club: ");
		club = scan.next();
		
		System.out.println("Enter Student Major: ");
		scan.nextLine();
		major = scan.next();
		
		System.out.println("Please enter street address");
		street= scan.next();
		
		System.out.println("Enter city");
		city = scan.next();
		
		System.out.println("Enter state");
		state = scan.next();
		
		scan.nextLine();
		
		System.out.println("Enter zipcode");
		zipcode = scan.nextInt();
		
		Students stud1 = new Students(name,stud_id, age, gender,subject1,
	subject2,
	subject3,
	major);
		
		stud1.createAddress(street, city, state, zipcode);

		stud1.display();
		
		System.out.println("Club: " +stud1.title(club));
		System.out.println("");
		System.out.println("Total Score: " +stud1.calculate(3));
		System.out.println("");
		System.out.println("");
	
		System.out.println(" ");
		System.out.println(" ");
		
		
	
		//Person 1 - getters and setters
	
		
		Person1 p1 = new Person1();
		
		System.out.println("Please enter your name: ");
		//personName = scan.next();
		p1.setpersonName(scan.next());
		
		System.out.println("Please enter your age: ");
	    //age = scan.nextInt();
		p1.setpersonAge(scan.nextInt());
		
		System.out.println("Please enter your gender: ");
		//gender = scan.next().charAt(0);
		p1.setpersonGender(scan.next().charAt(0));
		
		Person1 p2 = new Person1();
		
		System.out.println("Please enter your name: ");
		//name = scan.next();
		p2.setpersonName(scan.next());
		
		System.out.println("Please enter your age: ");
		//age = scan.nextInt();
		p2.setpersonAge(scan.nextInt());
		
		System.out.println("Please enter your gender: ");
		//gender = scan.next().charAt(0);
		p2.setpersonGender(scan.next().charAt(0));
		
		System.out.println("Your name is: " + p1.getpersonName());		System.out.println("Your age is: " + p1.getpersonAge());
		System.out.println("Your gender is " + p1.getpersonGender());
		
		System.out.println("Your 1name is: " + p2.getpersonName());
		System.out.println("Your 1age is: " + p2.getpersonAge());
		System.out.println("Your 1gender is " + p2.getpersonGender());
		
		
		scan.close();
		
		
		
	}

}
