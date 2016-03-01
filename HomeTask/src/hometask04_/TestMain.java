package hometask04_;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TestMain extends Student {
			
	TestMain(String name, String age, String gender, String id, String gpa) {
		super(name, age, gender, id, gpa);
		
	}
	
	public static void main(String[] args) throws IOException {
	
	Scanner scan=new Scanner(System.in);
	String text=null;
	String text1=null;
	String text2=null;
	String text3=null;
	String text4=null;

	System.out.print("What do you want, set(1) or get(2) or read(3) data?\nChoose the needed vary(just enter the number of needed item): ");	
	int t=scan.nextInt();
		
	if(t==1){
		while(true){
			
			FileOutputStream fos=new FileOutputStream("C://Droid.txt");
			
		System.out.println("Choose the needed items: ");
		System.out.print("Set the name?(Enter 0(yes) or 1(no))");
		int p=scan.nextInt();
		if(p==0){
		text=setName();
		byte[] buffer=text.getBytes();
		fos.write(buffer, 0, buffer.length);
		}else{
			
		}
		System.out.print("Set the age?(Enter 0(yes) or 1(no))");
		p=scan.nextInt();
		if(p==0){
		text1=setAge();
		byte[] buffer1=text1.getBytes();
		fos.write(buffer1, 0, buffer1.length);
		}else{
			
		}
		System.out.print("Set the gender?(Enter 0(yes) or 1(no))");
		p=scan.nextInt();
		if(p==0){
		text2=setGender();
		byte[] buffer2=text2.getBytes();
		fos.write(buffer2, 0, buffer2.length);
		}else{
			
		}
		System.out.print("Set the Id?(Enter 0(yes) or 1(no))");
		p=scan.nextInt();
		if(p==0){
		text3=setId();
		byte[] buffer3=text3.getBytes();
		fos.write(buffer3, 0, buffer3.length);
		}else{
			
		}
		System.out.print("Set the Gpa?(Enter 0(yes) or 1(no))");
		p=scan.nextInt();
		if(p==0){
		text4=setGpa();
		byte[] buffer4=text4.getBytes();
		fos.write(buffer4, 0, buffer4.length);
		}else{
			
		}
		
		return;
	}
	}
	
		if(t==3){
			try(FileInputStream fis=new FileInputStream("C://Droid.txt")){
				System.out.println("File's size is "+fis.available()+"byte");
				
				while(fis.available()!=0){
					System.out.print((char)fis.read());
				}
			}catch(IOException ex){
				System.out.println(ex.getMessage());
			}
		
		}		

		if(t==2){			
			Person.George.toPrint();
			Student.Susie.toPrint();
			Teacher.mrJhons.toPrint();		
		}
	}
}
