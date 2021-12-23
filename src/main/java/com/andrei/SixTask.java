package com.andrei;

public class SixTask {

//    The sum of the squares of the first ten natural numbers is,
//    The square of the sum of the first ten natural numbers is,
//    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .
//    Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

    public static int calculate(int toValue) {
        int sumOfTheSquare = toValue * (toValue + 1) * (2 * toValue + 1) / 6;
        int squareOfTheSum = ((toValue * (toValue + 1)) / 2) * ((toValue * (toValue + 1)) / 2);
        return squareOfTheSum - sumOfTheSquare;

    }

}
