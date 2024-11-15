import java.util.Scanner;

public class NPrimeNumber {         
  boolean primeNo(int n){
    if (n==1) {
        return false;
        
    }
    for (int i = 2; i*i<= n; i++) {                                                               
        if (n%i==0) {              
            return false;   
            
        }
        
    }
    return true;
  }
    void nPrimeNumber(int m){
        for (int i = 1; i <=m; i++) { 
            boolean x=primeNo(i);
            if (x) {                 
            System.out.println(i+" ");  
                
            }
            
        }
 
        
    }
    public static void main(String[] args) { 
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();              

        NPrimeNumber p = new NPrimeNumber();

        p.nPrimeNumber(N);


        scn.close();

                  
    }
}
