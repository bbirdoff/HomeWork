package hometask02;
//Последнее задание, НЕСКОЛЬКО ПЕРЕМ.В ОДНОЙ
import java.util.Scanner;
/*Создать класс, который будет хранить в одной целочисленной переменной несколько 
значений меньшей длины. Например, возраст, вес, рост и год рождения. Добавить методы
получения и добавления параметров отдельно.*/
public class FN {
	int age=0;
	int mas=0;
	int heigth=0;
	int yearOfBirth=0;
	String MethodsName;
	int beginOfParam=0;//индекс начала переменной
	int lengthOfParam=0;//длина переменной
	
	//Метод добавления нового параметра
	public long addParams(long common){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the param's name: ");
		String MethodsName=scan.nextLine();//получаем имя параметра
		System.out.println("Enter the param's value: ");
		int value=scan.nextInt();//получаем значение параметра
		String f=String.valueOf(common);//конвертируем общую переменную в Стринг
		String f_=String.valueOf(value);//конвертируем значение параметра в Стринг
		String f_sum=f.concat(f_);//конвертируем значение (общая переменная+знач.парам.)
		int beginOfParam=f.length();//получаем значение начала для нового параметра
		int lengthOfParam=f_.length();//получаем длину для нового параметра
		common=Long.parseLong(f_sum);
		return common;//возвращаем значение (общая переменная+знач.нового парам.)
	}
	
	//Метод получения параметров(в 1-ю очередь для добавленных)
	public String getParams(String MethodsName,long common,int beginOfParam,
	int lengthOfParam){
		String common1=Integer.toString((int) common);
		char[] arr=common1.toCharArray();
		String x=String.copyValueOf(arr, beginOfParam, lengthOfParam);//получаем в формате Стринг значение параметра из общей переменной
		MethodsName.concat(x);//добавляем числовое значение к названию метода(в формате Стринг)
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

