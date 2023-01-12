package pl.zajavka.mortgage.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Getter
public class RateAmounts {

    private final BigDecimal rateAmount;

    private final BigDecimal interestAmount;

    private final BigDecimal capitalAmount;

    private final Overpayment overpayment;

}
