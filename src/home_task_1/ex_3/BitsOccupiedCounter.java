package home_task_1.ex_3;


public class BitsOccupiedCounter {
    public static void main(String[] args) {
        System.out.println("Size of byte variable : " + getSizeOfByte());
        System.out.println("Size of short variable : " + getSizeOfShort());
        System.out.println("Size of int variable : " + getSizeOfInt());
        System.out.println("Size of long variable : " + getSizeOfLong());
    }

    private static int getSizeOfByte() {
        byte num = 1;
        int size = 1;
        while(num > 0) {
            num <<= 1;
            size++;
        }
        return size;
    }

    private static int getSizeOfShort() {
        short num = 1;
        int size = 1;
        while(num > 0) {
            num <<= 1;
            size++;
        }
        return size;
    }

    private static int getSizeOfInt() {
        int num = 1;
        int size = 1;
        while (num > 0) {
            num <<= 1;
            size++;
        }
        return size;
    }

    private static int getSizeOfLong() {
        long num = 1;
        int size = 1;
        while(num > 0) {
            num <<= 1;
            size++;
        }
        return size;
    }
}

// 0000 0000 0000 0000 0000 0000 0000 0001