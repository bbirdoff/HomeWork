package hometask03;

import java.util.Random;

/*Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел 
из отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс 
строки с наибольшим по модулю произведением элементов. Если таких строк несколько, то
вывести индекс первой встретившейся из них.*/
public class ProductOfArrElements {

	public static void main(String[] args) {
		int prod0=1;//произведение элементов 0-й строки массива
		int prod1=1;//произведение элементов 1-й строки массива
		int prod2=1;//произведение элементов 2-й строки массива
		int prod3=1;//произведение элементов 3-й строки массива
		int prod4=1;//произведение элементов 4-й строки массива
		int prod5=1;//произведение элементов 5-й строки массива
		int prod6=1;//произведение элементов 6-й строки массива
		int indOfMaxStr=0;//№ строки массива с максимальным произведением элементов
		int maxProdOfStrEl=0;//максимальное произведение элементов строки массива
		
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
