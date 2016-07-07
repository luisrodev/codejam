import java.util.Scanner;

public class Solution{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int N; //Numer of cases.
    int L; //Number of letters.
    int W; //Number of words.

    N = Integer.parseInt(scan.nextLine());

    //Loop for lines
    for(int i = 1; i <= N; i++){

      String currentLine = scan.nextLine();

      int longLine = getLengthALine(currentLine);

      String[] words;

      L = getTotLetters(longLine, currentLine);
      W = getTotWords(longLine, currentLine);

      words = new String[W];

      words = getCompletsWords(longLine, currentLine, W);

      String solved = solve(words, W);

      System.out.println("Case #" + i + ": " + solved);
    }
  }

  private static String solve(String[] words, int totWords){
    String solved = "";

    for(int i = (totWords - 1); i >= 0; i--){
      if(i > 0){
        solved += words[i] + " ";
      }else{
        solved += words[i];
      }
    }

    return solved;
  }

  private static String[] getCompletsWords(int longLine, String line, int totWords){
    String[] words = new String[totWords];

    String word = "";

    int contWord = 0;

    for(int i = 0; i < longLine; i++){
      if(getCurrentChar(i, line) == ' ' || (i + 1)  == (longLine)){
        word += Character.toString(getCurrentChar(i, line));
        words[contWord] = word.trim();
        word = "";
        contWord++;
      }else{
        word += Character.toString(getCurrentChar(i, line));
      }
    }

    return words;
  }

  private static int getTotWords(int longLine, String line){
    int words = 1;

    for(int i = 0; i < longLine; i++){
      if(getCurrentChar(i, line) == ' '){
        words++;
      }
    }

    return words;
  }
  private static int getTotLetters(int longLine, String line){
    int letters = 0;
    
    for(int i = 0; i < longLine; i++){
      if(getCurrentChar(i, line) != ' '){
        letters++;
      }
    }

    return letters;
  }

  private static char getCurrentChar(int position, String theLine){
    char currentChar;

    char[] chartemp = theLine.toCharArray();

    currentChar = chartemp[position];

    return currentChar;
  }

  private static int getLengthALine(String currentLine){
    char[] chartemp = currentLine.toCharArray();

    return chartemp.length;
  }
}
