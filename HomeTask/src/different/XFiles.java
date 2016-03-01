package different;
/*Создание нового пустого файла(Hello.txt) в указанной директории(D://)*/
import java.io.File;
import java.io.IOException;

public class XFiles {

	public static void main(String[] args) {
		File file=new File("D://", "Hello.txt");
		try{
			boolean b=file.createNewFile();
			if(b){
				System.out.println("The new file is created");
			}
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}

}
