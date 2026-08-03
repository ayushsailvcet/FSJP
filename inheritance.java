/*	
EXP - 3
Write a Java program that demonstrates the following types of inheritance using classes:
1. Single Inheritance:
	○ Create a base class Person with attributes name and age.
	○ Create a derived class Student that inherits from Person and adds attributes
	    like course and roll Number.

2. Multilevel Inheritance:
	○ Extend Student into a subclass Graduate Student with an additional attribute
	    graduation Year.

3. Hierarchical Inheritance:
	○ Create other subclasses like Teacher and Administrator that also inherit from
            Person and include relevant attributes.
*/

import java.util.*;

class number {
	int a, b;
	
	void accept() {
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter two numbers : ");
		a = s.nextInt();
		b = s.nextInt();
	}
}


class addition extends number {
	int c;
	void add() {
		c = a + b;
		System.out.println("Addition : "+c);
	}
}

class inheritance {
	public static void main(String args[]) {
		addition ob=new addition();
		ob.accept();
		ob.add();
	}
}
		
	