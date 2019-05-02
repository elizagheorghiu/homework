package tema_16_02;
import java.io.File;
import java.io.FilenameFilter;

public class GetSpecificFilesfromDirectory {
	 public static void main(String a[]){
	        File file = new File("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Homework");
	        File[] files = file.listFiles(new FilenameFilter() {
	             
	            @Override
	            public boolean accept(File dir, String name) {
	                if(name.toLowerCase().endsWith(".jar")){
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	        });
	        for(File f:files){
	            System.out.println(f.getName());
	        }
	    }
	}