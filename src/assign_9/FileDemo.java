package assign_9;

import java.io.*;
import java.util.*;

public class FileDemo {

	public static void main(String[] args) {
		
		File file = new File("input.dat");
		FileReader fr=null;
		try {
			fr = new FileReader("input.dat");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ArrayList<String> arr=new ArrayList<String>();

		try {

			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String[] times = scanner.nextLine().split("\n");
				for (String time : times) {
					arr.add(time);
				}

			}
			System.out.println(arr);
		} catch (Exception e) {
			e.printStackTrace();
		}	
for (int i = 0; i < arr.size(); i++) {
	System.out.println(i+" : "+arr.get(i));
}
int ch;
try {
	while ((ch=fr.read())!=-1) {
		System.out.print((char)ch);
		
	}
} catch (IOException e) {
	
}


	}
}


