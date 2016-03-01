package hometask03;
/*Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что 
первый и второй члены последовательности равны единицам, а каждый следующий — сумме 
двух предыдущих.*/
public class Fibonach {

	public static void main(String[] args) {
		int quantity=11;
		int count=quantity/2+1;
		
		for(int i=1,j=1,k=0;k<count;i+=j,j+=i,k++){
			
		System.out.print(i+" ");
		
		if(quantity%2!=0 && k==count-1){
			break;
		}
		
		System.out.print(j+" ");
		
		}
	}

}
