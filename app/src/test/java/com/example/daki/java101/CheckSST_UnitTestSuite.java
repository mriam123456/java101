package com.example.daki.java101;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by Manuel RIAM on 24/11/2016.
 *
 *
 */

public class CheckSST_UnitTestSuite {

    @Test
    public void TestSomme() throws Exception {
        int[] lolArray = {
                0,1,2,3,4,5
        };
        assertEquals(15,SommeSurTableau.calculSommeTableau(lolArray));
        int[] lolArray2 = {
                0,1,2,3,4,-5
        };
        assertEquals(5,SommeSurTableau.calculSommeTableau(lolArray2));
    }

    @Test
    public void TestTailleVariable() throws Exception {
        int[] lolArray = {
                1,2,3,4,5,50,80
        };
        assertEquals(145,SommeSurTableau.calculSommeTableau(lolArray));
        int[] lolArray2 = {
                1,2,3,4,-5,170,200,-150 , 475
        };
        assertEquals(700,SommeSurTableau.calculSommeTableau(lolArray2));
    }

    @Test
    public void TestRetourneZerosurTableauVide() throws Exception {
        int[] lolArray = {};
        assertEquals(0,SommeSurTableau.calculSommeTableau(lolArray));
    }
}
