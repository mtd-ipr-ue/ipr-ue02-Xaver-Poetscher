import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {

        Out.println("Please enter year here");
        int year = In.readInt();

        Out.println( "Please enter month here");
        int month = In.readInt();

        int days = 0;

        if (month<1 || month >12) {
            System.out.println("Wrong Input. Please enter a correct number between 1 and 12");
            return;
        }

        switch (month) {
            case 1,3,5,7,8,10,12: 
                days =31;
                break;
            case 4,6,9,11:
                days =30;
            case 2:
                if ((year%4 == 0 && year%100 !=0) || year%400 ==0) {
                    days = 29;
                }
                else {
                    days =28;
                }
            
                
            default:
            System.out.println("Fehler: ungültiger Monat");
                break;
        }
        System.out.println("Der " + month +" Monat " + " im Jahr " + year + " hat " +days+ " Tage");
    }
}