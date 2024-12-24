import java.util.Scanner;
import java.util.ArrayList;

public class main {

  public static void main (String ... args){
    Scanner input = new Scanner(System.in);
    System.out.print("Write a word: ");   
    String word = input.next(); 
    ArrayList<Character> reversedWord = new ArrayList<Character>();
    boolean palidrome = false;

    for(int i = word.length() - 1; i > -1; i--){
       reversedWord.add(word.charAt(i));
    }

    for(int i = 0; i < word.length() - 1; i++){
      if(reversedWord.get(i) != word.charAt(i))
        break;
      else
        palidrome = true;
    }


    if(palidrome)
      System.out.println("It is a palidrome");
    else
      System.out.println("It is not a palidrome");
    
  }
}
