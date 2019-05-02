package tema_16_02;

import java.io.File;

public class Size {
	public static void main(String[] args)  {
		 File file = new File("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Texts for Homework\\File_2.docx");
		 if(file.exists())
	        {
	        System.out.println(sizeBytes(file));
	        System.out.println(sizeKbytes(file));
	        System.out.println(sizeMbytes(file));
	        }
	        else 
	        System.out.println("File doesn't exist");
	         
	    }

	 private static String sizeMbytes(File file) {
		 return file.length()/(1024*1024)+" mb";
	}

	private static String sizeKbytes(File file) {
		 return file.length()/1024+" kb";
	}

	private static String sizeBytes(File file) {
		 return file.length()+" bytes";
	    }
	}	
		
	
	
	


