package hometask02;

import java.util.Scanner;

/*������� ���������, ����������� � ���������� �� �����, �������� �� ����� �����, 
���������� � ���������� n, ������ ���� �������� (n � ������ ������������).*/
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
