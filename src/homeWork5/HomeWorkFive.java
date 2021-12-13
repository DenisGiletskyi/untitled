package homeWork5;

import java.util.Scanner;

public class HomeWorkFive {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean d = !((!a | b) && (a | b | c) || !c) && (!a && !b | c);
        System.out.println(d); // Вышло правильно посчитать в уме только со второго раза)

        //Задание № 2
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your name");
            String name = scanner.nextLine();

            System.out.println("Enter your gender");
            String gender = scanner.nextLine();

            System.out.println("Enter your age");
            int age = scanner.nextInt();

            switch (gender) {
                case "Man": {
                    if (age >= 65) {
                        System.out.println("It's time for you to retire");
                        break;
                    } else {
                        System.out.println("You retire early");
                        break;
                    }
                }
                case "Woman": {
                    if (age >= 60) {
                        System.out.println("It's time for you to retire");
                        break;
                    } else {
                        System.out.println("You retire early");
                        break;
                    }
                }
            }
        }
        // Задание №3
        {
            System.out.println("1 ^ 1 = 0" + "\t0 ^ 0 = 0" + "\n1 ^ 0 = 1" + "\t0 ^ 1 = 1" + "\n1 | 1 = 1" + "\t1 | 0 = 1"
                    + "\n0 | 0 = 0" + "\t0 | 1 = 1" + "\n1 & 1 = 1" + "\t1 & 0 = 0" + "\n0 & 0 = 0" + "\t0 & 1 = 0");
        }
    }
}



