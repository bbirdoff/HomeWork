package hometask03;

import java.util.Scanner;

/*�������� �����, ������� ��� ������� ����� n (��������� � ����������) ��������� �����
����� �� 1 �� n;*/
public class Summa {
	static int t=0;
	
	public static int sum(int t){
		if(t==1){
			return 1;
		}
		t=sum(t-1)+t;
		return t;
	}

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.print("Enter the number: ");
	if(scan.hasNextInt()){
		t=scan.nextInt();
	}
	
	System.out.println(sum(t));
	}

}
