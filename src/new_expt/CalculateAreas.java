package new_expt;

import java.io.*;
import java.util.Scanner;

public class CalculateAreas {

	public static void main(String[] args) {
		Policy p[]=new Policy[3];
		File f1=new File("policy.txt");
		Scanner sc=new Scanner(System.in);
		FileOutputStream fos;
		ObjectOutputStream oos;		
		if(!f1.exists()){
		try {
			System.out.println("File Policy.txt is created "+f1.createNewFile());
		} catch (IOException e) {		}
	}
		System.out.println("Loop starts for entering data");
		for (int i = 0; i < p.length; i++) {
			p[i]=new Policy();
			System.out.println("entering data for policy "+(i+1));
			try {
				System.out.println("  Nominee Name");
				p[i].setNomineeName(sc.nextLine());
				System.out.println(" Policy Holder ");
				p[i].setPoilcyholderName(sc.nextLine());
				System.out.println(" Policy No ");
				p[i].setPolicy_no(sc.nextLine());
				System.out.println(" Policy Type ");
				p[i].setPolicyType(sc.nextLine());
			} catch (InvaliPolicyException e) {			}
			
			}
System.out.println("Policies are stored successfully");

		try {
			fos=new FileOutputStream(f1);
			oos=new ObjectOutputStream(fos);
			for (int i = 0; i < p.length; i++) {
				oos.writeObject(p[i].toString());
			}
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {		} 
		catch (IOException e) {		}
	System.out.println("File are written");

		
		
				
		
}
}