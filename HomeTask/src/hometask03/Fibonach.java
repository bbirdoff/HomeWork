package hometask03;
/*�������� �� ����� ������ 11 ������ ������������������ ���������. ����������, ��� 
������ � ������ ����� ������������������ ����� ��������, � ������ ��������� � ����� 
���� ����������.*/
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
