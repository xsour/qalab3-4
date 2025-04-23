package edu.pazyuk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
  @author xsour
  @project lab3-4
  @class RomanSymbol
  @version 1.0.0
  @since 23.04.2025 - 11.33
*/

public enum RomanSymbol {
    M("M", 1000),
    CM("CM", 900),
    D("D", 500),
    CD("CD", 400),
    C("C", 100),
    XC("XC", 90),
    L("L", 50),
    XL("XL", 40),
    X("X", 10),
    IX("IX", 9),
    V("V", 5),
    IV("IV", 4),
    I("I", 1);

    private final String symbol;
    private final int    value;

    RomanSymbol(String symbol, int value) {
        this.symbol = symbol;
        this.value  = value;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }


    public static List<RomanSymbol> descending() {
        return Arrays.stream(values())
                .sorted(Comparator.comparingInt(RomanSymbol::getValue).reversed())
                .collect(Collectors.toList());
    }
}
