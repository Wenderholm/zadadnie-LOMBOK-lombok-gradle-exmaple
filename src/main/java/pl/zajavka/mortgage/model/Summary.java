package pl.zajavka.mortgage.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
@RequiredArgsConstructor
@Getter
public class Summary {

    private final BigDecimal interestSum;
    private final BigDecimal overpaymentProvisionSum;
    private final BigDecimal totalLostSum;
    private final BigDecimal totalCapital;
}
