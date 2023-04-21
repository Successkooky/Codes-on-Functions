import java.util.*;
public class Challenge30day8 {

        // to Calculate NCR=N!/(N-R)!*R!


        public static void Binomial(int n,int r){
            int t_fact=1;
            for (int i = 1; i <=n; i++) {
                t_fact=t_fact*i;
                
                
            }
            
    
            int r_fact=1;
            for (int j = 1; j <=r; j++) {
                r_fact=r_fact*j;
                
            }
           
    
            int d_fact=1;
            for (int k = 1; k <=(n-r); k++) {
                d_fact=d_fact*k;
                
            }
    
            int bincoeff=t_fact/((r_fact)*(d_fact));
            System.out.println(bincoeff);
        }
    
    
        public static void main(String args[]){
    
            try (Scanner input = new Scanner(System.in)) {
                System.out.println("Enter n");
                int n=input.nextInt();
                System.out.println("Enter r");
                int r=input.nextInt();
                
                Binomial(n, r);
            }
        }
    
}
