package taskBankHomeWork9;

public class GearMain {
    public static void main(String[] args) {
        Entry entry = new Entry("Den", 12, "S");
        entry.setLogin("Ben");
        entry.setPassword(1234);
        System.out.println("Изменения приняты " + entry.getLogin() +" " + entry.getPassword());
    }
}
