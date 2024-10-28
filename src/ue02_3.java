import libraries.In;
import libraries.Out;

public class ue02_3 {
    public static void main(String[] args) {
        Out.println("Please enter x coordinate");
        double x = In.readDouble();

        Out.println("Please enter y coordinate");
        double y = In.readDouble();

        boolean greenArea = (x>= 0 && y>=0) && ( x*x +y*y >= 4*4) && (x<=4 && y<=4);
        
        if (greenArea) {
            System.out.println("The Point is inside of the green Area");
        }
        else {
            System.out.println("The Point is outside of the green Area");
        }
    }  
}
