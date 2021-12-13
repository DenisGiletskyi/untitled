package homeWork4;

import java.util.Scanner;

public class HomeWorkFourItvdnTranslator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        switch (a) {

            case "Солнечно": {
                System.out.println("Sunny");
                break;
            }
            case "Жарко": {
                System.out.println("Hot");
                break;
            }
            case "Пасмурно": {
                System.out.println("Mainly cloudy");
                break;
            }
            case "Холодно": {
                System.out.println("Cold");
                break;
            }
            case "Дождь": {
                System.out.println("Rain");
                break;
            }
            case "Снег": {
                System.out.println("Snow");
                break;
            }
            case "Зима": {
                System.out.println("Winter");
                break;
            }
            case "Весна": {
                System.out.println("Spring");
                break;
            }
            case "Осень": {
                System.out.println("Autumn");
                break;
            }
            case "Лето": {
                System.out.println("Summer");
                break;
            }
            default: {
                System.out.println("Wrong input");
            }

        }

    }
}
