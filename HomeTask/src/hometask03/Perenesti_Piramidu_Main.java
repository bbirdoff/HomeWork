package hometask03;

import java.util.Scanner;

/*Имеется 3 стержня, на один из которых нанизаны N колец, причем кольца отличаются 
размером и лежат меньшее на большем. Требуется перенести пирамиду из N колец с одного 
стержня на другой за наименьшее число ходов. За один раз разрешается переносить только
одно кольцо, причем нельзя класть большее кольцо на меньшее.*/
public class Perenesti_Piramidu_Main {

	public static void main(String[] args) {
		int n=0;//кол-во колец в пирамиде
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of parts: ");
		if(scan.hasNextInt()){
			n=scan.nextInt();
		}else{
			System.out.println("Enter the number of parts: ");	
		}
		Perenesti_Piramidu p=new Perenesti_Piramidu();
		System.out.print(p.perenos(n));
	}

}
