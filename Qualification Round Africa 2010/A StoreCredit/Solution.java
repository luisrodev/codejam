import java.util.Scanner;

public class Solution{

  public static void main(String[] args){

  	Scanner scan = new Scanner(System.in);

  	int N;//Number of cases.
  	int C;//Amount of credit.
  	int L;//Number of items in the store.
  	int P[];//Price of an item in the store.

  	N = Integer.parseInt(scan.nextLine());

  	//for each cases in the file.
  	for(int i = 0; i < N; i++){
	    C = Integer.parseInt(scan.nextLine());

	    L = Integer.parseInt(scan.nextLine());

	    P = new int[L];
	    String cad = scan.nextLine();

	    String[] arrCad = cad.split(" ");

	    for(int j = 0; j < L; j++){
    		P[j] = Integer.parseInt(arrCad[j]);
	    }

	    //print the items on P
	    for(int p = 0; p < L; p++){

    		for(int j = p; j < L; j++){
  		    if(p != j){
  		      if(verifi(C, P[p], P[j])){
  			        System.out.println("Case #" + (i + 1) + ": " + (p + 1) + " " + (j + 1));
  		      }
  		    }
    		}
	    }
  	}
  }

  public static boolean verifi(int C, int X, int Y){
    return ((X + Y) == C)?true:false;
  }
}
