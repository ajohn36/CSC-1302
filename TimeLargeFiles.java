import java.util.TreeSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;
/** Programmer: Annab Johnson
    Program: PE15.13 TimeLargeFlies
    Date:10/31/20
    Program purpose: Insert all words from a large file containing the novel “War and Peace", into a hash set and time the results. 
  */
public class TimeLargeFiles
{
 public static void main(String[] args) 
  throws FileNotFoundException
   {
    introduction();
    System.out.println("Time elapsed for Tree Set " + tree());
    System.out.println("Time elapsed for Hash Set "+ hash());
    compareBothsets();
    }
 /**Compare both times from the tree() and hash() methods.
    Intilizes variables t1 and h1 to the tree() and hash(0 methods respectively in order to compare times in if statement. 
    @param t1 intilized as tree() method.
    @param h1 intilized as hash() method.
 */ 
 public static void compareBothsets()
  throws FileNotFoundException
   {    
    long t1 = tree();
    long h1 = hash();
    
    if ( t1>h1)
    {
     System.out.println("The Hash Set is faster. ");
    }
    else
    {
     System.out.println("The Tree Set is faster ");
    }
   }
/**Introduction for this program*/
 public static void introduction()
  {
   System.out.println("Programmer: Annab Johnson\nProgram: PE15.13 TimeLargeFiles\nDate: 10/31/20");
   System.out.println("The purpose of this program is to insert all words from a large file containing the novel \'War and Peace\', into a hash set and tree set.\nThe program will time the iteration of elements for both sets, display the times and which set is faster.\n");
  }

 /**Visit all the elements in the document. 
   Call an object to type timer from the StopWatch class to use the start(),stop() and getElapsedTime() methods to time the efficiency of the treeset
   @return the elapsed time for hash set. 
 */
 public static long tree()
  throws FileNotFoundException
  {   
   StopWatch timer = new StopWatch();
   timer.start();
   Set<String> documentWords2 = readWords2("war-and-peace.txt");
     
   for (String word2 : documentWords2)
   {
     
   }
   timer.stop();
   return timer.getElapsedTime();
  } 
 /**Visit all the elements in the document. 
    Call an object to type timer from the StopWatch class to use the start(),stop() and getElapsedTime() methods to time the efficiency of the hashset
    @return the elapsed time for hash set. 
  */
  
 public static long hash()
  throws FileNotFoundException
   {
    StopWatch timer = new StopWatch();
    timer.start();
    Set<String> documentWords = readWords("war-and-peace.txt");
   
    for (String words : documentWords)
     {
      
     }
    timer.stop();
    
    return timer.getElapsedTime();
   }
/**readWords2 method: Reads all words from a file.
   @param filename the name of the file
   @return a Tree set with all lowercased words in the file. Here, a 
   word is a sequence of upper- and lowercase letters.
 */
 public static Set<String> readWords2(String filename)
  throws FileNotFoundException
   {  
    Set<String> words2 = new TreeSet<>();
    Scanner in = new Scanner(new File(filename));
    // Use any characters other than a-z or A-Z as delimiters
    in.useDelimiter("[^a-zA-Z]+");
    while (in.hasNext())
     {
      words2.add(in.next().toLowerCase());  
     }
    return words2;
   }
/**readWords Method: Reads all words from a file.
   @param filename the name of the file
   @return a Hash set with all lowercased words in the file. Here, a 
   word is a sequence of upper- and lowercase letters.
 */
 public static Set<String> readWords(String filename)
  throws FileNotFoundException
   {  
    Set<String> words = new HashSet<>();
    Scanner in = new Scanner(new File(filename));
    // Use any characters other than a-z or A-Z as delimiters
    in.useDelimiter("[^a-zA-Z]+");
    while (in.hasNext())
     {
      words.add(in.next().toLowerCase());  
     }
    return words;
  }
}
  