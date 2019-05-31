package home_task_1.ex_3;

import java.util.Scanner;

public class BitsOccupiedCounter {
    public static void main(String[] args) {
        System.out.println(intCounter(10));
        byte b = 10;
        System.out.println(byteCounter(b));
    }

    // same result for all byte short int long

    static int byteCounter(byte number) {
        int bitCounter = 0;
        while(number != 0) {
            bitCounter++;
            number = (byte)(number >> 1);
        }
        return bitCounter;
    }

    static int intCounter(int number) {
        int bitCounter = 0;
        while(number != 0) {
            bitCounter++;
            number >>= 1;

        }
        return bitCounter;
    }
}
