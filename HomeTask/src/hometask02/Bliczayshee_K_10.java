package hometask02;

import java.util.Scanner;

/*Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в 
переменные m и n. Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 
(n и m – вводит пользователь).*/
public class Bliczayshee_K_10 {

	public static void main(String[] args) {
		int first=0;
		int second=0;
		int base=10;
		Scanner scan=new Scanner(System.in);
		
			System.out.print("Enter the first number: ");
			if(scan.hasNext()){
				first=scan.nextInt();
			}
			
			System.out.print("Enter the second number: ");
			if(scan.hasNext()){
				second=scan.nextInt();
			}
			
			int first_Abs=Math.abs(base-first);
			int second_Abs=Math.abs(base-second);
			if(first_Abs<second_Abs){
				System.out.print("The first number is closer to base");
			}else{
				System.out.print("The second number is closer to base");
			}
	}

}
