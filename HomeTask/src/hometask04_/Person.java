package hometask04_;

import java.util.Scanner;

public class Person {
	
	static class George{//начало static nested class George
		static String name="George ";
		static String age="45 ";
		static String gender="Male";
		
		
		
		static void toPrint(){
		System.out.println(name+"age: "+age+"gender: "+gender);
		}
	}//конец static nested class George
	
	static String name="Yuriy";
	static String age="52";
	static String gender="Male";
	
	Person(String n,String ag,String gend){
		Person.name=n;
		Person.age=ag;
		Person.gender=gend;
	}
	static Scanner scan=new Scanner(System.in);
	static String setName(){
		System.out.print("Enter the name: ");
		return Person.name=scan.nextLine().concat(" ");
	}
	static String getName(){
	return Person.name;
	}
	
	static String setAge(){
		System.out.print("Enter the age: ");
		return Person.age=scan.nextLine().concat(" ");
	}
	static String getAge(){
	return Person.age;	
	}
	static String setGender(){
		System.out.print("Enter the gender: ");
		return Person.gender=scan.nextLine().concat(" ");
	}
	static String getGender(){
	return Person.gender;	
	}
}
