package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public static String report(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
