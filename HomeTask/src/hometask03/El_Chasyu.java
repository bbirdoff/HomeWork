package hometask03;
/*Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько 
раз за сутки случается так, что слева от двоеточия показывается симметричная 
комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).*/
public class El_Chasyu {
	public static void main(String[] args) {
		
		String v0="0";
		int count=0;
//Создаем 2 цикла(1 вложенный), имитируя цикл работы часов		
		for(int i=0;i<25;i++){
			String v1=String.valueOf(i);//переводим int toString
			if(v1.length()==1){	//если число не 2-значн., добавляем в начале 0
				v1=v0.concat(v1);
			}
			
			for(int j=0;j<61;j++){	
				String v2=String.valueOf(j);
				if(v2.length()==1){
					v2=v0.concat(v2);
				}
				
			//раскладываем значения записанные в String на char-символы и сравниваем
				if(v1.charAt(0)==v1.charAt(1)&&v2.charAt(0)==v2.charAt(1)&&
				v1.charAt(0)==v2.charAt(1)
				||v1.charAt(0)==v2.charAt(1)&&v1.charAt(1)==v2.charAt(0)){
					count++;//если условия совпадают, увеличиваем счетчик
					System.out.println(v1.concat(":").concat(v2));
				}
			}
			
		}
		System.out.println(count);
		
		
		
	}	
	}


