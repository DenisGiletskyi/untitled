package homeWork7Recursion;

public class Recursion {

    static double firstMethod(int one, int two, int three) {
        int a = one+two+three;
        System.out.println("Сумма первого числа "+secondMethod(one));
        System.out.println("Сумма всех чисел до рекурсии " + a);
        System.out.println("Сумма всех чисел после рекурсии ");
        return secondMethod(a);
    }
    static int secondMethod (int one) {
        if (one == 1) {
            return 1;
        } else {
            return one + secondMethod(one - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(firstMethod(6, 6, 8));
    }
}


