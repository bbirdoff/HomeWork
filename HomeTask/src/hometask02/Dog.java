package hometask02;

/*������� ����� Dog, ������� ����� ��������� 2 ���� name � says. � main( ) ������� 2 
���������� ������ � name �spot� (says, �Ruff!�) � �scruffy� (says, �Wurf!�). � 
����������� ���� ��������.*/
public class Dog {
	static String name;
	static String says;
	public void setParams(String name,String says){
		this.name=name;
		this.says=says;
		System.out.println(name.concat(" says ").concat(says));
	}
}
