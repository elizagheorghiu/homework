package tema_16_03;

import java.io.File;
import java.text.SimpleDateFormat;


public class LastModifTime {

	public static void main(String[] args)  {
		File file = new File("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Texts for Homework\\File_2.docx");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
	
}
}
