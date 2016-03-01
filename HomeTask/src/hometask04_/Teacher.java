package hometask04_;

class Teacher extends Person {
//String chemistry;
//String computerScience;
//String english;
//String biology;
String subject="chemistry";
double salary=1500;

static class mrJhons{
	static String name="mr.Jhons ";
	static String age="45 ";
	static String gender="male ";
	static String subject="biology";
	static String salary="1700 ";
	
	mrJhons(String n,String m,String t,String b,String r){
		mrJhons.subject=b;
		mrJhons.salary=r;
	}

	static void toPrint(){
	System.out.println(name+"age: "+age+"gender: "+gender+"subject "+subject+" salary "+salary);
	}
}

Teacher(String name,String age,String gender,String subject,double salary){
	super(name,age,gender);
	this.subject=subject;
	this.salary=salary;
}
void setSalary(double s){
	this.salary=s;
}
void setSubject(String d){
	this.subject=d;
}
double getSalary(){
	return this.salary;
}
String getSubject(){
	return this.subject;
}
}
