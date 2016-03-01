package hometask02;
import java.util.Scanner;
/*¬ переменной n хранитс€ натуральное двузначное число. —оздайте программу, 
вычисл€ющую и вывод€щую на экран сумму цифр числа n (n Ц вводит пользователь).*/
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
