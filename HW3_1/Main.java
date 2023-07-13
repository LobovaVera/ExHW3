package HW3_1;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        int value = 0;
        int pow = 0;

        System.out.println("Введите число для возведения в степень ");
        boolean flag = true;
        while (flag) {
            try {

                int x = ReadNums.readNums();
                value = x;
                flag = false;
            } catch (InvalidInputException e) {
                System.out.println("число не должно быть равно нулю, введите еще раз");
            } catch (InputMismatchException e) {
                System.out.println("неверное значение, введите целое число");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Введите степень ");
        boolean flag2 = true;
        while (flag2) {
            try {
                int y = ReadNums.readPow();
                pow = y;
                flag2 = false;
            } catch (InvalidInputException e) {
                System.out.println("число должно быть больше нуля ");
            } catch (InputMismatchException e) {
                System.out.println("неверное значение, введите целое число");
            } catch (Exception e) {

                e.printStackTrace();
            }

        }
        System.out.println(HW3_1.PowerCalculator.myPower(value, pow));

    }

}
//C:\Users\user\Desktop\exeptions\HW3\HW3_1\Calc.java