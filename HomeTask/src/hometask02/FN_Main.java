package hometask02;
import java.util.Scanner;
////Последнее задание, НЕСКОЛЬКО ПЕРЕМ.В ОДНОЙ, КЛАСС MAIN
/*Создать класс, который будет хранить в одной целочисленной переменной несколько 
значений меньшей длины. Например, возраст, вес, рост и год рождения. Добавить методы
получения и добавления параметров отдельно.*/
public class FN_Main {
	static long common=227217293;//целочисленная переменная, хранящая заданные знач.
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
