package homeWork7;

import java.util.Scanner;

public class Methods {                                                //Метод обработки запроса на кредит "получен/нет"
    static String checkCredit(int credit, int month, int remains) {
        if (credit / month <= remains) {
            return " Вам одобрен кредит ";
        } else {
            return "Извините Вам не одобрен Кредит ";
        }
    }

    static String checkAlternative(int credit, int month, int remains, int growth, int icreaseWages) {          //Метод альтернативной проверки кредита
        int result = credit / ((growth * icreaseWages) + remains);
        return ("Мы можем выдать вам кредит на " + ++result + " месяцев");
    }

    static String checkEnterIncome(int income) {

        if (income < 0) {
            return ("ОШИБКА Минусовое значение Дохода");
        } else {
            return ("ERROR");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите сумму Вашего дохода ");
        int income = scanner.nextInt();
        System.out.println(checkEnterIncome(income));



        System.out.println("Укажите остачу на конец месяца ");
        int remains = scanner.nextInt();

        System.out.println("Укажите сумму Кредита ");
        int credit = scanner.nextInt();

        System.out.println("Кол-во месяцев? На которое берется кредит? ");
        int month = scanner.nextInt();
        System.out.println(checkCredit(credit, month, remains));

        System.out.println("Укажите прибавку к з/п ");
        int growth = scanner.nextInt();

        System.out.println("Сколько раз в " + month + " месяцев растет з/п? ");
        int increaseWages = scanner.nextInt();

        System.out.println(checkAlternative(credit, month, remains, growth, increaseWages));

    }
}


