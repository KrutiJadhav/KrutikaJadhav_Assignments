package com.cg.java11;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class readwrite {

	public static void main(String[] args) {
		var path = "C:\\Users\\KRJADHAV\\OneDrive - Capgemini\\Documents\\OneDrive - Capgemini\\Desktop\\KrutikaJadhav_Assigments\\Java11Assignments_StudentList.txt";
		try {
			String data = Files.readString(Path.of(path));

			char c[] = data.toCharArray();
			for (int i = 0; i < c.length; i++) {

					System.out.print(c[i]);
			}

		} catch (IOException e) {

			System.out.println("wrong path");
		}

	}

}