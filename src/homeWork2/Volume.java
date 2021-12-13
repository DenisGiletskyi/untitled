package homeWork2;

import java.io.PrintStream;

public class Volume {
    public static void main(String[] args) {

        double v = 10;

        double r = 5;

        double h = 5.1d;

        final double PI = Math.PI;

        double result = Math.pow( r , 2);

        double operation1 = PI * result * h;

        System.out.println("Обьем V =" + String.format(" %.2f" , operation1 ));

        double operation2 = 2 * PI * result + 2 * PI * result;

        System.out.println("Площадь S =" + String.format(" %.2f" , operation2));

        //System.out.printf(" %2$s %3$s %1$s ", 5, 8, 2)
    }
}
