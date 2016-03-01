package hometask03;
import java.util.Scanner;
/*Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех
его цифр (заранее не известно сколько цифр будет в числе).*/
public class SummaCyfr {
	public static void main(String[] args) {
		int res=0;
		int r=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number: ");
		if(scan.hasNext()){
			String y=scan.nextLine();
		
		for(int i=0;i<y.length();i++){
		r=Character.getNumericValue(y.charAt(i));
		res+=r;
	}
		}
		System.out.println(res);
	}
}
