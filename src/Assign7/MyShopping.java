package Assign7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MyShopping {
	 private Hashtable < Customer, Order >  a;

	 public void storeRecord(String filename) //: To store hashtable details into file.
	 {
		 
	 }
	 public void getRecord(String  filename)// : to print record on console
	 {
		 FileReader fr=null;
			FileWriter fw=null;
			BufferedReader br=null;
			BufferedWriter bw=null;

			try {
			
				fw=new FileWriter(filename);
				br=new BufferedReader(fr);
				bw=new BufferedWriter(fw);

				String data;
				while((data=br.readLine())!=null)
				{
					bw.write(data);
				}


			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

			finally
			{
				try {
					bw.close();
					br.close();
					fw.close();
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

	 }

}
