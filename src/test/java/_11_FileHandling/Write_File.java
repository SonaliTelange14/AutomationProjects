package _11_FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_File {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\lenovo\\Documents\\File_Code\\Test.txt"); //new file created
		FileWriter fr=new FileWriter(f);   //take permission to write in above file
		BufferedWriter bf= new BufferedWriter(fr);   //write by character by character
		bf.write("first name");
		bf.newLine();
		bf.write("second name");
	    bf.newLine();
	    bf.write("third name");
	    
	    bf.close();

	}

}
