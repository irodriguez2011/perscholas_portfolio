package OOPConcepts;

public class Person {
     static int count = 0;
     String pName;
     int pAge;
     char pGender; 
	
	
	
	public Person() {
		count++;
		
	}
	 
	public Person(String name, int age, char gender) {
		pName = name;
		pAge = age;
		pGender = gender;
		count++;
		
	}
	
	
	public void display() {
		System.out.println("Name: " +this.pName);
		System.out.println("Gender: " +this.pAge);
		System.out.println("Age: " +this.pGender);
		
		
	}
	
	public static void totalPerson() {
		System.out.println("Total person objects are: " +count);
	}

	

	
		
}
