import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class oos {
public static void main(String[] args) {
	FileInputStream fis;//=new FileInputStream("data.txt");
	FileOutputStream fos;//=new FileOutputStream("data1.txt");
	ObjectInputStream ois ;//=new ObjectInputStream(fis);
	ObjectOutputStream oos;//=new ObjectOutputStream(fos);
	
	try {
		File f1=new File("data.txt");
		f1.createNewFile();
		 fis=new FileInputStream(f1);
		fos=new FileOutputStream("data1.txt");

		 oos=new ObjectOutputStream(fos);
		 
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}
}
