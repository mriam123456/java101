package com.example.daki.java101;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by DaKi on 24/11/2016.
 */

public class CheckOE_UnitTestSuite {

    @Test
    public void NombresPairs() throws Exception {
        assertEquals("Pair",CheckOddEven.pairImpairOuNul(60));
        assertEquals("Pair",CheckOddEven.pairImpairOuNul(-58));
        assertEquals("Pair",CheckOddEven.pairImpairOuNul(879456));
        assertEquals("Pair",CheckOddEven.pairImpairOuNul(-12348));
    }

    @Test
    public void NombresImpairs() throws Exception {
        assertEquals("Impair",CheckOddEven.pairImpairOuNul(745));
        assertEquals("Impair",CheckOddEven.pairImpairOuNul(-894567));
        assertEquals("Impair",CheckOddEven.pairImpairOuNul(8745));
        assertEquals("Impair",CheckOddEven.pairImpairOuNul(-2563));
    }

    @Test
    public void NombresZero() throws Exception {
        assertEquals("Zero",CheckOddEven.pairImpairOuNul(0));
    }
}
