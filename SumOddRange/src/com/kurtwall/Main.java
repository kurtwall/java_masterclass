package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        System.out.println("sumOdd(1, 100) = " + SumOddRange.sumOdd(1, 100));
        System.out.println("sumOdd(-1, 100) = " + SumOddRange.sumOdd(-1, 100));
        System.out.println("sumOdd(100, 100) = " + SumOddRange.sumOdd(100, 100));
        System.out.println("sumOdd(13, 13) = " + SumOddRange.sumOdd(13, 13));
        System.out.println("sumOdd(100, -100) = " + SumOddRange.sumOdd(100, -100));
        System.out.println("sumOdd(100, 1000) = " + SumOddRange.sumOdd(100, 1000));
    }

    public class SumOddRange {
        public static boolean isOdd(int number) {
            if (number <= 0) {
                return false;
            }
            if (number % 2 == 0) {
                return false;
            } else {
                return true;
            }
        }

        public static int sumOdd(int start, int end) {
            int sum = 0;
            if (end < start || start <= 0 || end <= 0) {
                return -1;
            }
            for (int n = start; n <= end; n++) {
                if (isOdd(n)) {
                    sum += n;
                }
            }
            return sum;
        }
    }
}
