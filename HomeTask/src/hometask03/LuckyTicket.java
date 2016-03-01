package hometask03;
/*В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую 
неделю трамвайное депо заказывает в местной типографии рулон билетов с номерами от 
000001 до 999999. «Счастливым» считается билетик у которого сумма первых трёх цифр 
номера равна сумме последних трёх цифр, как, например, в билетах с номерами 003102 
или 567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого 
билета и теперь раздумывает, как много сувениров потребуется. С помощью программы 
подсчитайте сколько счастливых билетов в одном рулоне?*/
public class LuckyTicket {
	
	public static void main(String[] args) {
		
		int sum=0;
		int sum2=0;
		int count=0;
		int t=0;
		int t2=0;
		String v0="0";
		String i_string;
		
		for(int i=0;i<1000000;i++){
			i_string=String.valueOf(i);
			
			
			while(i_string.length()<6){
				i_string=v0.concat(i_string);
			}
			
			
			for(int j=0,k=i_string.length()/2;j<i_string.length()/2;j++,k++){
				t=Character.getNumericValue(i_string.charAt(j));
				t2=Character.getNumericValue(i_string.charAt(k));
				sum+=t;
				sum2+=t2;
				}
		
			if(sum==sum2){
				count++;
			}
//после каждого сравнения, обнуляем эти значения, чтобы не происходило  
//суммирование после каждого шага внешнего цикла
			sum=0;
			sum2=0;
		}
		
		System.out.println(count);
	}
}
