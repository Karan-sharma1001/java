package new_expt;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TestEmp {
public static void main(String[] args) {
	File f1=new File("store1.txt");
	Employee [ ] e=new Employee[3];
	Scanner sc =new Scanner(System.in);
	FileOutputStream fos;
	DataOutputStream oos;
	//ObjectOutputStream oos;
	for (int i = 0; i < e.length; i++) {
		System.out.println("enter details of employee int int string");
			e[i]=new Employee(sc.nextInt(),sc.nextInt(),sc.next());
	}
	
	try {
		fos=new FileOutputStream(f1);
		oos= new DataOutputStream(fos);
	//	oos= new ObjectOutputStream(fos);
		
		for (int i = 0; i < e.length; i++) {
			String str= (e[i].toString());
		oos.writeBytes(str);  
		oos.writeBytes("\n");
		System.out.println(e[i]);
		
		}
	} catch (FileNotFoundException e1) {	} 
		catch (IOException e1) {	}

}
}
