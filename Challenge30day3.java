import java.util.*;
public class Challenge30day3 {

    //Write a program to find sum of n natural numbers
    public static void Sum_of_numbers(int n){
       
        int sum=0;
        
        for (int i = 0; i <=n; i++) {
            sum=sum+i;
            
            System.out.println("The sum till "+ i + " "+sum);
            
        }
       
        

    }   
    public static void main(String args[]){
        try (Scanner input = new Scanner(System.in)) {
            int n=input.nextInt();
            Sum_of_numbers(n);
        }
     
            
        }
       
        
        
        
    } 

