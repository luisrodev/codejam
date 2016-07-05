import java.util.Scanner;

public class Solution{

  public static void main(String[] args){
  	Scanner scan = new Scanner(System.in);
  	int N;//Number of cases.
  	int C;//Amount of credit.
  	int L;//Number of items in the store.
  	int P[];//Price of an item in the store.

  	N = Integer.parseInt(scan.nextLine());


  	//System.out.println("Valor N: " + N);
  	//for each cases in the file.
  	for(int i = 0; i < N; i++){
	    C = Integer.parseInt(scan.nextLine());
	    //L = new int[Integer.parseInt(scan.nextLine())];
	    L = Integer.parseInt(scan.nextLine());
	    //System.out.println("valor L: " + L);
	    P = new int[L];
	    String cad = scan.nextLine();
	    //System.out.println("valor cad: " + cad);
	    String[] arrCad = cad.split(" ");

	    for(int j = 0; j < L; j++){
    		//System.out.println("SOy un item");
    		//P[j] = Integer.parseInt(scan.nextLine());
    		P[j] = Integer.parseInt(arrCad[j]);
	    }

	    //print the items on P
	    //boolean g = false;
	    for(int p = 0; p < L /*&& g == false*/; p++){
	        //System.out.println("Value item: " + (p + 1) + " is: " + P[p]);
    		for(int j = p; j < L /*&& g == false*/; j++){
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
  	if((X + Y) == C){
  	    return true;
  	}else{
  	    return false;
  	}
  }
}
