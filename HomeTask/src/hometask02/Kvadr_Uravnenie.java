package hometask02;

import java.util.Scanner;

/*В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
будет находить и выводить на экран вещественные корни квадратного уравнения 
ax^2+bx+c=0, либо сообщать, что корней нет (a, b и c – вводит пользователь).*/
public class Kvadr_Uravnenie {

	public static void main(String[] args) {
		double a=0;
		double b=0;
		double c=0;
		double d=0;
		double x=0;
		double x1=0;
		double x2=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the a-number: ");
		if(scan.hasNext()){
			a=scan.nextInt();
		}
		System.out.print("Enter the b-number: ");
		if(scan.hasNext()){
			b=scan.nextInt();
		}
		System.out.print("Enter the c-number: ");
		if(scan.hasNext()){
			c=scan.nextInt();
		}
		
		d=Math.pow(b, 2)-4*a*c;
		if(d>0){
			x1=(-b+(Math.sqrt(d)))/(2*a);
			x2=(-b-(Math.sqrt(d)))/(2*a);
			System.out.println(x1);
			System.out.println(x2);
		}
		if(d==0){
			x=(-b)/(2*a);
			System.out.println(x);
		}
		if(d<0){
			System.out.println("The equatin has no solutions");
		}
	}

}
