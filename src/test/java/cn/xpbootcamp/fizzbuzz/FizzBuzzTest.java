package cn.xpbootcamp.fizzbuzz;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_report_fizz_when_number_is_multiple_of_3() {
        assertEquals("Fizz", FizzBuzz.report(3));
        assertEquals("Fizz", FizzBuzz.report(6));
        assertEquals("Fizz", FizzBuzz.report(9));
        assertEquals("Fizz", FizzBuzz.report(12));
    }

    @Test
    public void should_report_buzz_when_number_is_multiple_of_5() {
        assertEquals("Buzz", FizzBuzz.report(5));
        assertEquals("Buzz", FizzBuzz.report(10));
        assertEquals("Buzz", FizzBuzz.report(20));
        assertEquals("Buzz", FizzBuzz.report(25));
    }
}
