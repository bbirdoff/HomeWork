package hometask03;
/*Создайте код, который выводит все простые числа из интервала от 2 до n (заданного с
клавиатуры). Результат должен быть: 2,3,5,7 ...*/
public class Ryad_Prost_Chisel {
	
	static int r=2;
	static int lim=0;
	static int counter=0;
	
	public static int getSimpleNumber(int t){
		
		if(counter==0){
			lim=t;
		}
		counter++;
		
		if(r==lim){
			return lim;
		}
		
		int count=0;
		for(int i=r;i!=1;i--){
			if(r%i==0){
				count++;
			}
		}
		
		if(count==1){
		System.out.print(r+" ");
		r++;
		t=r;
		}else{
			r++;
			t=r;
		}
		
		return getSimpleNumber(t);
		
	}
}