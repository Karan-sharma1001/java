package new_expt;

import java.io.*;
import java.util.Scanner;

public class Nwe {
public static void main(String[] args) throws IOException {
		File f=new File("ABX.txt");
		File f1=new File("policy.txt");
			PrintWriter pw=new PrintWriter(f);
			pw.write("Hello program created");
			pw.close();
			Scanner sc=new Scanner(f1);
			FileInputStream fis=new FileInputStream(f);
			DataInputStream dis=new DataInputStream(fis);
			int z;
			while((z=dis.read())!=-1){
				System.out.print((char)z);
			}
				while(sc.hasNextLine())
				{
					String a=sc.next();
					System.out.println(a);
				}
			sc.close();
	/*

	        try {
	            System.out.print("Enter the file name with extension : ");

	            Scanner input = new Scanner(System.in);

	            File file = new File(input.nextLine());

	            input = new Scanner(file);


	            while (input.hasNextLine()) {
	                String line = input.nextLine();
	                System.out.println(line);
	            }
	            input.close();

	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }*/
	    }
				
			
}

