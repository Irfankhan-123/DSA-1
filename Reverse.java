import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int k = scn.nextInt();
        


        int number =n;


        // step 1
        CountTheDigit x = new CountTheDigit();
        int digits = x.digitCount(number); 


        // step 2
        k =k%digits;

        //step 3

        int left = number%(int)Math.pow(10, k);

        // step 4

        int right = number/(int)Math.pow(10, k);

        //step 5

        int mul = left*(int)Math.pow(10, digits-k);

        //setp 6

        int ans = mul+right;
        System.out.println(ans);

        
    }
}
