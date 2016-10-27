
package wordladder;

import java.io.*;
import java.util.*;

/**
 *
 * @author hammad
 */



public class Wordladder {

   
    public static void main(String[] args)  {
        Set<String> wordDict = new HashSet<String>();
        
        //parses all dictionary words into a string set
    try{
        BufferedReader br = new BufferedReader(new FileReader("29765-8.txt"));  
        String line = null;  
        while ((line = br.readLine()) != null)  
        {  
            if (line.matches("[A-Z]{2,}")){
            wordDict.add(line);
            }
        }
    }
    catch(Exception e)
    {
     e.printStackTrace();
    }
    //prints string set
    for (String s : wordDict) {
    System.out.println(s);
    }
    
    
    
    } 
    
    
}
