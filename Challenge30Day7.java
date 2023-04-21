import java.util.*;

public class Challenge30Day7 {
    //To Check whether Palindrome or not 
    public static boolean isPalindrome(int number){
        int palindrome=number;
        int reverse=0;
    
        while(palindrome!=0){
            int remainder=palindrome%10;
            reverse=reverse*10+remainder;
            palindrome=palindrome/10;
        }
        if(number==reverse){
            return true;
        }
        return false;
       }
       
        public static void main(String args[]){
        System.out.println("Please Enter the Number");
        try (Scanner input = new Scanner(System.in)) {
            int palindrome=input.nextInt();
    
            if(isPalindrome(palindrome)){
                System.out.println("Number" + palindrome + "is a Palindrome");
            }
            else{
                System.out.println("Number"+ palindrome +"is not a palindrome ");
            }
        }
       } 
    }
    

