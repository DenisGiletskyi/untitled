package homeWork6;

public class HomeWorkCycles {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            System.out.println(i); // outputs 0 to 10
        }

        for (int k = 10; k >= 0; k--) {
            System.out.println("Outputs " + k);
        }

        for (int j = 1; j < 11; j++) {

            if (j % 2 == 0) {
                System.out.println("Even " + j);
            } else {
                System.out.println("Odd " + j);
            }
        }

        for (int f = 0; f < 10; f++) {
            System.out.print("" + f++);
            if (f >= 1) {
                System.out.println(f);
            }
        }
    }
}
