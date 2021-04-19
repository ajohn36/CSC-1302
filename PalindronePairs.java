/**
Programmer: Annab Johnson
Date: 11/11/20
Program: PE 19.11 Palindrone Pairs
Program purpose: To read an integer n and then print all squares of the integers from 1 to n that are palindromes 
(that is, their decimal representation equals its reverse), using IntStream.range, map, and filter.*/
import java.util.Scanner;
import java.util.stream.*;

public class PalindronePairs
{
 public static void main(String[] args)
 {
  introduction();
  Scanner in = new Scanner(System.in);// keyboard
  System.out.println("\nEnter an integer:");
  int num = in.nextInt();
  
  System.out.println("\nSquares of numbers from 1-"+num +" that are Palindrones:");
  
  IntStream.range(1,num + 1)
           .map(n-> n*n)
           .filter(n->n == reverse(n))
           .forEach(System.out::println);
 }// end of main

/*Reverse Method calculates the numbers that are palindrones from 1 - to the user inputted number. 
 @param int n 
 @return result- solution after calculations
 **/
 public static int reverse(int n)
 {
  int result = 0;
  while(n>0)
  {
   result = result*10 + n %10; //returns last digit
   n = n/10;// removes last digit
  }// end of while
  return result;
 }// end of result method
 
 /**Introduction method: Programmer, Date and Program Purpose.*/
 public static void introduction()
 {
  System.out.println("Programmer: Annab Johnson\nProgram: PE19.11 Palindrone Pairs \nDate: 11/11/20");
  System.out.println("Program purpose: To read an integer n and then print all squares of the integers from 1 to n that are palindromes"); 
  System.out.print("(that is, their decimal representation equals its reverse)"); 
  System.out.println(",using IntStream.range, map, and filter."); 
 }//end of introduction method
}//end of class
 
