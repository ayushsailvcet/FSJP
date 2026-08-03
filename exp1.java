import java.util.*;


class student {
	String name;
	int roll;
	float marks;
	

	void input_details(Scanner s) {
		System.out.println("Enter Your Name :");
		name = s.next();
		System.out.println("Enter Roll number :");
         	roll = s.nextInt();
         	System.out.println("Enter Marks :");
         	marks = s.nextFloat();
	}

	void display_details() {
		System.out.println("Name : " + name + ", Roll Number : " + roll + ", Marks : " + marks);
	}
}


class main{
 	 public static void main(String x[]) {	
   	 	Scanner s = new Scanner(System.in);
  
    		student  S1 = new student();
    		S1.input_details(s);
  
    		student S2 = new student();
    		S2.input_details(s);
		
			
		System.out.println(" ************ Students Details ************");
    		S1.display_details();
    		S2.display_details();

 	 }

}
