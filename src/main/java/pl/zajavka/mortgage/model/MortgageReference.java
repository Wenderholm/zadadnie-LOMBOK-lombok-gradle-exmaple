package pl.zajavka.mortgage.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
@RequiredArgsConstructor
@Getter
public class MortgageReference {

    private final BigDecimal referenceAmount;
    private final BigDecimal referenceDuration;

}
