package tema_16_03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;

public class Java___8 {

public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		
	    String anyCommand="your command";
	    
	    BufferedReader br;
	    
 br = new BufferedReader(new FileReader("C:\\Users\\Eliza.Gheorghiu\\Desktop\\tema.txt")); 
 

 String st; 
 while ((st = br.readLine()) != null) 
   System.out.println(st); 
 
  
 String dirName = "C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Homework\\src";

 anyCommand = in.nextLine();
 
 switch (anyCommand) {
 case "check if dir or file":
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
     break;
 case "get list files":
 File file1 = new File("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Homework");
	String[] fileList = file1.list();
	for (String name : fileList) {
		System.out.println(name);
	}
 break;
 
 case "last modified":
 File file2 = new File("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Texts for Homework\\File_2.docx");
 SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
System.out.println("Last Modified Date: " + sdf.format(file2.lastModified()));
break;

 case "path exist":
	 Path filePath=  Paths.get("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Homework");
	    boolean pathExists= Files.exists(filePath);
	    System.out.println("Path C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Homework: "+pathExists);
	    
break;
 case "size":
 File file3 = new File("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Texts for Homework\\File_2.docx");
 if(file3.exists())
    {
   
    System.out.println(sizeMbytes(file3));
    
    }
    else 
    System.out.println("File doesn't exist");
 
 
break;     
 case "copy":
	 
	 Path source = Paths.get("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Texts for Homework\\File_2.docx");
	    Path nwdir = Paths.get("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\copied.docx");
	    try{
	    Files.copy(source, nwdir);
	    System.out.println("You have copied the file successfully");
	    }catch (IOException e){
	        System.out.println("Unsucessful :(");
	    }
	    
break;

 case "delete":
	 
	 Path filePath1 = Paths.get("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Texts for Homework\\File_2.docx");
 System.out.println("File exits?= " + Files.exists(filePath1));
 try {
     System.out.println("You chose to delete the file");
     Files.delete(filePath1);
 } catch(IOException ioException) {
     ioException.printStackTrace();
 }

}

}


private static String sizeMbytes(File file3) {
	// TODO Auto-generated method stub
	 return file3.length()/(1024*1024)+" mb";
}
}
