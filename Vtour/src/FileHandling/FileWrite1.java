package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite1 {
	public static void main(String[] args) throws IOException {
		File f= new File("D:/umang2.txt");
		FileWriter fb = new FileWriter(f);
		fb.write("Hello I am Umang");
		fb.write("Hello Again"); //Using this thing will not give space and next line for that use bufferedwrite
		fb.close();
	}

}
