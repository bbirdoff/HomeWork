package hometask02;

import java.util.Scanner;

/*—оздать программу, провер€ющую и сообщающую на экран, €вл€етс€ ли целое число, 
записанное в переменную n, чЄтным либо нечЄтным (n Ц вводит пользователь).*/
public class Chet_Nechet {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int t=0;
	System.out.print("Enter the number: ");
	if(scan.hasNext()){
		t=scan.nextInt();
	}
	if(t%2==0){
		System.out.println("Your number is even");
	} else{
		System.out.println("Your number isn't even");
	}
	}

}
