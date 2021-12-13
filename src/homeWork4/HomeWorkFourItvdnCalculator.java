package homeWork4;

import java.util.Scanner;

public class HomeWorkFourItvdnCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию");
        String sing = scanner.nextLine();

        System.out.println("Введите первое число");
        int operand1 = scanner.nextInt();

        System.out.println("Введите второе число");
        int operand2 = scanner.nextInt();

        switch (sing) {

            case "+": {
                System.out.println(operand1 + operand2);
                break;
            }

            case "-": {
                System.out.println(operand1 - operand2);
                break;
            }

            case "*": {
                System.out.println(operand1 * operand2);
                break;
            }

            case "/":
                if (operand2 == 0) {
                    System.out.println("Division by 0");
                } else {
                    System.out.println(operand1 / operand2);
                    break;
                }

            default: {
                System.out.println("Wrong input");
            }

        }

    }

}

