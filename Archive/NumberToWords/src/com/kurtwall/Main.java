package com.kurtwall;

public class Main {

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(0);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        String word = "";
        String wordString = "";
        int reversedNumber = reverse(number);
        int origDigitCount = getDigitCount(number);
        int reversedDigitCount = getDigitCount(reversedNumber);

        if (number == 0) {
            wordString = "Zero";
        } else {
            while (reversedNumber > 0) {
                int digit = reversedNumber % 10;
                reversedNumber /= 10;
                switch (digit) {
                    case 0:
                        word = "Zero";
                        break;
                    case 1:
                        word = "One";
                        break;
                    case 2:
                        word = "Two";
                        break;
                    case 3:
                        word = "Three";
                        break;
                    case 4:
                        word = "Four";
                        break;
                    case 5:
                        word = "Five";
                        break;
                    case 6:
                        word = "Six";
                        break;
                    case 7:
                        word = "Seven";
                        break;
                    case 8:
                        word = "Eight";
                        break;
                    case 9:
                        word = "Nine";
                        break;
                }
                wordString += word + " ";
            }

            int digitCountDiff = origDigitCount - reversedDigitCount;
            while (digitCountDiff > 0) {
                wordString += "Zero ";
                digitCountDiff--;
            }
        }
        System.out.println(wordString);
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int digitCount = 0;
        if (number == 0) {
            digitCount = 1;
        } else {
            while (number != 0) {
                digitCount++;
                number /= 10;
            }
        }
        return digitCount;
    }

    public static int reverse(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            number /= 10;
            if (reversedNumber == 0) {
                reversedNumber += digit;
            } else {
                reversedNumber = reversedNumber * 10 + digit;
            }
        }
        return reversedNumber;
    }
}
