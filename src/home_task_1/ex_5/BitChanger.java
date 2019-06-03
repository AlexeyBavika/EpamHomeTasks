package home_task_1.ex_5;

public class BitChanger {
    public static void main(String[] args) {
        System.out.println(bitChange(212, 4));
    }

    static int bitChange(int number, int position) {
        number ^= 1 << position;
        return number;
    }
}
// 1101 0100
// 0001 0000
// 1100 0100