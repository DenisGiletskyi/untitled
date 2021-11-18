package taskBankHomeWork9;

public class Entry {

    private String login = "Den";
    private int password = 123;
    private String secretWord = "Sec";

    public Entry(String setLogin, int setPassword, String setSecretWord) {
        if (setLogin.equals(login)) {
            System.out.println("Логин принят");
        }
        if (setPassword == password) {
            System.out.println("Пароль принят");
        } else if (setSecretWord.equals(secretWord)) {
            System.out.println("Секретное слово принято");
        } else {
            System.out.println("Неверные данные \nНеоходимо заполнить данные о покупках и контактную информацию");
            PurchaseHistory purchaseHistory = new PurchaseHistory(40304467, "380937155796",
                    "sabb2008@ukr.net");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}

