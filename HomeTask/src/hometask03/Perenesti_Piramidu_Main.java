package hometask03;

import java.util.Scanner;

/*������� 3 �������, �� ���� �� ������� �������� N �����, ������ ������ ���������� 
�������� � ����� ������� �� �������. ��������� ��������� �������� �� N ����� � ������ 
������� �� ������ �� ���������� ����� �����. �� ���� ��� ����������� ���������� ������
���� ������, ������ ������ ������ ������� ������ �� �������.*/
public class Perenesti_Piramidu_Main {

	public static void main(String[] args) {
		int n=0;//���-�� ����� � ��������
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
