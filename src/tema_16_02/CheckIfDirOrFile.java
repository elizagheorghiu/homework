package tema_16_02;
import java.io.File;

public class CheckIfDirOrFile {
	
	public static void main(String[] args)  {
		File file = new File ("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Homework\\bin");
		 boolean isFile = file.isFile();
	     if(isFile)
	       System.out.println(file.getPath() + " is a file.");
	     else
	      System.out.println(file.getPath() + " is not a file.");
	     
	     boolean isDirectory = file.isDirectory();
	     if(isDirectory)
	      System.out.println(file.getPath() + " is a directory.");
	     else
	      System.out.println(file.getPath() + " is not a directory.");
	     }
}
