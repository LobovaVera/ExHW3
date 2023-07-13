package HW3_1;

public class PowerCalculator {

    public static int myPower(int value, int power) {
        int temp = value;
        if (power == 0){
            return 1;
        }
        for (int i = power; i > 1; i--) {
            value *= temp;
        }
        return value;
    }


    
}
