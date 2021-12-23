package project_euler;

public class EighthTask {

//    The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
//    Number in the test
//    Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?

    public static long calculate(String bigNumber) {
        char[] arrayWithNumber = bigNumber.toCharArray();
        long currentlyNumber = 1;
        long result = 0;
        for (int i = 0; i < bigNumber.length() - 13; i++) {
            for (int j = i; j <= i + 12; j++) {
                int a = Character.getNumericValue((arrayWithNumber[j]));
                currentlyNumber *= a;
            }
            if (result < currentlyNumber) {
                result = currentlyNumber;
            }
            currentlyNumber = 1;
        }
        return result;
    }
}
