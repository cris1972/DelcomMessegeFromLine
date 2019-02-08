package tyTransleteText;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFromFile {
	String s ="";

	public ReadTextFromFile(String text) {
		
		Scanner in;
		try {
			in = new Scanner(new File(text));
			while(in.hasNext())
				s += in.nextLine() + "\r\n";
				in.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		//System.out.println(s);
		new TransleteTextFromFile(s);
	}

}
