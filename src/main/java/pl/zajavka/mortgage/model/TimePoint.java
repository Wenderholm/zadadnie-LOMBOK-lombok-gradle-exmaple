package pl.zajavka.mortgage.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
@Getter
@RequiredArgsConstructor
public class TimePoint {

    private final BigDecimal year;

    private final BigDecimal month;

    private final LocalDate date;

}
