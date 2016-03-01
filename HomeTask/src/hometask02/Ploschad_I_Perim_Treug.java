package hometask02;

import java.util.Scanner;

/*В переменных a и b лежат положительные длины катетов прямоугольного треугольника. 
Вычислить и вывести на экран площадь треугольника и его периметр (a и b – вводит 
пользователь).*/
public class Ploschad_I_Perim_Treug {

	public static void main(String[] args) {
		int a=0;
		int b=0;
		int sqv=0;
		int perim=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the a-length: ");
		if(scan.hasNext()){
			a=scan.nextInt();
		}
		System.out.print("Enter the b-length: ");
		if(scan.hasNext()){
			b=scan.nextInt();
		}
		sqv=(int)a*b/2;
		perim=(int)(a+b+(Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2))));
		System.out.println("Perim is "+perim);
		System.out.println("Sqv is "+sqv);
	}

}
