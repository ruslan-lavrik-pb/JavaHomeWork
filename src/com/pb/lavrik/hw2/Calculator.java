package com.pb.lavrik.hw2;
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1, operand2;
        char sang;
        String sang1;

        System.out.println("Для расчета значения необходимо ввести данные");
        System.out.printf("введите первое значение - ");
        operand1 = scan.nextInt();
        System.out.printf("введите второе значение - ");
        operand2 = scan.nextInt();
        System.out.printf("Какой вид математической операции необходимо выполнить? (+,-,* или /) - ");

        sang1 = scan.next();
        sang = sang1.charAt(0);

        switch (sang) {
            case '+':
                System.out.println("Результат вычислений " + operand1 + sang1 + operand2 + " = " +  (operand1 + operand2));
                break;
            case '-':
                System.out.println("Результат вычислений " + operand1 + sang1 + operand2 + " = " +  (operand1 - operand2));
                break;
            case '*':
                System.out.println("Результат вычислений " + operand1 + sang1 + operand2 + " = " +  (operand1 * operand2));
                break;
            case '/':
                if (operand2 != 0) {
                    System.out.println("Результат вычислений " + operand1 + sang1 + operand2 + " = " +  (operand1 / operand2));
                    } else {
                    System.out.println("Второе значение равно НОЛЬ, деление на ноль не разрешено правилами математики");
                }
                break;
            default:
                System.out.println("Вы не сделали свой выбор математической операции. Расчеты провести не возможно");
                System.out.println();
        }
    }
}
