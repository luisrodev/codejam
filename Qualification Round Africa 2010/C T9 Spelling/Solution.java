import java.util.Scanner;

public class Solution{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int N;//Numer of cases.

    N = Integer.parseInt(scan.nextLine());
     

    for(int i = 1; i <= N; i++){//Principal loop
        String desired_message = scan.nextLine();//Desired message
        String solvedLine = solve(desired_message, desired_message.length());
        System.out.println("Case #" + i + ": " + solvedLine);
    }

  }

  private static String solve(String currentLine, int wordLength){
      String aLine = "";

      String[] lineline = new String[wordLength];

      String[] word = new String[wordLength];

      for(int i = 0; i < wordLength; i++){
          word[i] = String.valueOf(currentLine.charAt(i));
      }

      for(int i = 0; i < wordLength; i++){
            lineline[i] = Integer.toString(spelling(word[i]));
      }
    

      for(int i = 0; i < wordLength; i++){
          if(i != (wordLength - 1)){
          
            String lastChar = lineline[i].substring(lineline[i].length()-1);
            
            String firstChar = String.valueOf(lineline[(i + 1)].charAt(0));

            if(lastChar.equals(firstChar)){
                aLine += lineline[i] + " ";
            }else{
                aLine += lineline[i];
            }

          }else{
              aLine += lineline[i];
          }

      }

      return aLine;
  }


  private static int spelling(String currentLetter){
      int numLetter = 0;
      switch(currentLetter){
          case "a":
              numLetter = 2;
              break;
          case "b":
              numLetter = 22;
              break;
          case "c":
              numLetter = 222;
              break;
          case "d":
              numLetter = 3;
              break;
          case "e":
              numLetter = 33;
              break;
          case "f":
              numLetter = 333;
              break;
          case "g":
              numLetter = 4;
              break;
          case "h":
              numLetter = 44;
              break;
          case "i":
              numLetter = 444;
              break;
          case "j":
              numLetter = 5;
              break;
          case "k":
              numLetter = 55;
              break;
          case "l":
              numLetter = 555;
              break;
          case "m":
              numLetter = 6;
              break;
          case "n":
              numLetter = 66;
              break;
          case "o":
              numLetter = 666;
              break;
          case "p":
              numLetter = 7;
              break;
          case "q":
              numLetter = 77;
              break;
          case "r":
              numLetter = 777;
              break;
          case "s":
              numLetter = 7777;
              break;
          case "t":
              numLetter = 8;
              break;
          case "u":
              numLetter = 88;
              break;
          case "v":
              numLetter = 888;
              break;
          case "w":
              numLetter = 9;
              break;
          case "x":
              numLetter = 99;
              break;
          case "y":
              numLetter = 999;
              break;
          case "z":
              numLetter = 9999;
              break;
          case " ":
              numLetter = 0;
              break;
      }
      return numLetter;
  }
}
