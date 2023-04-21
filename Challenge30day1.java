public class Challenge30day1 {
    public static int product(int a,int b){

        int mul=a*b;
        
        return mul;
    }
    public static int add(int a,int b){

        int add=a*b;
        
        return add;
    }
    public static int subtract(int a,int b){

        int subtract=a*b;
        
        return subtract;
    }
    public static float div(float a,float b){

        float div=a*b;
        
        return div;
    }

    public static void main(String args[]){
    
        int a=34;
        int b=45;
        int Multiplication=product(a,b);
        float Division=div(a, b);
        int addition=add(a, b);
        int subtraction=subtract(a, b);
        System.out.println("a*b is"+ Multiplication);
        System.out.println("a+b is"+ addition);
        System.out.println("a-b is"+ subtraction);
        System.out.println("a/b is"+ Division);
    }
}


