package com.andrei;

public class SevenTask {

//    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//    What is the 10 001st prime number?


    public static int calculate(int numberOfPrimes) {
        int counter = 0;
        int currentlyNumber = 0;
        while (counter != numberOfPrimes) {
            currentlyNumber++;
            if (findPrimesNumber(currentlyNumber)) {
                counter++;
            }

        }
        return currentlyNumber;
    }

    private static boolean findPrimesNumber(int number) {
        int counter = 3;
        if (number == 2) {
            return true;
        }
        if (number == 1 || number % 2 == 0) {
            return false;
        }
        while ((counter * counter) <= number) {
            if (number % counter == 0) {
                return false;
            } else {
                counter += 2;
            }
        }
        return true;
    }

}
