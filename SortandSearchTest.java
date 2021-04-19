import java.util.*;
public class SortandSearchTest
{
 public static void main(String args [])
  {
 
 List<Integer> a = Arrays.asList(4,7,3,9,1); //Array list of unsorted integers
 System.out.println("Unsorted List\n"+a); //prints unsorted list
 Collections.sort(a); //Java sorts integers in natural ascending order
 System.out.println("\nSorted List\n"+a);// prints sorted list
     
 //Searching
 // to use binary search it must be sorted in the same order in whic you search it. Binary search requires natural order sorting
 int k = 9;
 int x = Collections.binarySearch(a, k); //(list(a), key(k)-target
 System.out.println("Found\t"+ k +"\tat index\t" +x );
  //unsucessful search get a negative number
  //binary search doesn't work on an unsorted collection
  
 boolean flag = a.contains(9);// linear search 
 System.out.println(flag);
 int index = a.indexOf(9);
 System.out.println(index);
  
 List< String> b= Arrays.asList("guavas", "mangoes", "Pineapples", "Apples", "Bananas", "kiwi");
 System.out.println("\nUnsorted List \n" +b);
 Collections.sort(b);
 System.out.println("\nSorted List\n" +b);//Uppercase comes before lowercase letters
   
   //Custom Sorting
   /**Comparator: name without a class (instance of class, implements the comparator inteface, which specifies one method a compare method
    that takes two integers and returns an integer representing a negative number, if ordered, a postitive number if unordered and 0 if they are the same.*/
 Comparator<Integer> descendingOrder = new Comparator<Integer>()
   {
    public int compare(Integer a, Integer b)
    { 
     if(a<b){return 1;}
     else if (a>b){return -1;}
     else {return 0;}
    }
   };
 Collections.sort(a,descendingOrder);
 System.out.println("\nThe integer list is now in descending order\n"+a); 
  
 Comparator<String> dictionaryOrder = new Comparator<String>()
   {
    public int compare(String a, String b)
     {
      return a.compareToIgnoreCase(b); //a.compareTo(b)- natural lexiographic ordering
     }
   };
 Collections.sort(b,dictionaryOrder);
 System.out.println(b);
 }
}
