package driverslicense;

import java.util.ArrayList;

/**
 * Created by mikailaakeredolu on 5/23/16.
 */
public class MyStringUtils {

 public static String converter(String[] arrayOfStrings){

     String placeHolder = "";

     for(int i=0;i<arrayOfStrings.length;i++)
         if(i == arrayOfStrings.length - 1){
             placeHolder+=arrayOfStrings[i];
         }else{
             placeHolder+=arrayOfStrings[i] + (",");
         }

     return placeHolder ;

 }

public static String[] breakUpArrayOfStrings(String stringToTakeIn){

    String[] myArray = stringToTakeIn.split("\n");

    return myArray;
}

 public static String reverse(String stringToRev){

     String[]myArray = stringToRev.toUpperCase().split("\\s");
     String temp = "";
     for(int x = 0; x < myArray.length; x++){
         temp += myArray[x].substring(0,1).toLowerCase() + myArray[x].substring(1) + " ";
     }
     return temp.trim();
 }

    public static String reverseEachWword(String theword){
        String[] words = theword.split("\\s");
        String temp = "";
        for (String s: words){
            temp += new StringBuilder(s).reverse() + " ";
        }
        return temp.trim();
    }

 public static String removeWhitespaces(String word){
     String[] words = word.split("\\s");
     String temp = "";
    for(int x = 0; x< words.length; x++){

        temp += words[x] + "\n";

    }
     return temp.trim();
 }

 public static ArrayList<String> subArray(String stringToReturn){

     ArrayList<String> myArray = new ArrayList<>();


     for(int x = 0; x < stringToReturn.length(); x++){

         for(int y = 1; y <= stringToReturn.length()-x; y++){

             String combo = (stringToReturn.substring(x , x+y));
             myArray.add(combo);
             System.out.println(combo);

         }
     }


     return myArray;
 }


 public static String[]  optional(String option){
     return null;
 }



}
