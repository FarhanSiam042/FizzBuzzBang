package TestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import src.FizzyPrinter;



public class FizzyPrinterTest {

    @Test
    public void testFizz() {
        FizzyPrinter printer = new FizzyPrinter();
        assertEquals("Fizz", printer.printFizzy(9, false));
    }

    @Test
    public void testFizzBuzzBang() {
        FizzyPrinter printer = new FizzyPrinter();
        assertEquals("FIZZBUZZBANG", printer.printFizzy(105, true));
    }

    @Test
    public void testBoom() {
        FizzyPrinter printer = new FizzyPrinter();
        assertEquals("Boom", printer.printFizzy(8, false));
    }
}