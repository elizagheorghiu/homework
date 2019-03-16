package tema_16_03;

import java.io.File;

public class GetListFilesDirectory {
	public static void main(String a[]) {

		File file = new File("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\Homework");
		String[] fileList = file.list();
		for (String name : fileList) {
			System.out.println(name);
		}
	}
}

	

