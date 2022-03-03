/***********************************************
* Vincent Nguyen
* 3/2/2022  RTS Labs Coding Assessment (Java)
***********************************************/
import java.util.*;
import java.lang.*;
import java.io.*;

public class RTSLabMethods
{
   public static void main(String [] args)
   {
      int[] input = {1,5,2,1,10,6,-4,-10};
      System.out.println(aboveBelow(input, 6));
      System.out.println(stringRotation("Hello ", 1));
   }
   
   /******************************************************************************************
   * METHOD: aboveBelow
   * PURPOSE: Takes in an array of integers and an int value to compare the array values to.
   * RETURNS: HashMap with the key value pairs of the count of integers above or below the value.
   ******************************************************************************************/
   
   public static HashMap<String, Integer> aboveBelow(int[] listOfInts, int value)
   {
      HashMap<String, Integer> counter = new HashMap<>();
      int belowCount = 0; // counter for nums below value
      int aboveCount = 0; // counter for nums above value
      counter.put("above", belowCount); // inserting into hashmap
      counter.put("below", aboveCount);
      
      if(listOfInts.length == 0) // return empty hashmap if array is empty
      {
         return counter;
      }
      for(int i = 0; i < listOfInts.length; i++) // iterating counter and update hashmap 
      {
         if(listOfInts[i] > value)
         {
            aboveCount++;
            counter.put("above", aboveCount);
         }
         else if(listOfInts[i] < value)
         {
            belowCount++;
            counter.put("below", belowCount);
         }
      }
      return counter; // return result hashmap
   }
   
   /******************************************************************************************
   * METHOD: stringRotation
   * PURPOSE: Takes in an input string and an integer of how many rotations to the right
   * are to be conducted.
   * RETURNS: A string after the requested number of right rotations.
   ******************************************************************************************/
   
   public static String stringRotation(String input, int rotations)
   {  
      if(input != null && !input.isBlank()) // checking for non valid Strings
      {
         if(input.length() == rotations) // return string if length is the same as the rotations
         {
            return input;
         } 
         int i = rotations % input.length(); // Modulus operand to return remainder
         String output = input.substring( input.length()-i) + input.substring(0,input.length()-i); // Using remainder to calculate substring
         return output; // return rotated string
      }    
      return input; // return input if non valid String    
   } 
}