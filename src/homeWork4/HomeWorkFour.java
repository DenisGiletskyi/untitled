package homeWork4;

import java.util.Scanner;

// 1 Задание Выбрал Switch потому что он лучше подходит под такую задачу с
// месяцами он быстрее отдабатывает нежели if else.*/

public class HomeWorkFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        switch (a) {
            case 1: {
                System.out.println(" Month is a January ");
                break;
            }
            case 2: {
                System.out.println(" Month is a February ");
                break;
            }
            case 3: {
                System.out.println(" Mouth is a March ");
                break;
            }
            case 4: {
                System.out.println(" Mouth is a April ");
                break;
            }
            case 5: {
                System.out.println(" Month is a May ");
                break;
            }
            case 6: {
                System.out.println(" Mouth is a June ");
                break;
            }
            case 7: {
                System.out.println(" Mouth is a July ");
                break;
            }
            case 8: {
                System.out.println(" Month is a August ");
                break;
            }
            case 9: {
                System.out.println(" Mouth is a September ");
                break;
            }
            case 10: {
                System.out.println(" Mouth is a October ");
                break;
            }
            case 11: {
                System.out.println(" Mouth is a November ");
                break;
            }
            case 12: {
                System.out.println(" Mouth is a December ");
                break;
            }
            default: {
                System.out.println(" Wrong input ");
            }
        }
    }
}
