package HW3_1;


import java.util.Scanner;
import HW3_1.InvalidInputException;

class ReadNums {

    public static int readNums() throws Exception{
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        if(x==0){
            throw new InvalidInputException("Число не может быть нулем");
        }
        //sc.close();
        return x;
    }

    public static int readPow() throws Exception{
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        if(x< 0){
            throw new InvalidInputException("Число не может быть меньше нуля");
        }
        //sc.close();
        return x;
    }

}
