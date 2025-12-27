 /*
  Ashley Palmer
July 2025
Chapter 11
*/
import java.util.*;
public class TestScoresCustomized{
//declare the variables
   static ArrayList<Double> lst;
   //my constructor
   public TestScoresCustomized(ArrayList<Double> scores){
      lst = scores;
   }
   public double average() throws InvalidTestScore{
      //declare the variables
      double sum = 0;
      for (int i = 0; i < lst.size(); i++){
      //check for invalid numbers (>100 and < 0)
         if((lst.get(i) > 100) || (lst.get(i) < 0))
            throw new InvalidTestScore("Need a grade from 0 to 100");
         //no errors means add up the numbers
         sum += lst.get(i);
      }
      //calculate the average
      double average = sum / lst.size();
      return average;
   }
   
}