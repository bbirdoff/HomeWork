package hometask02;
import java.util.Scanner;
////��������� �������, ��������� �����.� �����, ����� MAIN
/*������� �����, ������� ����� ������� � ����� ������������� ���������� ��������� 
�������� ������� �����. ��������, �������, ���, ���� � ��� ��������. �������� ������
��������� � ���������� ���������� ��������.*/
public class FN_Main {
	static long common=227217293;//������������� ����������, �������� �������� ����.
	public static void main(String[] args) {
		
		FN fn=new FN();
		//long r=fn.addParams (common);
		//String s=fn.getParams(MethodsName, r, beginOfParam, lengthOfParam)
		System.out.println(fn.getHeigth(common));
		System.out.println(fn.getAge(common));
		System.out.println(fn.getMas(common));
		System.out.println(fn.getHeigth(common));
		System.out.println(fn.getYearOfBirth(common));

	}
}
