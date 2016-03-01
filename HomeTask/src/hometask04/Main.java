package hometask04;

import java.util.Scanner;

public class Main extends CollegeStudent{
	
	static int i=0;
	
	Main(int i){
		super(i);
	}
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan1=new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner scan2=new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner scan4=new Scanner(System.in);
		
		int count=0;
		
		while(true){
			
			if(count>0){
				System.out.print("Continue?(Enter yes or no): ");
				String str=scan2.nextLine();
				
				if(str.contains("yes")){
					
				}else{
					break;
				}
			}
		System.out.print("Set(1) or get(2) or read all date(3), enter 1 or 2 or 3: ");// It's p variable
		
		int p=scan1.nextInt();
		
		if(p==1){
			
				System.out.print("You want to change all(0) or some date(1)?\n(Enter 0 or 1 number):");
				int t=scan4.nextInt();
				if(t==0){
					setAllParam(whoSDate(s));
				}else{
				
					setSomeParam(whoSDate(s));
				}
				}
				
		if(p==2){
		
					System.out.print("You want to get all(0) or some date(1)?\n(Enter 0 or 1 number):");
					int t=scan4.nextInt();//
					if(t==0){
						getAllParam(whoSDate(s));
					}else{
				
						getSomeParam(whoSDate(s));
					}	
				}
		
		if(p==3){
		for(int j=0;j<5;j++,i++){	
		new CollegeStudent(i);//¬ызываем конструктор последнего класса(в цепочке наследовани€), т.к. через super(), он вызовет конструкторы всех классов по-пор€дку на-
							//чина€ с 1-го(Person)
			}
		}
		count++;
		}
		
	}
}
