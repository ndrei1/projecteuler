package com.andrei;

public class ThirdTask {
//    The prime factors of 13195 are 5, 7, 13 and 29.
//
//    What is the largest prime factor of the number 600851475143 ?


    public static int calculate(long maxValue) {
        long lastNumber = maxValue;
        int biggest = 0;
        for (int i = 1; i <= lastNumber; i++) {
            if (lastNumber % i == 0 && i > biggest) {
                biggest = i;
                lastNumber = lastNumber / i;
            }
        }
        return biggest;
    }
}
