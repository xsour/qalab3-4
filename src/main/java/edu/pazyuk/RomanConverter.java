package edu.pazyuk;

/*
  @author xsour
  @project lab3-4
  @class RomanConverter
  @version 1.0.0
  @since 23.04.2025 - 11.34
*/

public class RomanConverter {
    public static String intToRoman(int num) {
        if (num <= 0 || num > 3999) {
            throw new IllegalArgumentException("Value must be in the range 1..3999");
        }
        StringBuilder sb = new StringBuilder();
        for (RomanSymbol sym : RomanSymbol.descending()) {
            while (num >= sym.getValue()) {
                sb.append(sym.getSymbol());
                num -= sym.getValue();
            }
        }
        return sb.toString();
    }

    public static int romanToInt(String roman) {
        if (roman == null || roman.isEmpty()) {
            throw new IllegalArgumentException("Roman string must not be null or empty");
        }

        String s = roman.toUpperCase();
        int index = 0;
        int result = 0;

        for (RomanSymbol sym : RomanSymbol.descending()) {
            String token = sym.getSymbol();
            while (s.startsWith(token, index)) {
                result += sym.getValue();
                index += token.length();
            }
        }

        if (index != s.length()) {
            throw new IllegalArgumentException("Invalid Roman numeral: " + roman);
        }
        return result;
    }
}
