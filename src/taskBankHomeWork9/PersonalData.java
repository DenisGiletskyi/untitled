package taskBankHomeWork9;

public class PersonalData {
    private String name = "Denis";
    private String surname = "Born";
    private String dateOfBirth = "28.01.93";
    private int age = 25;

    public PersonalData(String name, String surname, String dateOfBirth, int age) {
        int controlVariable = 0;
        if (this.name.equals(name)) {
            controlVariable++;
        }
        if (this.surname.equals(surname)) {
            controlVariable++;
        }
        if (this.dateOfBirth.equals(dateOfBirth)) {
            controlVariable++;
        }
        if (this.age == age) {
            controlVariable++;
        }
        if (controlVariable < 4) {
            System.out.println("Вы не прошли проверку");

        } else {
            System.out.println("Данные приняты \nВведите новые данные для Логина и Пароля");

        }
    }
}
