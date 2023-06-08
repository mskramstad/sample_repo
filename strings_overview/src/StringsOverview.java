package src;

/**
 * Explanation of all the String methods
 * 
 * @author Mike Skramstad
 * @version 1.1
 */

public class StringsOverview {
    public static void main (String[] args) {
    
    //declaring a string
    String phrase = "Today is the first day of the rest of your life.";
    String phrase2= new String("Today is the first day of the rest of your life.");
    
    System.out.println(phrase);
    System.out.println(phrase2);
    
    //convert to uppercase
    
    System.out.println(phrase.toUpperCase());
    //convert to lowercase

    System.out.println(phrase2.toLowerCase());

    //find out the length of a String
    System.out.println("Length of phrase: " + phrase.length() );
    
    // how to get a specific character
    char x =  phrase.charAt(6);
    System.out.println( x );
    
    // how to get a part of a String

    //demonstrates compareTo
    int equalPhrases = phrase.compareTo(phrase2);
    System.out.println(equalPhrases);
    
    // demonstrates concat
    System.out.println( phrase.concat(" Seize the day!"));
    System.out.println( phrase + " Seize the Day!");
    
    // demonstrates equals
    System.out.println( phrase.equals(phrase2) );
   
    //demonstrates indexOf
    System.out.println( phrase.indexOf("first"));
    
    //demonstrates replace
    System.out.println( phrase.replace(" ", "X") );
    System.out.println( phrase);
    phrase = phrase.replace(" ", "X");
    System.out.println(phrase);
    
    
    } // end of main
    
} // end of class

