package hometask04;

public class Student extends Teacher {

	String idNumber;
	double gpa;
	
	Student(int i){
		super(i);
		if(iDnumber[i]==null){
			
		}else{
		System.out.print(this.idNumber=" ID:"+iDnumber[i].concat(" "));
		}
		if(gPa[i]==null){
			
		}else{
		System.out.print("gpa:");
		System.out.print(this.gpa=Double.parseDouble(gPa[i]));
		}
	}
	
	static String[] iDnumber={null,null,"122","123","124"};
	static String[] gPa={null,null,"1.3","1.4","1.5"};
	
	static void setIdNumber(int i){
		System.out.print("Set the new ID: ");
		iDnumber[i]=scan.nextLine();
	}
	static void setGpa(int i){
		System.out.print("Set the new Gpa: ");
		gPa[i]=scan.nextLine();
	}
	
	
	static String getIdNumber(int i){
		System.out.print("Id:"+iDnumber[i]);
		return iDnumber[i];
	}
	static String getGpa(int i){
		System.out.print("gpa:"+gPa[i]);
		return gPa[i];
	}
	
	static void getAllStudentParam(int i){
		getIdNumber(i);
		getGpa(i);
	}
	
}
