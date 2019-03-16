package tema_16_03;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathnameExist {

		public static void main(String[] args)  {
			Path filePath=  Paths.get("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Homework");
		    boolean pathExists= Files.exists(filePath);
		    System.out.println("Path C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Homework: "+pathExists);
	}
}

