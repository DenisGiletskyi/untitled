package homeWork2;



public class Circle {
    public static void main(String[] args) {

        final double PI = Math.PI;

        double r = 2;

        double b = PI * r;

        double result = Math.pow(PI * r , 2 );

        System.out.println(" Площать круга равна" + String.format(" %.2f " , result));
    }
}
