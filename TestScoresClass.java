 /*
  Ashley Palmer
July 2025
Chapter 11
*/
import java.util.*;
public class TestScoresClass{
   static Scanner scanner = new Scanner(System.in);
   public static void main(String[] args){
   //get the numbers
      System.out.print("Enter a list of numbers: ");
      String nums = scanner.nextLine();
      //put the numbers into a list
      String[] numsLst = nums.split(",");
      //creat an empty list
      ArrayList<Double> lst = new ArrayList<>();
      //convert the numbers to doubles and put them in the empty list
      for (int i = 0; i < numsLst.length; i++){
         double num = Double.parseDouble(numsLst[i]);
         lst.add(num);
      }
      //call the class
      TestScores scoresClass = new TestScores(lst);
      //get the list average
      double average = scoresClass.average();
      //print the average
      System.out.print("Average: " + average);
      scanner.close();
   }
}