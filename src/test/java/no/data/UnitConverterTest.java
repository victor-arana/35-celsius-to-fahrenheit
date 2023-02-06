package no.data;

import static org.junit.Assert.*;

public class UnitConverterTest {

    @org.junit.Test
    public void convertCelsiusToFahrenheit() {
        double input = 32.9;
        double expectedOutput = 91.22;
        assertTrue(expectedOutput == UnitConverter.convertCelsiusToFahrenheit(input));
    }

    @org.junit.Test
    public void convertCelsiusToFahrenheit_02() {
        double input = 0;
        double expectedOutput = 32.0;
        assertTrue(expectedOutput == UnitConverter.convertCelsiusToFahrenheit(input));
    }
}