import java.util.Scanner;

public class Primefactorization {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
        
        while (n!=1) {
            for (int i = 2; i <= n; i++) {
                if (n % i==0) {
                    n = n/i;
                    System.out.println(i);
                    break;
                }
                
            }
        }
        System.out.println(1);
    }
    
}
