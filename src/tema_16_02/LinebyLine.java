package tema_16_02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LinebyLine {

	public static void main(String a[]){
        BufferedReader br = null;
        String strLine = "";
        try {
            br = new BufferedReader( new FileReader("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\History_of_Java.txt"));
            while( (strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Unable to find the file: fileName");
        } catch (IOException e) {
            System.err.println("Unable to read the file: fileName");
        }
    }
}
