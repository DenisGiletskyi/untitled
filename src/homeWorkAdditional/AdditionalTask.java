package homeWorkAdditional;

import java.util.Scanner;

public class AdditionalTask {
    public static void main(String[] args) {
        System.out.println(" Добавляем скобки " + (2 + 2) * 2);


        {
            int a = 5;

            int b = 4;

            int c = 0;

            double d = Math.pow(b , 2);

            double discriminant = d - 4 * a * c;

            System.out.println(" Дискрименант равен " + discriminant );
        }


        {

           int a = 0;

           int b = -2;

           int c = 5;

            double d = Math.pow(b , 2);

            double discriminant = d - 4 * a * c;

            System.out.println(" Дискрименант равен " + discriminant );



        }

        {
            int a = 2;

//            boolean one = 1 > --a;
//
//            boolean two = 1 > (a-1);
//
 //           boolean three = 1 > -1 * a;
//
           // boolean four = 1 > (-5*-10+20+30-(a++)/12+ ++a)*0;

            //System.out.println(one);
          //  System.out.println(two);
          //  System.out.println(three);
          //  System.out.println(four);


        }

        {
            Scanner scanner = new Scanner (System.in);

            double a = scanner.nextDouble();

            double b = scanner.nextDouble();

            System.out.println(a + b);




        }

        {
            int first = 10;
            int second = 20;
            String operationAddition = " + ";
            String operationSubtraction = " - ";
            String operationMultiplication = " * ";
            String operationDivision = " / ";
            String operationRemainder = " % ";
            int resultAddition = first + second;
            int resultSubtraction = first - second;
            int resultMultiplication = first * second;
            int resultDivision = first / second;
            int resultRemainder = first % second;


            System.out.printf(" \nFirst number %d  \nSecond number %d  \nOperation %s   \nResult %d " ,
                     first , second , operationAddition , resultAddition );
            System.out.printf(" \nFirst number %d  \nSecond number %d  \nOperation %s \nResult %d " ,
                    first , second , operationSubtraction , resultSubtraction);
            System.out.printf(" \nFirst number %d  \nSecond number %d  \nOperation %s   \nResult %d " ,
                    first , second , operationMultiplication , resultMultiplication);
            System.out.printf(" \nFirst number %d  \nSecond number %d  \nOperation %s   \nResult %d " ,
                    first , second , operationDivision , resultDivision );
            System.out.printf(" \nFirst number %d  \nSecond number %d  \nOperation %s   \nResult %d " ,
                    first , second , operationRemainder , resultRemainder );


        }


    }

}


