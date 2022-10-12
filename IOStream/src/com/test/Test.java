package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		
		// "abc"---next();--username
		// "abc vct xyz" :--full name--nextLine();
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\BHUSHAN\\Desktop\\Demo.txt");
			Scanner sc = new Scanner(fis);
			//System.out.println(sc.nextLine());
			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close(); // colses the scanner
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
