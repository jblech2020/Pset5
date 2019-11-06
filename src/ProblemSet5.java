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

      //Excercise 1
      // System.out.println(ps.surroundMe("cde", "abfg")); //abcdefg (GOOD)
      // System.out.println(ps.surroundMe(null, "####")); //null (GOOD)
      // System.out.println(ps.surroundMe("abc", null)); //abc (GOOD)
      // System.out.println(ps.surroundMe("abc", "123")); //abc (GOOD)

      // Excercise 2
      // System.out.println(ps.endsMeet("abcdefg", 2)); //abfg (GOOD)
      // System.out.println(ps.endsMeet(null, 2)); //null (GOOD)
      // System.out.println(ps.endsMeet("", 2)); //"" (GOOD)
      // System.out.println(ps.endsMeet("abc", -1)); //abc (GOOD)

      //Excercise 3
      // System.out.println(ps.middleMan("abcdefg")); //cde (GOOD)
      // System.out.println(ps.middleMan(null)); //null (GOOD)
      // System.out.println(ps.middleMan("12")); //12 (GOOD)
      // System.out.println(ps.middleMan("a")); //a (GOOD)

      // Excercise 4
      // System.out.println(ps.isCentered("abcdefg", "cde")); //true (GOOD)
      // System.out.println(ps.isCentered("abcdefg", "abc")); //false (GOOD)
      // System.out.println(ps.isCentered(null, "abc")); //false (GOOD)
      // System.out.println(ps.isCentered("abcd", "abc")); //false (GOOD)
      // System.out.println(ps.isCentered("abc", null)); //false (GOOD)
      // System.out.println(ps.isCentered("abcdefg", "cd")); //false (GOOD)

      //Excercise 5
      // System.out.println(ps.countMe("I am an example sentence", 'e')); //2 (GOOD)
      // System.out.println(ps.countMe(null, 'a')); //-1 (GOOD)
      // System.out.println(ps.countMe("abc$ def$", '$')); //-1 (GOOD)
      // System.out.println(ps.countMe("abc$ def", 'f')); //1 (GOOD)

      //Excercise 6
      // System.out.println(ps.triplets("aaabbbccc")); //3 (GOOD)
      // System.out.println(ps.triplets("aaaa")); //2 (GOOD)
      // System.out.println(ps.triplets("abc")); //0 (GOOD)
      // System.out.println(ps.triplets(null)); //-1 (GOOD)

      //Excercise 7
      // System.out.println(ps.addMe("123 abc 123")); //12 (GOOD)
      // System.out.println(ps.addMe("abcdefghijk")); //0 (GOOD)
      // System.out.println(ps.addMe(null)); //-1 (GOOD)

      //Excercise 8
      // System.out.println(ps.sequence("abbcccdddd")); //4 (GOOD)
      // System.out.println(ps.sequence("aAabBbBb")); //1 (GOOD)
      // System.out.println(ps.sequence("")); //0 (GOOD)
      // System.out.println(ps.sequence(null)); //-1 (GOOD)

      //Excercise 9
      // System.out.println(ps.intertwine("aceg", "bdfh")); // "abcdefgh" (GOOD)
      // System.out.println(ps.intertwine("abc", "12345")); // "a1b2c345" (GOOD)
      // System.out.println(ps.intertwine(null, "abcd")); //null (GOOD)
      // System.out.println(ps.intertwine("abcd", null)); //null (GOOD)
      // System.out.println(ps.intertwine(null, null)); //null (GOOD)

      //Excercise 10
      // System.out.println(ps.isPalindrome("racecar")); //true (GOOD)
      // System.out.println(ps.isPalindrome("Madam")); //false (GOOD)
      // System.out.println(ps.isPalindrome(null)); //false (GOOD)
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

      if (in == null || out == null){
        return in;
      }

      if (out.length() == 4 && in != null && out != null){
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

      if (text == null){
        return text;
      }

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
      if (text != null && text.length() % 2 == 1 && text.length()>=3) {
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
      if (text == null || !Character.isAlphabetic(suffix)){
          return -1;
      }

      //Initializing variables
      int count = 0;
      String subString = "";

      //For loop to cycle through the text string's characters
      for (int i = 0; i < text.length()-1; i++){
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

      //Test case for last character (since there is no space after it)
      if (text.substring(text.length()-1, text.length()).equals(Character.toString(suffix))){
        count++;
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
      if (text == null){
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
      if (text == null){
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
     long count = 0L;
     long lastLongest = 0L;
     if (text == null) {
         return -1;
     }
     for (int i = 1; i < text.length(); i++) {
         if(i == text.length() - 1) {
           if (text.charAt(i - 1) == text.charAt(i)) {
             count++;
             lastLongest = (lastLongest < count) ? count : lastLongest;
             count = 0L;
           } else if (text.charAt(i - 1) != text.charAt(i)) {
             lastLongest = (lastLongest < count) ? count : lastLongest;
             count = 0L;
           }
         } else if (text.charAt(i - 1) == text.charAt(i)) {
           count++;
         } else if (text.charAt(i) == ' ' || text.charAt(i) == '.' || text.charAt(i - 1) != text.charAt(i)) {
           lastLongest = (lastLongest < count) ? count : lastLongest;
           count = 0L;
         }
     }
     if (lastLongest == 0 && text == ""){
       lastLongest = 0;
     }else if (lastLongest == 0 && text != ""){
       lastLongest = 1;
     }else{
       lastLongest++;
     }
     return lastLongest;
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */

    public String intertwine(String a, String b) {
      //null check
      if (a == null||b == null){
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
        if (a.length()>i && b.length()>i){
          inter += a.substring(i, i+1) + b.substring(i, i+1);
        } else if (b.length()>i && a.length()<=i){
          inter += b.substring(i, i+1);
        } else if (b.length()<=i && a.length()>i){
          inter += a.substring(i, i+1);
        }
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
