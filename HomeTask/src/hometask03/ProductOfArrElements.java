package hometask03;

import java.util.Random;

/*C������ ��������� ������ �� 7 ����� �� 4 ������� � ������ �� ��������� ����� ����� 
�� ������� [-5;5]. ������� ������ �� �����. ���������� � ������� �� ����� ������ 
������ � ���������� �� ������ ������������� ���������. ���� ����� ����� ���������, ��
������� ������ ������ ������������� �� ���.*/
public class ProductOfArrElements {

	public static void main(String[] args) {
		int prod0=1;//������������ ��������� 0-� ������ �������
		int prod1=1;//������������ ��������� 1-� ������ �������
		int prod2=1;//������������ ��������� 2-� ������ �������
		int prod3=1;//������������ ��������� 3-� ������ �������
		int prod4=1;//������������ ��������� 4-� ������ �������
		int prod5=1;//������������ ��������� 5-� ������ �������
		int prod6=1;//������������ ��������� 6-� ������ �������
		int indOfMaxStr=0;//� ������ ������� � ������������ ������������� ���������
		int maxProdOfStrEl=0;//������������ ������������ ��������� ������ �������
		
		int arr[][]=new int[7][4];
		Random r=new Random();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=r.nextInt(10)-5;
				
				System.out.print(arr[i][j]+" ");
				
				if(i==0){
					prod0*=Math.abs(arr[i][j]);
					}
					if(prod0>maxProdOfStrEl){
						maxProdOfStrEl=prod0;
						indOfMaxStr=i;
					}
					if(i==1){
					prod1*=Math.abs(arr[i][j]);
					}
					if(prod1>maxProdOfStrEl){
						maxProdOfStrEl=prod1;
						indOfMaxStr=i;
					}
					if(i==2){
					prod2*=Math.abs(arr[i][j]);
					}
					if(prod2>maxProdOfStrEl){
						maxProdOfStrEl=prod2;
						indOfMaxStr=i;
					}
					if(i==3){
					prod3*=Math.abs(arr[i][j]);
					}
					if(prod3>maxProdOfStrEl){
						maxProdOfStrEl=prod3;
						indOfMaxStr=i;
					}
					if(i==4){
					prod4*=Math.abs(arr[i][j]);
					}
					if(prod4>maxProdOfStrEl){
						maxProdOfStrEl=prod4;
						indOfMaxStr=i;
					}
					if(i==5){
					prod5*=Math.abs(arr[i][j]);
					}
					if(prod5>maxProdOfStrEl){
						maxProdOfStrEl=prod5;
						indOfMaxStr=i;
					}
					if(i==6){
					prod6*=Math.abs(arr[i][j]);
					}
					if(prod6>maxProdOfStrEl){
						maxProdOfStrEl=prod6;
						indOfMaxStr=i;
					}
			}
			System.out.println();
		}
		
		System.out.println(indOfMaxStr);
	}

}
