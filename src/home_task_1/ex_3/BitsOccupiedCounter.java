package home_task_1.ex_3;


public class BitsOccupiedCounter {
    public static void main(String[] args) {
        byte byteType = 79;
        short shortType = 8564;
        int intType = 97967523;
        long longType = 187629553563425L;
        System.out.println(byteCount(byteType));
        System.out.println(shortCount(shortType));
        System.out.println(intCount(intType));
        System.out.println(longCount(longType));
    }

    static int byteCount(byte number) {
        int bitCounter = 0;
        while (number != 0) {
            bitCounter += number & 1;
            number >>= 1;
        }
        return bitCounter;
    }

    static int shortCount(short number) {
        int bitCounter = 0;
        while (number != 0) {
            bitCounter += number & 1;
            number >>= 1;
        }
        return bitCounter;
    }

    static int intCount(int number) {
        int bitCounter = 0;
        while (number != 0) {
            bitCounter += number & 1;
            number >>= 1;
        }
        return bitCounter;
    }

    static int longCount(long number) {
        int bitCounter = 0;
        while (number != 0) {
            bitCounter += number & 1;
            number >>= 1;
        }
        return bitCounter;
    }

}
// 0010 1010
// 0001 0101
// 0000 1010
// 0000 0101
// 0000 0010
// 0000 0001
// 0000 0000