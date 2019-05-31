package home_task_1.ex_1;

import java.util.Scanner;

public class NumberSystemInterpreter {
    public static void main(String[] args) {
        System.out.println("Enter number in binary format : ");
        Scanner scanner = new Scanner(System.in);
        String binaryNumber = scanner.nextLine();
        System.out.println("'" + binaryNumber + "' -> " + binaryToDecimalNumber(binaryNumber));
    }

    static int binaryToDecimalNumber(String binaryNumber) {
        // compile error if not initialize decimalNumber //
        int decimalNumber = 0, binaryDigit;
        char symbol;
        for (int i = 0; i < binaryNumber.length(); i++) {
            symbol = binaryNumber.charAt(binaryNumber.length() - i - 1);
            if (symbol == '1' || symbol == '0') {
                if (symbol == '1') {
                    binaryDigit = 1;
                } else {
                    binaryDigit = 0;
                }
            } else {
                System.out.println("Wrong write of binary number format!");
                break;
            }
            decimalNumber += binaryDigit * Math.pow(2, i);
        }
        return decimalNumber;
    }
}
