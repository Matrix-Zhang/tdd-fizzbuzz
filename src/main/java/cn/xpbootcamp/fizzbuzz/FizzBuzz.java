package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    public static String report(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(number);
    }
}
