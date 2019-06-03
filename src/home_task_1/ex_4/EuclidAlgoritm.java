package home_task_1.ex_4;

public class EuclidAlgoritm {
    public static void main(String[] args) {
        System.out.println(greatestCommonDividerCount(35, 20));
    }
        static int greatestCommonDividerCount(int firstNumber, int secondNumber) {
        if(firstNumber == 0) return secondNumber;
        if(secondNumber == 0) return firstNumber;
        if(firstNumber == 1 || secondNumber == 1) return 1;

        boolean isEvenFirstNumber = (firstNumber & 1) == 0;
        boolean isEvenSecondNumber = (secondNumber & 1) == 0;

        if(isEvenFirstNumber && isEvenSecondNumber) return (greatestCommonDividerCount(firstNumber >> 1, secondNumber >> 1)) << 1;

        if(isEvenFirstNumber) return greatestCommonDividerCount(firstNumber >> 1, secondNumber);

        if(isEvenSecondNumber) return greatestCommonDividerCount(firstNumber, secondNumber >> 1);

        if(firstNumber > secondNumber) return greatestCommonDividerCount((firstNumber - secondNumber) >> 1, secondNumber);

        return greatestCommonDividerCount((secondNumber - firstNumber) >> 1, firstNumber);
    }
}
