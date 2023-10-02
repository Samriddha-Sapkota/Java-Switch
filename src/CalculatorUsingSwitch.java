import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        double num1, num2;
        String userOperation;

        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the operation you want to carry out (+ , / , -) ");
        userOperation = sn.next();

        System.out.println("Enter the first number ");
        num1 = sn.nextInt();

        System.out.println("Enter the second number ");
        num2 = sn.nextInt();

        switch (userOperation) {
            case "+" :
                System.out.println(num1 + num2);
            case "-" :
                System.out.println(num1 - num2);
            case "/" :
                System.out.println(num1 / num2);
            default :
                System.out.println("Invalid operation");
        }
    }
}
