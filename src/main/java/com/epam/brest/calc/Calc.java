package com.epam.brest.calc;

import java.math.BigDecimal;

public interface Calc {
    BigDecimal handle(BigDecimal weight, BigDecimal ricePerKg, BigDecimal length, BigDecimal pricePerKm);
}
