import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n= scn.nextInt();

        int inv=0;
        int position=1;
        while (n!=0) {
            int digit =n%10;
            inv=inv+position*(int)Math.pow(10, digit-1); //digit * 10^posion-1
            n=n/10;
            position++;
        }
        System.out.println(inv);
    }
    
}
