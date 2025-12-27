 /*
  Ashley Palmer
July 2025
Chapter 11
*/
import java.util.*;
public class TestScores{
//declare the varaibles
   static ArrayList<Double> lst;
   //my constructor
   public TestScores(ArrayList<Double> scores){
      lst = scores;
   }
   public double average(){
   //declare variables
      double sum = 0;
      for (int i = 0; i < lst.size(); i++){
      //checking for the illegal numbers (>100 or <0)
         if((lst.get(i) > 100) || (lst.get(i) < 0))
            throw new IllegalArgumentException("Need a grade from 0 to 100");
         //no error add the numbers
         sum += lst.get(i);
      }
      //calculate average
      double average = sum / lst.size();
      return average;
   }
   
}