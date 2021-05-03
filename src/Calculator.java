import java.util.Scanner;

public class Calculator {



        public static void main (String[] args)
        {
            int num1 = 0;
            int num2 = 0;
            char function;
            double calculation = 0.0;

            Scanner scanObject = new Scanner(System.in);

            System.out.println("What is the first number?: ");
            num1 = scanObject.nextInt();
            System.out.println("What is the second number?: ");
            num2 = scanObject.nextInt();
            System.out.println("What function do you want?: ");
            function = scanObject.next().charAt(0);

            if (function == '+') {
                calculation = num1 + num2;
                System.out.println(calculation);
            } if (function == '*'){
            calculation = num1 * num2;
            System.out.println(calculation);
             } if (function == '/'){
            calculation = num1 / num2;
            System.out.println(calculation);
            } if (function == '-'){
            calculation = num1 - num2;
            System.out.println(calculation);

        }

        }
    }

