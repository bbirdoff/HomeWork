package hometask04_;

import java.util.Scanner;

public class Student extends Person {
	
	static class Susie{
		static String name="Susie ";
		static String age="20 ";
		static String gender="female ";
		static String id="250";
		static String gpa="370 ";
		//super("Susie ","20","female","250","370");
		static void toPrint(){
			System.out.println(name+"age: "+age+"gender: "+gender+"id "+id+" gpa "+gpa);
		}
	}

static String id="not defined";
static String gpa="0";

Student(String nam,String ag,String gend,String id_,String gpa_){
	super(name,age,gender);
	Student.id=id_;
	Student.gpa=gpa_;
}


static Scanner scan=new Scanner(System.in);
static String setId(){
	System.out.print("Enter the id: ");
	return Student.id="id:"+scan.nextLine().concat(" ");
	
}

static String setGpa(){
	System.out.print("Enter the gpa: ");
	return Student.gpa="gpa:"+scan.nextLine().concat(" ");
	
}


static String getId(){
	return Student.id;
}
static String getGpa(){
	return Student.gpa;
}

public static String to_String(){
	return "id="+Student.id.concat("\ngpa=").concat(String.valueOf(Student.gpa));
}
}
