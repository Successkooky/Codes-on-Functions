import java.util.Scanner;
public class Challenge30day5 {

    // Write a boolean Function to check whether function is even or not 

    public static boolean isEven(int number)
    {
        if(number % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    



    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in)) {
            int num;
            
            System.out.print("Enter an integer: ");
            num = input.nextInt();
                    
            if(isEven(num))
            {
                System.out.println("Number is even");
            }
            else
            {
                System.out.println("Number is odd");
            }
        }    
    }

   
}
    

