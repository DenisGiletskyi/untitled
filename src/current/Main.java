package current;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex("02125");
        address.setStreet("Zaporozhets");
        System.out.printf("Index " + address.getIndex() + "\nAddress " + address.getStreet());


    }
}
