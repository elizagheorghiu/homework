package tema_16_03;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class NoOccurrences {

		    public static void main(String[] args) 
	    {   
	        //Creating wordCountMap which holds words as keys and their occurrences as values
	         
	        HashMap<String, Integer> countWord = new HashMap<String, Integer>();
	     
	        BufferedReader reader = null;
	         
	        try
	        {
	            //Creating BufferedReader object
	             
	            reader = new BufferedReader(new FileReader("C:\\Users\\Eliza.Gheorghiu\\Desktop\\Personal\\History_of_Java.txt"));
	             
	            //Reading the first line into currentLine
	             
	            String currentLine = reader.readLine();
	             
	            while (currentLine != null)
	            {   
	                //splitting the currentLine into words
	                 
	                String[] words = currentLine.toLowerCase().split(" ");
	                 
	                //Iterating each word
	                 
	                for (String word : words)
	                {
	                    //if word is already present in wordCountMap, updating its count
	                     
	                    if(countWord.containsKey(word))
	                    {   
	                    	countWord.put(word, countWord.get(word)+1);
	                    }
	                     
	                    //otherwise inserting the word as key and 1 as its value
	                    else
	                    {
	                    	countWord.put(word, 1);
	                    }
	                }
	                 
	                //Reading next line into currentLine
	                 
	                currentLine = reader.readLine();
	            }
	             
	            //Getting the most repeated word and its occurrence
	             
	            String occurence = null;
	             
	            int count = 0;
	             
	            Set<Entry<String, Integer>> entrySet = countWord.entrySet();
	             
	            for (Entry<String, Integer> entry : entrySet)
	            {
	                if(entry.getValue() > count)
	                {
	                	occurence = entry.getKey();
	                     
	                    count = entry.getValue();
	                }
	            }
	             
	            System.out.println("The most repeated word in input file is : "+ occurence);
	             
	            System.out.println("Number Of Occurrences : "+count);
	        } 
	        catch (IOException e) 
	        {
	            e.printStackTrace();
	        }
	        finally
	        {
	            try
	            {
	                reader.close();           //Closing the reader
	            }
	            catch (IOException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	    }   
	}

