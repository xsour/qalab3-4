package edu.pazyuk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
  @author xsour
  @project lab3-4
  @class RomanToIntTest
  @version 1.0.0
  @since 23.04.2025 - 11.40
*/

class RomanToIntTest {

    @Test void whenRoman_I_ThenInteger_1() {
        assertEquals(1, RomanConverter.romanToInt("I"));
    }
    @Test void whenRoman_II_ThenInteger_2() {
        assertEquals(2, RomanConverter.romanToInt("II"));
    }
    @Test void whenRoman_IV_ThenInteger_4() {
        assertEquals(4, RomanConverter.romanToInt("IV"));
    }
    @Test void whenRoman_IX_ThenInteger_9() {
        assertEquals(9, RomanConverter.romanToInt("IX"));
    }
    @Test void whenRoman_XXVII_ThenInteger_27() {
        assertEquals(27, RomanConverter.romanToInt("XXVII"));
    }
    @Test void whenRoman_LVIII_ThenInteger_58() {
        assertEquals(58, RomanConverter.romanToInt("LVIII"));
    }
    @Test void whenRoman_XC_ThenInteger_90() {
        assertEquals(90, RomanConverter.romanToInt("XC"));
    }
    @Test void whenRoman_CMXLIV_ThenInteger_944() {
        assertEquals(944, RomanConverter.romanToInt("CMXLIV"));
    }
    @Test void whenRoman_MMXIV_ThenInteger_2014() {
        assertEquals(2014, RomanConverter.romanToInt("MMXIV"));
    }
    @Test void whenRoman_MMMCMXCIX_ThenInteger_3999() {
        assertEquals(3999, RomanConverter.romanToInt("MMMCMXCIX"));
    }

}
