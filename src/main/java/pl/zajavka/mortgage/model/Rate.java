package pl.zajavka.mortgage.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
@RequiredArgsConstructor
@Getter
public class Rate {

    private final BigDecimal rateNumber;
    private final TimePoint timePoint;
    private final RateAmounts rateAmounts;
    private final MortgageResidual mortgageResidual;
    private final MortgageReference mortgageReference;
}
