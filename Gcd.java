import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a =scn.nextInt();
        int b=scn.nextInt();

     int rem =-1;
       int x=a;
       int y=b;
        
        while (rem !=0) {
        
         rem=a%b;

        a=b;
        b=rem;
            
        }
        System.out.println("gcd "+ a);


        int lcm =(x*y)/a;
        System.out.println("lcm "+ lcm);


        

    }
    
}
