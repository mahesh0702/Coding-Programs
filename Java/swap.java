public class swap {
     public static void main(String[] args) {
        int x =15;
        int y= 10;
        int temp;
        System.out.println("Before swapping of value x and y: "+x +" and "+y);
        // Swapping of two values without using third variable
        // x=x+y;
        // y=x-y;
        // x=x-y;

         // Swapping of two values using third variable
        temp = x;
        x = y;
        y = temp;

        
        //displaying the value after swapping
     System.out.println("After swapping of value x and y : " +x +" and " +y);
    }
}