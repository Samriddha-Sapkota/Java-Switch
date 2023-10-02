import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        int userInput;

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number ");
        userInput = sn.nextInt();

        switch(userInput){
            case 1,7,6:
                System.out.println("Weekend");
                break;
            case 2,3,4,5:
                System.out.println("Weekdays");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
