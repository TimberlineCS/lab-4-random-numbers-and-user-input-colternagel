import java.io.*;
import java.util.*;
 
public class UserInput{
 
 public static void main(String args[]){
   Scanner madLib1 = new Scanner(System.in);
   System.out.print("Place: ");
   String place = madLib1.nextLine();
   System.out.print("Adjective: ");
   String adjective = madLib1.nextLine();
   System.out.print("Noun: ");
   String noun = madLib1.nextLine();
   System.out.print("Precise number: ");
   double seconds = madLib1.nextDouble();
   System.out.print("Number: ");
   int seconds2 = madLib1.nextInt();
   double sum = seconds + seconds2;
   System.out.print("He went to the " + place + ". " + "He was feeling quite " + adjective + ". " + "He walked inside and found a " + noun + ". " + "The whole thing lasted for exactly " + sum + " seconds.");
 
 
 }
 
 
}
