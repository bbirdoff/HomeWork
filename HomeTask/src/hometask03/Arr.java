package hometask03;

import java.util.Random;

/*������� ��������� ������ �� 8 ����� �� 5 �������� � ������ �� ��������� ����� �����
�� ������� [10;99]. ������� ������ �� �����.*/
public class Arr {

	public static void main(String[] args) {
		int arr[][]=new int[8][5];
		Random r=new Random();
		for(int i=0;i<8;i++){
			for(int j=0;j<5;j++){
				arr[i][j]=r.nextInt(89)+10;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
