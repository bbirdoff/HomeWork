package hometask03;

import java.util.Scanner;

/*�������� ���, ������� ������� ��� ������� ����� �� ��������� �� 2 �� n (��������� �
����������). ��������� ������ ����: 2,3,5,7 ...*/
public class Ryad_Prost_Chisel_Main {
	public static int t=0;
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the length of secuence: ");
		if(scan.hasNextInt()){
			t=scan.nextInt();
		}
		Ryad_Prost_Chisel h=new Ryad_Prost_Chisel();
		h.getSimpleNumber(t);
		
	}
}
