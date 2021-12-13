package lessonsMethods;

import java.util.Scanner;

public class Methods {

    static String checkEnterIncome(int income) {
        if (income < 0) {
            System.out.println("Меньше 0");
        } else if (income > 0) {
            System.out.println("OK");
        }
        return ("");
    }

    static String checkCredit(int remains, int credit, int mount) {
        if (remains >= (credit / mount)) {
            System.out.println("Одобрено");
        } else {
            System.out.println("Отклонено");
        }
        return ("OK");
    }

    static String checkAlternative(int credit, int remains, int growth, int icreaseWages) {
        int result = credit / (remains + (growth * icreaseWages));
        return ("Вам предоставят кредит на " + result + " месяцев ");
    }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите доход :");
        int income = scanner.nextInt();
        System.out.println(checkEnterIncome(income));
        if (income < 0) {
            int b = scanner.nextInt();
            System.out.println(checkEnterIncome(b));
        }

        System.out.println("Введите сумму на остаток месяца ");
        int remains = scanner.nextInt();
        System.out.println(checkEnterIncome(remains));

        System.out.println("Введите сумму кредита ?");
        int credit = scanner.nextInt();
        System.out.println(checkEnterIncome(credit));

        System.out.println("На какое кол-во месяцей ?");
        int mount = scanner.nextInt();
        System.out.println(checkEnterIncome(mount));

        System.out.println(checkCredit(remains, credit, mount));

        System.out.println("Введите увеличение з/п");
        int growth = scanner.nextInt();

        System.out.println("Сколько раз в " + ++mount + " месяцей ?");
        int increaseWages = scanner.nextInt();

        System.out.println(checkAlternative(credit, remains, growth, increaseWages));

    }

}

