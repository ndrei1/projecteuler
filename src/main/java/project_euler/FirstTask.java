package project_euler;

public class FirstTask {
//    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//    Find the sum of all the multiples of 3 or 5 below 1000.

    public static int calculate(int maxValue, int firstArgument, int secondArgument) {
        maxValue = maxValue - 1;
        int a = maxValue / firstArgument;
        int b = maxValue / secondArgument;
        int c = firstArgument * secondArgument;
        int d = maxValue / c;
        return (a * (firstArgument + (a * firstArgument))) / 2
                + (b * (secondArgument + (b * secondArgument))) / 2
                - (d * (c + (d * c))) / 2;
    }

}
