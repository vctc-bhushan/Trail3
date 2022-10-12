package com.test;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("C:\\Users\\BHUSHAN\\Desktop\\Demo.txt");
			fw.write("Velocity corporate training center pune.");
			fw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Success.....");

		}

	}

}
