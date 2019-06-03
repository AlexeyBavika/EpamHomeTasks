package home_task_1.ex_2;

import java.util.Scanner;

public class SignChangeViaBinaryOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(~number + 1); // ~ = number * (-1) - 1
    }
}
