import java.util.Scanner;

public class Calculator {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" the operation you choose ");


        System.out.println("choose 1 for addition,choose 2 for subtraction" +
                ",choose 3 for Multiplication,choose 4 for division");


        int operator = scan.nextInt();
        System.out.println("enter first numbers");

        int num1 = scan.nextInt();
        System.out.println("enter second numbers");

        int num2= scan.nextInt();

     calculate(operator, num1, num2);
    }

public static void calculate(int operator, int num1, int num2) {

    switch (operator) {
        case 1:
            System.out.println("Result: " +(num1 + num2));
            break;
        case 2:
            System.out.println("Result: " +(num1 - num2));
            break;
        case 3:
            System.out.println("Result: " + (num1 * num2));
            break;
        case 4:
            if (num2 != 0) {
                System.out.println("Result: " + ( num1 / num2));
            } else {
                System.out.println("Cannot divide by zero ");
            }
            break;
        default:
            System.out.println("Invalid operator");
    }
}
}
