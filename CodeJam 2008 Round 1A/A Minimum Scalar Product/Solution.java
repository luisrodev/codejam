import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Solution{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int test_cases = Integer.parseInt(scan.nextLine());

        for(int i = 1; i <= test_cases; i++){

            int n = Integer.parseInt(scan.nextLine());

            Long[] v1 = new Long[n];
            Long[] v2 = new Long[n];

            String cad1 = scan.nextLine();
            String cad2 = scan.nextLine();

            String[] arrCad1 = cad1.split(" ");
            String[] arrCad2 = cad2.split(" ");

            for(int j = 0; j <= (n - 1); j++){
                
                v1[j] = Long.parseLong(arrCad1[j]);
                v2[j] = Long.parseLong(arrCad2[j]);
            }

            Arrays.sort(v1);

            Arrays.sort(v2, Collections.reverseOrder());


            long result = 0;
            
            for(int k = 0; k <= (n - 1); k++){
                result = result +  v1[k]*v2[k];
            }

            System.out.println("Case #" + i + ": " + result);

        }
    }
}
