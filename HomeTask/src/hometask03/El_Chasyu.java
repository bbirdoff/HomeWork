package hometask03;
/*����������� ���� ���������� ����� � ������� �� 00:00 �� 23:59. ���������� ������� 
��� �� ����� ��������� ���, ��� ����� �� ��������� ������������ ������������ 
���������� ��� ���, ��� ������ �� ��������� (��������, 02:20, 11:11 ��� 15:51).*/
public class El_Chasyu {
	public static void main(String[] args) {
		
		String v0="0";
		int count=0;
//������� 2 �����(1 ���������), �������� ���� ������ �����		
		for(int i=0;i<25;i++){
			String v1=String.valueOf(i);//��������� int toString
			if(v1.length()==1){	//���� ����� �� 2-�����., ��������� � ������ 0
				v1=v0.concat(v1);
			}
			
			for(int j=0;j<61;j++){	
				String v2=String.valueOf(j);
				if(v2.length()==1){
					v2=v0.concat(v2);
				}
				
			//������������ �������� ���������� � String �� char-������� � ����������
				if(v1.charAt(0)==v1.charAt(1)&&v2.charAt(0)==v2.charAt(1)&&
				v1.charAt(0)==v2.charAt(1)
				||v1.charAt(0)==v2.charAt(1)&&v1.charAt(1)==v2.charAt(0)){
					count++;//���� ������� ���������, ����������� �������
					System.out.println(v1.concat(":").concat(v2));
				}
			}
			
		}
		System.out.println(count);
		
		
		
	}	
	}


