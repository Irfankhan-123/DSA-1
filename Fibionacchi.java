import java.util.Scanner;

public class Fibionacchi {

    void fibb(int n){
        int a=0;
        int b=1;
        for (int i = 0; i < n; i++) {
            if (i==n-1) {

                System.out.println(a);
            }
             
            int c=a+b;
            a=b;
            b=c;
        }
        // System.out.println(a);

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        Fibionacchi f = new Fibionacchi();
        f.fibb(n);
        scn.close();
    }
    
}
