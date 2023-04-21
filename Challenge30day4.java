public class Challenge30day4 {
    public static int area(int a){
        System.out.println("Area of Square is " + (a*a));
        return -1;
    }
    public static int area(int length,int breadth){
        System.out.println("Area of Rectangle is " +(length*breadth) );
        return -1;
        
    }
    public static float area(float radius){
        float pi=3.14f;
        float area1=pi*radius*radius;


        System.out.println("Area of Circle is "+ (area1));
        return -1;

    }

    public static void main(String args[]){
        int square=area(8);
        int Rectangle=area(32, 45);
        float circle=area(12.23f);
        System.out.println("The area of Square is "+ square);
        System.out.println("The area of rectangle is "+ Rectangle);
        System.out.println("The area of Circle is "+ circle);
    }
            
        

}
