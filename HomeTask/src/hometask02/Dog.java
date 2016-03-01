package hometask02;

/*—оздать класс Dog, который будет содержать 2 пол€ name и says. ¬ main( ) создать 2 
экземпл€ра класса с name УspotФ (says, УRuff!Ф) и УscruffyФ (says, УWurf!Ф). » 
распечатать пол€ объектов.*/
public class Dog {
	static String name;
	static String says;
	public void setParams(String name,String says){
		this.name=name;
		this.says=says;
		System.out.println(name.concat(" says ").concat(says));
	}
}
