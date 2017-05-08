package new_expt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class newfileio {
	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("data.txt");
		Scanner sc=new Scanner(System.in);
		PrintWriter printw=new PrintWriter(file);
		for (int i = 0; i < 5; i++) {


			System.out.println("Enter string to write "+i);
			printw.write(sc.nextLine());
			printw.write("\n");
		}
		printw.close();
	}
}
