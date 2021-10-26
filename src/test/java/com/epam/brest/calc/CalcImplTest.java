package com.epam.brest.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class CalcImplTest {

    Calc calc = new CalcImpl();

    @Test
    void TestHandleMethod() {
        BigDecimal weight = new BigDecimal(10);
        BigDecimal pricePerKg = new BigDecimal(10);
        BigDecimal length = new BigDecimal(10);
        BigDecimal pricePerKm = new BigDecimal(10);

        assertNotNull(calc);
        assertEquals(new BigDecimal(200), calc.handle(weight, pricePerKg, length, pricePerKm));
    }

    @Test
    void TestHandleMethodWithNullParameters() {
        assertNotNull(calc);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.handle(null, null, null, null);
        });
    }
}