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
            decimalNumber += binaryDigit << i;
        }
        return decimalNumber;
    }
}

// 0101 0
// 0101 1
// 1010 5
// 0000

// 1001 0
// 1001 1
// 0010 1
// 1000 1