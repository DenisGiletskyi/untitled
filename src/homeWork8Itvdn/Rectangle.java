package homeWork8Itvdn;

public class Rectangle {
    public double size1;
    public double size2;

    public Rectangle() {
    }

    public double areaCalculator(double size1, double size2) {
        return size1 * size2;
    }

    public double perimeterCalculator(double size1, double size2) {
        return size1 + size2;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.areaCalculator(5, 5.5));
        System.out.println(rectangle.perimeterCalculator(10, 9.9));


    }
}
