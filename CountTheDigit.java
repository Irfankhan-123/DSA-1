public class CountTheDigit {
    int digitCount(int n){                                              
         int count=0;
         
        int x=n;            
        // loop 1;

        if (x==0) { 
            return 1;
            
        }
        while (x>0) {
            int rem=x%10;         
            x=x-rem;
            x=x/10;
            count++;        
        }
        int z=n;

        double dig = (double)count;
        int divider = (int)Math.pow(10.0,dig-1);

        while (divider > 0) {
            int y=z/divider;
            z=z/10;        
            divider = divider/10;
        }

        return count;
        

    }

    public static void main(String[] args) {
        
        CountTheDigit c=new CountTheDigit();
        c.digitCount(345);
    }
    
}
