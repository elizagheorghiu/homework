package tema_16_02;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReadLineStoreArray {
	public static void main(String[] args) {
		
		try {
			FileInputStream filestream = new FileInputStream("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\History_of_Java.txt");
			DataInputStream in = new DataInputStream(filestream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String stringLine;
			java.util.ArrayList<String> list = new java.util.ArrayList<String>();

			while ((stringLine = br.readLine()) != null) {
				list.add(stringLine);
			}

			System.out.println( "the first line is: " + list.get( 3 ) );
			System.out.println( "the third line is: " + list.get( 5 ) );


			in.close();
		}
		catch(Exception e) {      
			System.err.println("Error: " + e.getMessage());
		}
	}
}
