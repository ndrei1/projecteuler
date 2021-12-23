package com.andrei;

public class FifthTask {

//    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

    public static int calculate() {
        int[] numbersFroDivision = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int result = 0;
        while (true) {
            result++;
            if(checkTheNumber(result, numbersFroDivision)){
                return result;
            }
        }
    }
    private static boolean checkTheNumber(int number, int[] numbersFroDivision) {
        for (int divider : numbersFroDivision) {
            if (number % divider != 0) {
                return false;
            }
        }
        return true;
    }
}
