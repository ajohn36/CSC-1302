/** Programmer: Annab Johnson
    Program: PE8.7 Student
    Date:10/10/20
    Program purpose: 
               1. Implement a class called Student 
               2. In this program a student has a name, total quiz score and the number of quizzes taken. 
               3. This program will calculate the total quiz score and average quiz score. 
               4.	Create a constructor that receives and initializes a variable called: studentName. 
               5.	Create methods getName(), addQuiz(int score), getTotalScore(), and getAverageScore() 
               6.	Create a Demo program that creates a Student object
               7.	Call the addQuiz method 
               8.	Call the getName, getTotalScore and getAverageScore methods, to display the results.*/

public class Student
 {
  private int score;
  private  String studentName;
  private int numOfquizzes;
  private int quizTotal;
   
   // Constructor
  public Student (String studentName)
   {
    this.studentName = studentName;
    score = 0;
    numOfquizzes=0;
   }
  
  //Accessor methods
  /** Gets student name and returns the variable studentName
      @return studentName*/
  public String getName()
   {
    return studentName;
   }
   
  /**Gets total quiz score
     @return quizzTotal*/
  public int getTotalScore()
   {
    return quizTotal; 
   }
  
  /**Gets average score. 
     @return 0 if numOfquizzes equal to 0
     @return average score if numOfquizzes not equal to 0 */
  public double getAverageScore()
   {
    if (numOfquizzes == 0)
    return 0;
    else 
    return (quizTotal/(numOfquizzes*1.0));
   }
  
  //Mutator Method
  /**Add quiz scores and increment number of quizzes
      @param int score*/
  public void addQuiz( int score)
   {
    quizTotal += score;
    numOfquizzes++;
   }
 }