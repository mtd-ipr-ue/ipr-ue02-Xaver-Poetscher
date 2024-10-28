import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {

        Out.println("Please enter first number");
        int Number1 = In.readInt();

        Out.println("Please enter second number");
        int Number2 = In.readInt();

        Out.println("Please enter third number");
        int Number3 = In.readInt();

        int max = Number1;
        if (max < Number2) {
            max = Number2;
        }
        if (max < Number3) {   
            max = Number3;
        }
        System.out.println("The maximum is "+max);
    } 
}
