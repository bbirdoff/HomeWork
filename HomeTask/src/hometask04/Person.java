package hometask04;

import java.util.Scanner;

public class Person {
	
	String name;
	String gender;
	int age;
	
	Person(int i){
		
		System.out.print(this.name=naMe[i].concat(" "));
		
		System.out.print(this.gender="gender:"+geNder[i].concat(" "));
		
		System.out.print("age:");
		System.out.print(this.age=Integer.parseInt(aGe[i]));
		
	}
	
	static String[] naMe={"Bob","\nPaul","\nSusie","\nMike","\nGreg"};	
	static String[] geNder={"M","M","F","M","M"};	
	static String[] aGe={"30","34","25","26","27"};	
	
	
	
	
	/*Person(){
		
	}*/
	static Scanner scan=new Scanner(System.in);
	
	static void setName(int i){
		System.out.print("Set the new name: ");
		naMe[i]=scan.nextLine();
	}
	static void setGender(int i){
		System.out.print("Set the new gender: ");
		geNder[i]=scan.nextLine();
	}
	static void setAge(int i){
		System.out.print("Set the new age: ");
		aGe[i]=scan.nextLine();
	}
	
	
	static String getName(int i){
	System.out.print(naMe[i]);
		return naMe[i];
	}
	static String getGender(int i){
	System.out.print(geNder[i]);
		return geNder[i];
	}
	static String getAge(int i){
	System.out.print(aGe[i]);
		return aGe[i];
	}
	
	static void getAllPersonalParam(int i){
		getName(i);
		getGender(i);
		getAge(i);
	}
	
}

