package ru.dataart.academy.java;

public class ReverseInteger {

    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public static int reverse(int inputNumber) {
        if (-9 <= inputNumber && inputNumber <= 9) {
            return inputNumber;
        }
        int result = 0;
        while (inputNumber != 0) {
            result = result * 10 + inputNumber % 10;
            inputNumber = inputNumber / 10;
        }
        return result;
    }

}
