import java.util.*;
public class Challenge30day6 {
     
    public static int factorial(int n){
        int f=1;
        for (int i = 1; i <=n; i++) {
            f=f*i;
            
        }
        return f;

    }
    //To Calculate Factorial of a number
    //Remember in Java int Comprises of only 4 bytes of Space so If we put numbers greater than 20 
    //For them we need to replace int by Long int 
    
    public static void main(String args[]){

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Which no factorial u want");
            int n=input.nextInt();
            int resL=factorial(n);
            System.out.println("factorial of " + n + "is" +resL);
        }

    }
    
}
