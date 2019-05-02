package tema_16_02;

import java.io.File;

public class ReadWritePermission {
	public static void main(String[] args)  {
		 File file = new File("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Homework\\.gitignore");

		    if (file.canWrite())
		        System.out.println(file.getAbsolutePath() + ": permission to write");
		    else
		        System.out.println(file.getAbsolutePath() + ": you don't have permission to write");

		    if (file.canRead())
		        System.out.println(file.getAbsolutePath() + ": permission to read");
		    else
		        System.out.println(file.getAbsolutePath() + ": you don't have permission to read");
		   
		    File file2 = new File ("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\GeorgeFelea.pdf");
		    if (file2.canWrite())
		        System.out.println(file2.getAbsolutePath() + ": permission to write");
		    else
		        System.out.println(file2.getAbsolutePath() + ": you don't have permission to write");

		    if (file2.canRead())
		        System.out.println(file2.getAbsolutePath() + ": permission to read");
		    else
		        System.out.println(file2.getAbsolutePath() + ": you don't have permission to read");
		   

}
}