package hometask04_;

public class CollegeStudent extends Student {
	String major;
	int year=0;
	
	CollegeStudent(String name,String age,String gender,String id,String gpa,String major,int year){
		super(name,age,gender,id,gpa);
		this.major=major;
		this.year=year;
	}
	
	void setMajor(String major){
		this.major=major;
	}
	String getMajor(){
		return this.major;
	}
	
	void setYear(int year){
		this.year=year;
	}
	int getYear(){
		return this.year;
	}
}
