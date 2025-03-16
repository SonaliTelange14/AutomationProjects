package _11_FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_File {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\lenovo\\Documents\\File_Code\\Test.txt"); //new file created
		FileReader fr = new FileReader(file); //take permission for reading file
		BufferedReader read = new BufferedReader(fr); //read file by character by character
		String str;
		while((str=read.readLine()) != null)   //until not reached to null character it print file data
		{
			System.out.println(str);
		}

	}

}
