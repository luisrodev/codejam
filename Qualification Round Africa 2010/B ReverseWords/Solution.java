import java.util.Scanner;

public class Solution{

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int N; //Numer of cases.
    int L; //Number of letters.
    int W; //Number of words.
    //String aline;

    N = Integer.parseInt(scan.nextLine());


    //Loop for lines
    for(int i = 1; i <= N; i++){

      String someline = scan.nextLine();

      int longchar = getLengthALine(someline);

      //System.out.println("Valor de la linea: " + i + "  es: " + someline + " longitud: " + longchar );
      //System.out.println("Estas en la linea: " + i);
      String palabra = "";
      String[] palabras;

      L = obtTotLetters(longchar, someline);
      W = obtTotWords(longchar, someline);
      /*
      for(int e = 0; e < longchar; e++){

        if(getActualChar(e, someline) != ' '){
          L++;
          palabra += Character.toString(getActualChar(e, someline));
        }else{
          W++;
          //palabra += Character.toString(getActualChar(e, someline));
        }

        System.out.println("Caracter: " + getActualChar(e, someline) + " de la posicion: " + (e + 1));

      }

      */

      //System.out.println("Tot letters: " + L + " tot words: " + W);
      palabras = new String[W];
      int tam = palabras.length;

      //System.out.println("Length arREGLO: " + tam);

      palabras = getCompletsWords(longchar, someline, W);

      /*
      for(int imp = 0; imp < tam; imp++){
        System.out.println("valor del campo: " + imp + " es: " + palabras[imp]);
      }
      */

      //solve(palabras, W);
      String terminado = solve(palabras, W);

      System.out.println("Case #" + i + ": " + terminado);

      /*
      for(int p = 0; p < W; p++){
        txts[p] = palabra;
      }

      System.out.println("Palabra: " + palabra);

      */

      //this is a workzone
      /*
      for(int cont = 0; cont < W; cont++){
        //System.out.println("palabra num: " + cont);
        System.out.println("Palabra num: " + cont + " es: " + palabras[cont]);
      }
      */

      //System.out.println("Numero de letras: " + L + " numero de palabras: " + W);
    }

  }

  private static String solve(String[] palabras, int words){
    String algo = "";

    for(int i = (words - 1); i >= 0; i--){
      //System.out.println("Solve word: " + i);
      if(i > 0){
        algo += palabras[i] + " ";
      }else{
        algo += palabras[i];
      }

    }
    return algo;
  }

  private static String[] getCompletsWords(int longChar, String line, int totWords){
    String[] palabras = new String[totWords];

    //System.out.println("Arreglo interno: " + totWords);

    String palabra = "";

    int contPal = 0;

    for(int i = 0; i < longChar; i++){
      /*
      if(getActualChar(i, line) != ' ' && i <= longChar){
        palabra += Character.toString(getActualChar(i, line));
      }else{
        //lo que pasa cuando encuentra un espacio en el caracter actual.
        //palabra += Character.toString(getActualChar(i, line));
        System.out.println("contador de palabras: " + contPal);

        palabras[contPal] = palabra;
        palabra = "";
        contPal++;
      }
      */
      //if(getActualChar(i, line) == ' ' || (i + 1) == (longChar)){
      if(getActualChar(i, line) == ' ' || (i + 1)  == (longChar)){
        palabra += Character.toString(getActualChar(i, line));
        //System.out.println("contador de palabras: " + contPal);

        //palabra.trim();

        palabras[contPal] = palabra.trim();
        palabra = "";
        contPal++;
      }else{
        palabra += Character.toString(getActualChar(i, line));
      }
    }

    return palabras;
  }

  private static int obtTotWords(int longChar, String line){
    int words = 1;
    for(int i = 0; i < longChar; i++){
      if(getActualChar(i, line) == ' '){
        words++;
      }
    }

    return words;
  }
  private static int obtTotLetters(int longChar, String line){
    int letters = 0;
    for(int i = 0; i < longChar; i++){
      if(getActualChar(i, line) != ' '){
        letters++;
      }
    }

    return letters;
  }

  private static char getActualChar(int position, String theLine){
    char actualChar;

    char[] chartemp = theLine.toCharArray();

    actualChar = chartemp[position];

    return actualChar;
  }

  private static int getLengthALine(String someLine){
    char[] chartemp = someLine.toCharArray();

    return chartemp.length;
  }
}
