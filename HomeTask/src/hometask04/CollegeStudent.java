package hometask04;

import java.util.Scanner;

public class CollegeStudent extends Student {
	int year=0;
	String major;
	
	static String[] yEar={null,null,null,"2001","2003"};
	static String[] mAjor={null,null,null,"Managment","Judgement\n"};
	
	
	CollegeStudent(int i) {
		super(i);
		if(yEar[i]==null){
		
		}else{
		System.out.print(" year:");
		System.out.print(this.year=Integer.parseInt(yEar[i]));
		}
		if(mAjor[i]==null){
		
		}else{
		System.out.print(this.major=" majority:"+mAjor[i]);
		}
		
	}
	

	static void setYear(int i){
		System.out.print("Set the new year: ");
		yEar[i]=scan.nextLine();
	}
	static void setMajor(int i){
		System.out.print("Set the new major: ");
		mAjor[i]=scan.nextLine();
	}
	
	static void setAllParam(int i){		//Method, which sets all params(which defined in that class) in any class
		setName(i);
		System.out.print(" ");
		setGender(i);
		System.out.print(" ");
		setAge(i);
		System.out.print(" ");
		if(sAlary[i]!=null){
		setSalary(i);
		System.out.print(" ");
		}
		if(sUbject[i]!=null){
		setSubject(i);
		System.out.print(" ");
		}
		if(iDnumber[i]!=null){
		setIdNumber(i);
		System.out.print(" ");
		}
		if(gPa[i]!=null){
		setGpa(i);
		System.out.print(" ");
		}
		if(yEar[i]!=null){
		setYear(i);
		System.out.print(" ");
		}
		if(mAjor[i]!=null){
		setMajor(i);
		System.out.print(" ");
		}
	}
	
	
	
	static String getYear(int i){
		System.out.print(yEar[i]);
		return yEar[i];
	}
	static String getMajor(int i){
		System.out.print(mAjor[i]);
		return mAjor[i];
	}
	
	static void getAllParam(int i){			//Method, which allows to get all params(which defined in that class) in any class
		getName(i);
		System.out.print(" ");
		getGender(i);
		System.out.print(" ");
		getAge(i);
		System.out.print(" ");
		if(sAlary[i]!=null){
		getSalary(i);
		System.out.print(" ");
		}
		if(sUbject[i]!=null){
		getSubject(i);
		System.out.print(" ");
		}
		if(iDnumber[i]!=null){
		getIdNumber(i);
		System.out.print(" ");
		}
		if(gPa[i]!=null){
		getGpa(i);
		System.out.print(" ");
		}
		if(yEar[i]!=null){
		getYear(i);
		System.out.print(" ");
		}
		if(mAjor[i]!=null){
		getMajor(i);
		System.out.print(" ");
		}
	}
	
	
	static void setSomeParam(int i){		//Method, which allows to set any params(which defined in that class) in any class
		int count=0;
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int nameCounter=0;
		int genderCounter=0;
		int ageCounter=0;
		int salaryCounter=0;
		int subjectCounter=0;
		int idCounter=0;
		int gpaCounter=0;
		int yearCounter=0;
		int majorCounter=0;
		
		while(true){
			
			if(count>0){
				System.out.print("Do you want to set any parameter else?\n(Enter yes or no): ");
				String str1=sc1.nextLine();
				if(str1.contains("yes")){
					
				}else{
					break;
				}
			}
			
		System.out.print("Choose exact what date you want to set:\nName(1)\ngender(2)\nage(3)\nSalary(4)\nSubject(5)\nid(6)\ngpa(7)\nyear(8)\nmajor(9)\n(Enter the parameter):");// It's g variable
		String str=sc.nextLine();
		
		if(str.contains("name")&&nameCounter<2){//ставим nameCounter<2, т.к. его нач.знач.=0, а пос-
			setName(i);							//ле
			nameCounter++;						//данного инкремента, его знач.=1
			System.out.println();
		}if(nameCounter>=2){
			System.out.println("You already set this parameter!");
			continue;
		}
		
		if(str.contains("gender")&&genderCounter<2){
			setGender(i);
			genderCounter++;
			System.out.println();
		}if(genderCounter>=2){
			System.out.println("You already set this parameter!");	
			continue;
		}
		
		if(str.contains("age")&&ageCounter<2){
			setAge(i);
			ageCounter++;
			System.out.println();
		}if(ageCounter>=2){
			System.out.println("You already set this parameter!");
			continue;
		}
		
		if(str.contains("salary")&&sAlary[i]!=null&&salaryCounter<2){
			setSalary(i);
			salaryCounter++;
			System.out.println();
		}if(salaryCounter>=2){
			System.out.println("You already set this parameter!");
			continue;
		}
		
		if(str.contains("subject")&&sUbject[i]!=null&&subjectCounter<2){
			setSubject(i);
			subjectCounter++;
			System.out.println();
		}if(subjectCounter>=2){
			System.out.println("You already set this parameter!");
			continue;
		}
		
		if(str.contains("id")&&iDnumber[i]!=null&&idCounter<2){
			setIdNumber(i);
			idCounter++;
			System.out.println();
		}if(idCounter>=2){
			System.out.println("You already set this parameter!");
			continue;
		}
		
		if(str.contains("gpa")&&gPa[i]!=null&&gpaCounter<2){
			setGpa(i);
			gpaCounter++;
			System.out.println();
		}if(gpaCounter>=2){
			System.out.println("You already set this parameter!");
			continue;
		}
		
		if(str.contains("year")&&yEar[i]!=null&&yearCounter<2){
			setYear(i);
			yearCounter++;
			System.out.println();
		}if(yearCounter>=2){
			System.out.println("You already set this parameter!");
			continue;
		}
		
		if(str.contains("major")&&mAjor[i]!=null&&majorCounter<2){
			setMajor(i);
			majorCounter++;
			System.out.println();
		}if(majorCounter>=2){
			System.out.println("You already set this parameter!");
			continue;
		}
		
		count++;
	}
	}
	
	
	static void getSomeParam(int i){			//Method, which allows to get any params(which defined in that class) in any class
		int count=0;
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int nameCounter=0;
		int genderCounter=0;
		int ageCounter=0;
		int salaryCounter=0;
		int subjectCounter=0;
		int idCounter=0;
		int gpaCounter=0;
		int yearCounter=0;
		int majorCounter=0;
		
		while(true){
			
			if(count>0){
				System.out.print("Do you want to get any parameter else?\n(Enter yes or no): ");
				String str1=sc1.nextLine();
				if(str1.contains("yes")){
					
				}else{
					break;
				}
			}
		
		System.out.print("Choose exact what date you want to get:\nName(1)\ngender(2)\nage(3)\nSalary(4)\nSubject(5)\nid(6)\ngpa(7)\nyear(8)\nmajor(9)\n(Enter the parameter):");// It's g variable
		String str=sc.nextLine();
		
		if(str.contains("name")&&nameCounter<2){//ставим nameCounter<2, т.к. его нач.знач.=0, а пос-
			getName(i);							//ле
			nameCounter++;						//данного инкремента, его знач.=1
			System.out.println();
		}if(nameCounter>=2){
			System.out.println("You already get this parameter!");
			continue;
		}
		
		if(str.contains("gender")&&genderCounter<2){
			getGender(i);
			genderCounter++;
			System.out.println();
		}if(genderCounter>=2){
			System.out.println("You already get this parameter!");	
			continue;
		}
		
		if(str.contains("age")&&ageCounter<2){
			getAge(i);
			ageCounter++;
			System.out.println();
		}if(ageCounter>=2){
			System.out.println("You already get this parameter!");
			continue;
		}
		
		if(str.contains("salary")&&sAlary[i]!=null&&salaryCounter<2){
			getSalary(i);
			salaryCounter++;
			System.out.println();
		}if(salaryCounter>=2){
			System.out.println("You already get this parameter!");
			continue;
		}
		
		if(str.contains("subject")&&sUbject[i]!=null&&subjectCounter<2){
			getSubject(i);
			subjectCounter++;
			System.out.println();
		}if(subjectCounter>=2){
			System.out.println("You already get this parameter!");
			continue;
		}
		
		if(str.contains("id")&&iDnumber[i]!=null&&idCounter<2){
			getIdNumber(i);
			idCounter++;
			System.out.println();
		}if(idCounter>=2){
			System.out.println("You already get this parameter!");
			continue;
		}
		
		if(str.contains("gpa")&&gPa[i]!=null&&gpaCounter<2){
			getGpa(i);
			gpaCounter++;
			System.out.println();
		}if(gpaCounter>=2){
			System.out.println("You already get this parameter!");
			continue;
		}
		
		if(str.contains("year")&&yEar[i]!=null&&yearCounter<2){
			getYear(i);
			yearCounter++;
			System.out.println();
		}if(yearCounter>=2){
			System.out.println("You already get this parameter!");
			continue;
		}
		
		if(str.contains("major")&&mAjor[i]!=null&&majorCounter<2){
			getMajor(i);
			majorCounter++;
			System.out.println();
		}if(majorCounter>=2){
			System.out.println("You already get this parameter!");
			continue;
		}
		
		count++;
	}
	}
	
	static int s=0;
	static int whoSDate(int s){			//Sub-method, which defines with who's data the super class will work by assigning, than returning int s in the super class
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Who's data you want to change/get?\nBob\nPaul\nSusie\nMike\nGreg\n(Enter the needed name): ");
		String str=sc.nextLine();
		
		if(str.contains("Bob")){
		s=0;	
		}
		
		if(str.contains("Paul")){
		s=1;	
		}
		
		if(str.contains("Susie")){
		s=2;	
		}
		
		if(str.contains("Mike")){
		s=3;	
		}
		
		if(str.contains("Greg")){
		s=4;	
		}
		return s;
	}
	
}
