package taskBankHomeWork9;

public class PurchaseHistory {

    private int lastPurchasedItem = 40304467;
    private String phoneNumber = "380937155796";
    private String mail = "sabb2008@ukr.net";


    public PurchaseHistory(int lastPurchasedItem, String phoneNumber, String mail) {
        int controlVariable = 0;
        if (this.lastPurchasedItem == lastPurchasedItem) {
            controlVariable++;
        }
        if (this.phoneNumber.equals(phoneNumber)) {
            controlVariable++;
        }
        if (this.mail.equals(mail)) {
            controlVariable++;
        }
        if (controlVariable < 3) {
            System.out.println("Проверка не пройдена");
        }
        if (controlVariable == 3) {
            System.out.println("Необходимо заполнить персональную информацию");
            PersonalData personalData = new PersonalData("Denis", "Born", "28.01.93", 25);
        }
    }
}
