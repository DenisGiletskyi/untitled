package homeWorkAccessRecovery;

import java.util.Scanner;

public class AccessRecovery {

    static String checkUser(String login, String password) {
        String[] array = new String[]{"Den", "1488"};
        if (array[0].equals(login) && array[1].equals(password))
            return ("Вход выполнен ");
        else recoveryPhoneNumber("");
        return "--";
    }

    static String recoveryPhoneNumber(String connect) {
        System.out.println("Неверные данные \nДля восстановления пароля введите номер телефона ");
        Scanner scanner = new Scanner(System.in);
        String phoneNumber = scanner.nextLine();
        String number = "0937187569";
        if (phoneNumber.equals(number)) {
            dataOfUser("");
            return ("connectNumber");
        } else return ("noConnect");
    }

    static String dataOfUser(String connect) {
        String[] array = new String[]{"sabb@ukr.net", "sun", "28.01.93"};
        int score = 0;
        System.out.println("Введите вашу почту");
        Scanner scanner = new Scanner(System.in);
        String scannerEmail = scanner.nextLine();
        if (scannerEmail.equals(array[0])) {
            score++;
            System.out.println("OK");
        } else System.out.println("Не существующия почта ");
        System.out.println("Введите секретное слово");
        String scannerSecretWord = scanner.nextLine();
        if (scannerSecretWord.equals(array[1])) {
            score++;
            System.out.println("OK");
        } else System.out.println("Не верное секретное слово ");
        System.out.println("Введите дату рождения ");
        String scannerBirthDay = scanner.nextLine();
        if (scannerBirthDay.equals(array[2])) {
            score++;
            System.out.println("Ок");
        } else{
            System.out.println("Отказано в доступе ");
        }
        if (score >= 2) {
            recoveryLoginPassword("", "");//вызвать метод присвоения нового  логина пароля
        }
        return "";
    }

    static void recoveryLoginPassword(String login, String password) {
        System.out.println("Введите новый логин");
        Scanner scanner = new Scanner(System.in);
        String scannerLogin = scanner.nextLine();
        System.out.println("Введите новый пароль");
        String scannerPassword = scanner.nextLine();
        String[] array1 = new String[2];

        int userloginPosition = 0;
        array1[userloginPosition] = scannerLogin;
        int userloginPosition2 = 1;
        array1[userloginPosition2] = scannerPassword;
        System.out.println("Изминения успешны");
        //return ("Изминения успешны");
    }

    public static void main(String[] args) {
        System.out.println("Введите ваш логин ");
        Scanner scanner = new Scanner(System.in);
        String scannerLogin = scanner.nextLine();
        System.out.println("Введите пароль ");
        String scannerPassword = scanner.nextLine();
        System.out.println(checkUser(scannerLogin, scannerPassword));

    }
}
