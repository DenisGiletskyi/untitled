package homeWork6;

import java.util.Scanner;

public class HomeWorkCyclesTaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {

            System.out.println("Укажите Ваш уровень з/п : ");
            int income = scanner.nextInt();

            System.out.println("Укажите остаток средств на конец месяца: ");
            int remains = scanner.nextInt();

            System.out.println("Введите сумму кредита: ");
            int credit = scanner.nextInt();

            if (income < 0) {
                System.out.println("Ошибка 'Минусовая сумма з/п ' ");
                continue;
            } else if (credit < 0) {
                System.out.println("Ошибка 'Минусовая сумма кредита ' ");
                break;
            }

            System.out.println("Введите срок кредита, количество месяцев: ");
            int time = scanner.nextInt();

            System.out.println("Укажите сумму увеличения заработной платы : ");
            int growth = scanner.nextInt();

            System.out.println("Укажите количество надбавок по з/п в период " + time + " месяцев ?");
            int period = scanner.nextInt();

            if (credit / time < remains + growth * period) {
                System.out.println("Поздравляем Вам одобрен кредит ");
            } else {
                ++time;
                System.out.println("Извините Вам не одобрен кредит \nВы можете взять этот кредит на " + time + " месяцей");
            }
            break;
        }
    }
}
