package com.example.daki.java101;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by DaKi on 24/11/2016.
 */

public class CheckTNC_UnitTestSuite {
    int[] lolArray = {
            0,10,22,3,44,58
    };

    int[] lolArray2 = {
            1,22,3,4,58
    };

    @Test
    public void TestContient() throws Exception {


        List<Integer> result = TrouverNombreCommun.maitriseFlowdExecutionListesEtTableaux(lolArray,lolArray2);
        assertTrue("22 non trouvé",result.contains(22));
        assertTrue("3 non trouvé",result.contains(3));
        assertTrue("58 non trouvé",result.contains(58));
        assertEquals(3,result.size());

    }

    @Test
    public void TestContientLeBonNombre() throws  Exception {
        List<Integer> result = TrouverNombreCommun.maitriseFlowdExecutionListesEtTableaux(lolArray,lolArray2);
        assertEquals(3,result.size());
    }

    @Test
    public void TestRenvoieNullSiNonIntersection() throws  Exception {

        int[] lollArray = {
                0,10,3,44
        };

        int[] lollArray2 = {
                1,22,4
        };
        List<Integer> result = TrouverNombreCommun.maitriseFlowdExecutionListesEtTableaux(lollArray,lollArray2);
        assertEquals(null,result);
    }
}
