// Задача1. Напишите программу-калькулятор, которая запрашивает у 
// два числа и выполняет операцию возведения первого числа в степень второго числа. 
//Если введены некорректные числа или происходит деление на ноль, 
//необходимо обработать соответствующие исключения и вывести информативное сообщение об ошибке.
// Важно! С использованием принципа одного уровня абстракции!
// **В этой задаче мы создаем класс PowerCalculator, который содержит метод calculatePower(), выполняющий операцию возведения числа в степень. Если введено некорректное основание (ноль) и отрицательная степень, выбрасывается исключение InvalidInputException.

package HW3_1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {

       
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число для возведения в степень ");
       int x = sc.nextInt();
       System.out.println(x);

    }

    // public static int powerNum(int value, int power) {
    //     for (int i = power; i > 0; i--) {
    //         value *= value;

    //     }
    //     return value;

    // }
}