package hometask04;

public class Teacher extends Person  {
	double salary;
	String subject;
	
	static String[] sAlary={null,"1230.4",null,null,null};
	static String[] sUbject={null,"Chemistry",null,null,null};
	
	
	Teacher(int i) {
		super(i);
		if(sAlary[i]==null){
			
		}else{
		System.out.print(" salary:");
		System.out.print(this.salary=Double.parseDouble(sAlary[i]));
		}
		if(sUbject[i]==null){
			
		}else{
		System.out.print(this.subject=" subject:"+sUbject[i]);
		}
		
		if(sUbject[i]==null){
			
		}
		
	}
	
	
	static void setSalary(int i){
		System.out.print("Set the new salary: ");
		sAlary[i]=scan.nextLine();
	}
	static void setSubject(int i){
		System.out.print("Set the new subject: ");
		sUbject[i]=scan.nextLine();
	}
	
	static String getSalary(int i){
		System.out.print(sAlary[i]);
		return sAlary[i];
	}
	static String getSubject(int i){
		System.out.print(sUbject[i]);
		return sUbject[i];
	}
	
	static void getAllTeacherParam(int i){
		getSalary(i);
		getSubject(i);
	}
}
