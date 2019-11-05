/**
 * Problem Set 5.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section.
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {

    public static void main(String[] args) {
      ProblemSet5 ps = new ProblemSet5();

      /*
      * TEST CASES
      */

      // System.out.println(ps.surroundMe("I love you", "Hell")); //Excercise 1
      // System.out.println(ps.endsMeet("I love you", 3)); //Excercise 2
      // System.out.println(ps.middleMan("afjgnafoh")); //Excercise 3
      // System.out.println(ps.isCentered("afjgnafoh", "gna")); //Excercise 4
      System.out.println(ps.countMe("I'm the happiest sham himself", 'm')); //Excercise 5 - Still not done
      // System.out.println(ps.triplets("astsssthreoooasd")); //Excercise 6
      // System.out.println(ps.addMe("12s34jgfhs938")); //Excercise 7
      // System.out.println(ps.sequence("hello")); //Excercise 8 - NOT DONE
      // System.out.println(ps.intertwine("How's", "Life")); //Excercise 9
      // System.out.println(ps.isPalindrome("racecar")); //Excercise 10

    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    public String surroundMe(String in, String out) {
      //Initializing Variables
      String modText = "";

      if (out.length() == 4 && !in.equals(null) && !out.equals(null)){
        modText += out.substring(0, 2);
        modText += in;
        modText += out.substring(out.length()-2, out.length());
        return modText;
      } else {
        return in;
      }
    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */

    public String endsMeet(String text, int n) {
      //Initializing Variables
      String modText = "";

      if (text.length()<=10 && !text.equals(null) && n > 0 && n <= text.length()){
        modText = text.substring(0, n);
        modText += text.substring(text.length()-n, text.length());
        return modText;
      } else {
        return text;
      }
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */

    public String middleMan(String text) {
      //test conditions
      if (text != null && text.length() % 2 == 1) {
        //Variables with calculation
        double midpoint = text.length() / 2;
        String midText = text.substring((int)(midpoint - 0.5), (int)(midpoint + 2.5));
        return midText;
      }
      return text;
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */

    public boolean isCentered(String text, String target) {
        //test conditions
        if (text != null && text.length() % 2 == 1 && target != null && target.length() == 3) {
          String middle = middleMan(text);
          if (middle.equals(target)) {
              return true;
          }
        }
        return false;
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */

    public int countMe(String text, char suffix) {
      //null check
      if (text.equals(null) || !Character.isAlphabetic(suffix)){
          return -1;
      }

      //Initializing variables
      int count = 0;
      String subString = "";

      //Meat of the excercise
      for (int i = 0; i < text.length(); i++){
        //Identifies each individual word in the string
        if (!Character.isSpaceChar(text.charAt(i))){
          subString += text.substring(i, i+1);
        }

        //Identifies whether or not the word ends with the suffix
        if (subString.endsWith(Character.toString(suffix)) && Character.isSpaceChar(text.charAt(i+1))){
          count++;
          subString = "";
        }
      }

      return count;
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */

    public int triplets(String text) {
      //null check
      if (text.equals(null)){
          return -1;
      }

      //Initializing variables
      int count = 0;

      //Meat of the excercise
      for (int i = 2; i < text.length(); i++){
        char one = text.charAt(i-2);
        char two = text.charAt(i-1);
        char three = text.charAt(i);

        if (one == two && two == three){
          count++;
        }
      }

      return count;
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */

    public long addMe(String text) {
      //null check
      if (text.equals(null)){
        return -1;
      }
      //Initializing variables
      int sum = 0;
      int digitsOnly = 0;

      //Computing the sum by adding one digit character at a time
      for (int i = 0; i < text.length(); i++){
        if (Character.isDigit(text.charAt(i))){
          digitsOnly += Integer.valueOf(text.substring(i, i+1));
        }
      }

      return digitsOnly;
    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */

    public long sequence(String text) {
      // //null check
      // if (text.equals(null)){
      //   return -1;
      // }
      //
      //
      //
      // if (a.length() >= b.length()){
      //   lengthTest = a.length();
      // } else if (a.length() < b.length()){
      //   lengthTest = b.length();
      // }

      return 0;
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */

    public String intertwine(String a, String b) {
      //null check
      if (a.equals(null)||b.equals(null)){
        return null;
      }
      //Initializing variables
      String inter = "";
      int lengthTest = 0;

      //Identify what length to use for the for loop
      if (a.length() >= b.length()){
        lengthTest = a.length();
      } else if (a.length() < b.length()){
        lengthTest = b.length();
      }

      //Adding on characters of each string one by one
      for (int i = 0; i < lengthTest; i++){
        inter += a.substring(i, i+1) + b.substring(i, i+1);
      }

      return inter;
    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */

    public boolean isPalindrome(String text) {
      //Initializing Variables
      String originPal = text;
      originPal = originPal.toUpperCase();
      String palTestString = "";

      if (originPal == null){
        return false;
      }

      //This code gets rid of spaces
      for (int i = 0; i<originPal.length(); i++){
        // char character = originPal.charAt(i);
        if (Character.isSpaceChar(originPal.charAt(i))){
          originPal = originPal.substring(0, i) + originPal.substring(i+1, originPal.length());
        }
      }

      //This code flips the original suspected palindrome in a new string
      for (int i=originPal.length()-1; i>=0; i--){
        palTestString = palTestString + originPal.charAt(i);
      }

      boolean palTest = palTestString.equals(originPal);
      return palTest;
    }
}
