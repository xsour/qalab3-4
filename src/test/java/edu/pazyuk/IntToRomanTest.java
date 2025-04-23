package edu.pazyuk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
  @author xsour
  @project lab3-4
  @class IntToRomanTest
  @version 1.0.0
  @since 23.04.2025 - 11.39
*/

class IntToRomanTest {

    @Test
    void whenArabic_1_ThenRoman_I() {
        assertEquals("I", RomanConverter.intToRoman(1));
    }

    @Test
    void whenArabic_2_ThenRoman_II() {
        assertEquals("II", RomanConverter.intToRoman(2));
    }

    @Test
    void whenArabic_3_ThenRoman_III() {
        assertEquals("III", RomanConverter.intToRoman(3));
    }

    @Test
    void whenArabic_4_ThenRoman_IV() {
        assertEquals("IV", RomanConverter.intToRoman(4));
    }

    @Test
    void whenArabic_5_ThenRoman_V() {
        assertEquals("V", RomanConverter.intToRoman(5));
    }

    @Test
    void whenArabic_6_ThenRoman_VI() {
        assertEquals("VI", RomanConverter.intToRoman(6));
    }

    @Test
    void whenArabic_9_ThenRoman_IX() {
        assertEquals("IX", RomanConverter.intToRoman(9));
    }

    @Test
    void whenArabic_10_ThenRoman_X() {
        assertEquals("X", RomanConverter.intToRoman(10));
    }

    @Test
    void whenArabic_27_ThenRoman_XXVII() {
        assertEquals("XXVII", RomanConverter.intToRoman(27));
    }

    @Test
    void whenArabic_40_ThenRoman_XL() {
        assertEquals("XL", RomanConverter.intToRoman(40));
    }

    @Test
    void whenArabic_50_ThenRoman_L() {
        assertEquals("L", RomanConverter.intToRoman(50));
    }

    @Test
    void whenArabic_58_ThenRoman_LVIII() {
        assertEquals("LVIII", RomanConverter.intToRoman(58));
    }

    @Test
    void whenArabic_90_ThenRoman_XC() {
        assertEquals("XC", RomanConverter.intToRoman(90));
    }

    @Test
    void whenArabic_100_ThenRoman_C() {
        assertEquals("C", RomanConverter.intToRoman(100));
    }

    @Test
    void whenArabic_400_ThenRoman_CD() {
        assertEquals("CD", RomanConverter.intToRoman(400));
    }

    @Test
    void whenArabic_500_ThenRoman_D() {
        assertEquals("D", RomanConverter.intToRoman(500));
    }

    @Test
    void whenArabic_900_ThenRoman_CM() {
        assertEquals("CM", RomanConverter.intToRoman(900));
    }

    @Test
    void whenArabic_944_ThenRoman_CMXLIV() {
        assertEquals("CMXLIV", RomanConverter.intToRoman(944));
    }

    @Test
    void whenArabic_1000_ThenRoman_M() {
        assertEquals("M", RomanConverter.intToRoman(1000));
    }

    @Test
    void whenArabic_1984_ThenRoman_MCMLXXXIV() {
        assertEquals("MCMLXXXIV", RomanConverter.intToRoman(1984));
    }

    @Test
    void whenArabic_1990_ThenRoman_MCMXC() {
        assertEquals("MCMXC", RomanConverter.intToRoman(1990));
    }

    @Test
    void whenArabic_2008_ThenRoman_MMVIII() {
        assertEquals("MMVIII", RomanConverter.intToRoman(2008));
    }

    @Test
    void whenArabic_2014_ThenRoman_MMXIV() {
        assertEquals("MMXIV", RomanConverter.intToRoman(2014));
    }

    @Test
    void whenArabic_2421_ThenRoman_MMCDXXI() {
        assertEquals("MMCDXXI", RomanConverter.intToRoman(2421));
    }

    @Test
    void whenArabic_3999_ThenRoman_MMMCMXCIX() {
        assertEquals("MMMCMXCIX", RomanConverter.intToRoman(3999));
    }

}
