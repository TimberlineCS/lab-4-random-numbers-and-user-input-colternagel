import java.io.*;
import java.util.*;
 
public class RandomNum{
 
 public static void main(String args[]){
   System.out.print("Type a negative number: ");
   Scanner numbers = new Scanner(System.in);
   int negNum = numbers.nextInt();
   int negAbs = Math.abs(negNum);
   System.out.print("Type a positive number that is greater than " + negAbs + ":");
   int posNum = numbers.nextInt();
   double range1 = Math.random() * posNum + negNum;
   int intRange1 = (int)range1;
   double range2 = Math.random() * posNum + negNum;
   int intRange2 = (int)range2;
   System.out.print("You got a " + intRange1 + " And a " + intRange2);
 
 
 }
 
 
}
