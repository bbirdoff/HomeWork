package hometask03;
/*� ������ N ������ � ������� �������������� �� �������� �������� �������. ������ 
������ ���������� ���� ���������� � ������� ���������� ����� ������� � �������� �� 
000001 �� 999999. ����������� ��������� ������� � �������� ����� ������ ��� ���� 
������ ����� ����� ��������� ��� ����, ���, ��������, � ������� � �������� 003102 
��� 567576. ���������� ���� ������ �������� ������� ���������� ������� ����������� 
������ � ������ �����������, ��� ����� ��������� �����������. � ������� ��������� 
����������� ������� ���������� ������� � ����� ������?*/
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
//����� ������� ���������, �������� ��� ��������, ����� �� �����������  
//������������ ����� ������� ���� �������� �����
			sum=0;
			sum2=0;
		}
		
		System.out.println(count);
	}
}
