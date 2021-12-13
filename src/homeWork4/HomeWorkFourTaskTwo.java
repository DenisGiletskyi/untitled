package homeWork4;

import java.util.Scanner;

// Задача 2 Пользователь вводит:

public class HomeWorkFourTaskTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Введите ваше Имя ");
        String nameScanner = scanner.nextLine();

        System.out.println(" Введите ваш пол ");
        String gender = scanner.nextLine();

        System.out.println(" Введите ваш возраст ");
        int age = scanner.nextInt();

        if (age > 18) {
            System.out.println("User " + nameScanner + " \nAge " + age + " \nGender " + gender);
        } else {
            System.out.println(" Вам не достаточно лет ");
        }
        // Задание № 3
        {
            int random = 12;//(int) (Math.random() * 100);

            if (random % 3 == 0 && random % 5 == 0) {
                System.out.println(" Число является FIZZ BUZZ " + random);

            } else if (random % 5 == 0) {
                System.out.println(" Число является BUZZ " + random);

            } else if (random % 3 == 0) {
                System.out.println(" Число является FIZZ " + random);

            } else {
                System.out.println(" Число не является FIZZ BUZZ " + random);
            }
        }

    }
}
