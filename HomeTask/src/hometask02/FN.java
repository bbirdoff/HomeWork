package hometask02;
//��������� �������, ��������� �����.� �����
import java.util.Scanner;
/*������� �����, ������� ����� ������� � ����� ������������� ���������� ��������� 
�������� ������� �����. ��������, �������, ���, ���� � ��� ��������. �������� ������
��������� � ���������� ���������� ��������.*/
public class FN {
	int age=0;
	int mas=0;
	int heigth=0;
	int yearOfBirth=0;
	String MethodsName;
	int beginOfParam=0;//������ ������ ����������
	int lengthOfParam=0;//����� ����������
	
	//����� ���������� ������ ���������
	public long addParams(long common){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the param's name: ");
		String MethodsName=scan.nextLine();//�������� ��� ���������
		System.out.println("Enter the param's value: ");
		int value=scan.nextInt();//�������� �������� ���������
		String f=String.valueOf(common);//������������ ����� ���������� � ������
		String f_=String.valueOf(value);//������������ �������� ��������� � ������
		String f_sum=f.concat(f_);//������������ �������� (����� ����������+����.�����.)
		int beginOfParam=f.length();//�������� �������� ������ ��� ������ ���������
		int lengthOfParam=f_.length();//�������� ����� ��� ������ ���������
		common=Long.parseLong(f_sum);
		return common;//���������� �������� (����� ����������+����.������ �����.)
	}
	
	//����� ��������� ����������(� 1-� ������� ��� �����������)
	public String getParams(String MethodsName,long common,int beginOfParam,
	int lengthOfParam){
		String common1=Integer.toString((int) common);
		char[] arr=common1.toCharArray();
		String x=String.copyValueOf(arr, beginOfParam, lengthOfParam);//�������� � ������� ������ �������� ��������� �� ����� ����������
		MethodsName.concat(x);//��������� �������� �������� � �������� ������(� ������� ������)
		return MethodsName;
	}

public int getAge(long common){
	String common1=Integer.toString((int) common);
	char[] arr=common1.toCharArray();
	String x=String.copyValueOf(arr, 0, 2);
	age=Integer.parseInt(x);
	return age;
}

public int getMas(long common){
	String common1=Integer.toString((int) common);
	char[] arr=common1.toCharArray();
	String x=String.copyValueOf(arr, 2, 2);
	mas=Integer.parseInt(x);
	return mas;
}

public int getHeigth(long common){
	String common1=Integer.toString((int) common);
	char[] arr=common1.toCharArray();
	String x=String.copyValueOf(arr, 4, 3);
	heigth=Integer.parseInt(x);
	return heigth;
}

public int getYearOfBirth(long common){
	String common1=Integer.toString((int) common);
	char[] arr=common1.toCharArray();
	String x=String.copyValueOf(arr, 7, 2);
	yearOfBirth=Integer.parseInt(x);
	return yearOfBirth;
}
}

