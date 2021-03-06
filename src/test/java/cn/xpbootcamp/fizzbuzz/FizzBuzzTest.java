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

    @Test
    public void should_report_whizz_when_number_is_multiple_of_7() {
        assertEquals("Whizz", FizzBuzz.report(7));
        assertEquals("Whizz", FizzBuzz.report(14));
        assertEquals("Whizz", FizzBuzz.report(28));
    }

    @Test
    public void should_report_number_when_number_not_multiple_of_any() {
        assertEquals("1", FizzBuzz.report(1));
        assertEquals("2", FizzBuzz.report(2));
        assertEquals("4", FizzBuzz.report(4));
        assertEquals("8", FizzBuzz.report(8));
    }

    @Test
    public void should_report_fizz_and_buzz_when_number_is_multiple_of_15() {
        assertEquals("FizzBuzz", FizzBuzz.report(15));
        assertEquals("FizzBuzz", FizzBuzz.report(30));
        assertEquals("FizzBuzz", FizzBuzz.report(45));
        assertEquals("FizzBuzz", FizzBuzz.report(60));
    }

    @Test
    public void should_report_buzz_and_whizz_when_number_is_multiple_of_35() {
        assertEquals("BuzzWhizz", FizzBuzz.report(35));
        assertEquals("BuzzWhizz", FizzBuzz.report(70));
    }

    @Test
    public void should_report_fizz_buzz_and_whizz_when_number_is_multiple_of_105() {
        assertEquals("FizzBuzzWhizz", FizzBuzz.report(105));
        assertEquals("FizzBuzzWhizz", FizzBuzz.report(210));
    }
}
