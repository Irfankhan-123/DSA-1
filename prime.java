import java.util.Scanner;

public class prime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t=scn.nextInt();
        int count=0;
        for (int i = 0; i < t; i++) {
            int n=scn.nextInt();
            count=0;
            for(int div=2;div*div<=n;div++){
                if(n%div==0){
                    count++; 
                };
            };
            if(count==0){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
            
        }
    }
}