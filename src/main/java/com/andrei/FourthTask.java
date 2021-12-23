package com.andrei;

public class FourthTask {

//    A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//    Find the largest palindrome made from the product of two 3-digit numbers.


    public static int calculate(int lastNumberInMultiply, int digitCapacity) {
        int maxPalindrome = 0;
        for (int i = createCapacity(digitCapacity); i < lastNumberInMultiply; i++) {
            for (int j = createCapacity(digitCapacity); j < lastNumberInMultiply; j++) {
                int currentPalindrome = i * j;
                if (isPalindrome(currentPalindrome) && currentPalindrome > maxPalindrome)
                    maxPalindrome = currentPalindrome;
            }
        }
        return maxPalindrome;
    }

    private static int createCapacity(int digitCapacity) {
        int capacity = 1;
        for (int i = 0; i < digitCapacity; i++) {
            capacity *= 10;
        }
        return capacity;
    }

    private static boolean isPalindrome(int number) {
        int reverseNumber = 0;
        int reversedNumber = number;
        while (reversedNumber > 0) {
            reverseNumber = reverseNumber * 10 + reversedNumber % 10;
            reversedNumber /= 10;
        }
        return number == reverseNumber;
    }
}
