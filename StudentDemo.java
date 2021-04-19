/**Programmer: Annab Johnson
   Program: PE8.7 Student
   Date: 10/10/20
   Program purpose: This is the Demo program for the Student class. This program will create a Student object. 
   This program will prompt the user to enter a student name and scores. 
   A while loop is used to ask the user to enter scores until the sentinel value of -1 is entered. 
   An if statement is used to ensure that the scores are between 0-100. Numbers outside this range are not calculated towards the total score and average score. 
   This program will call the getName, getTotalScore and getAverageScore methods, and display the results.*/

import java.util.Scanner;

public class StudentDemo
{
 public static void main(String [] args)
  {
   System.out.println("Programmer: Annab Johnson\nProgram: PE8.7 Student\nDate: 10/10/20");
   System.out.println("This program is the demo for the student class. This program will create an object to type Student."); 
   System.out.println("This program will prompt the user to enter a student name and quiz scores between 0-100. Please enter -1 when finished.");
   System.out.println("This program will call the getName, getTotalScore and getAverageScore methods, and display the results.");
   Scanner in = new Scanner(System.in);
   
   String a;
   System.out.println("\nEnter student name:");
   a= in.nextLine();
   Student student = new Student(a);
   
   System.out.println("Enter student scores. Quizzes are graded out of 100. Scores can only be between 0-100. To finish enter -1:"); 
    int g= 0;
    while (g!=-1)
     {
      g = in.nextInt(); 
      if (g>=0 && (!(g>100)))
       {
        student.addQuiz(g);
       }
     }
       
  System.out.printf("\nStudent name: " +student.getName()+ "\nTotal score: " + student.getTotalScore()+ "\nAverage score:%5.1f " , student.getAverageScore());
  }
}