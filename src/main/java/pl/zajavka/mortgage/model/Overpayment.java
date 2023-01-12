package pl.zajavka.mortgage.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Getter
public class Overpayment {

    public static final String REDUCE_RATE = "REDUCE_RATE";
    public static final String REDUCE_PERIOD = "REDUCE_PERIOD";
    private final BigDecimal amount;
    private final BigDecimal provisionAmount;

}
