package new_expt;

import java.io.*;
import java.util.Scanner;

public class File_handling {/*
public static void main(String[] args) throws IOException {
	File f1= new File("Data1.doc");
	//Writing data into file f1
	FileOutputStream fos;//=new FileOutputStream(f1);
	DataOutputStream dos;//=new DataOutputStream(fos);
	fos=new FileOutputStream(f1);
	dos=new DataOutputStream(fos);
	Scanner sc=new Scanner(System.in);
	for (int i = 0; i < 3; i++) {
	
		System.out.println("Enter data for line "+(i+1));
		dos.writeUTF(sc.next());
		}
	
	
	//reading Data from file
FileInputStream fis=new FileInputStream(f1);
DataInputStream dis= new DataInputStream(fis);
	
		//Storing data into string to print

		String a =dis.readUTF();
		System.out.println(a);

	

	
	
	*/
	 public static void main(String[] args) throws IOException {
	      InputStream is = null;
	      DataInputStream dis = null;
	      FileOutputStream fos = null;
	      DataOutputStream dos = null;
	  	File f1= new File("Data1.txt");
	      String[] s = {"Hello", "World!!","\n","Hii..."};
	      
	      try {
	         
	         // create file output stream
	         fos = new FileOutputStream(f1);
	           
	         // create data output stream
	         dos = new DataOutputStream(fos);
	           
	         // for each  string in string buffer
	         for(String j:s) {
	         
	            // write string encoded as modified UTF-8
	            dos.writeUTF(j);
	         }
	           
	         // force data to the underlying file output stream
	         dos.flush();
	         
	         // create file input stream
	         is = new FileInputStream(f1);
	         
	         // create new data input stream
	         dis = new DataInputStream(is);
	         
	         // available stream to be read
	         while(dis.available()>0) {
	         
	            // reads characters encoded with modified UTF-8
	            String k = dis.readUTF();
	            
	            // print
	            System.out.print(k+" ");
	         }
	      } catch(Exception e) {
	      
	         // if any error occurs
	         e.printStackTrace();
	      } finally {
	         
	         // releases all system resources from the streams
	         if(is!=null)
	            is.close();
	         if(dis!=null)
	            dis.close();
	         if(fos!=null)
	            fos.close();
	         if(dos!=null)
	            dos.close();
	      }
}
}
