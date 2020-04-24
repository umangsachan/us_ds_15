package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWrite1 {
	public static void main(String[] args) throws IOException {
		File f = new File("D:/umang2.txt");
		FileWriter db = new FileWriter(f, true);
		BufferedWriter fg = new BufferedWriter(db);
		fg.newLine();
		fg.write("hello! this is code of a buffered write using append");
		fg.newLine();
		fg.write("Hello umang learn quick");
		fg.close();
	}

}
