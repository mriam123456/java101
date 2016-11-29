package com.example.daki.java101;

import org.junit.Test;

import java.util.List;
import static org.junit.Assert.*;


/**
 * Created by DaKi on 24/11/2016.
 */

public class CheckMS_UnitTestSuite {

    @Test
    public void TestStringVersListeDeTableauxdeStrings() throws Exception {
        String s = "asm|c-cpp-fortran-cobol|java-csharp-python|php-ruby-asp|powershell";

        List<String[]> test = MaitriseStrings.StringToListOfStringArrays(s);
        assertEquals(5,test.size());
        assertEquals("asm",test.get(0)[0]);
        assertEquals("c",test.get(1)[0]);
        assertEquals("cpp",test.get(1)[1]);
        assertEquals("fortran",test.get(1)[2]);
        assertEquals("cobol",test.get(1)[3]);
        assertEquals("java",test.get(2)[0]);
        assertEquals("csharp",test.get(2)[1]);
        assertEquals("python",test.get(2)[2]);
        assertEquals("php",test.get(3)[0]);
        assertEquals("ruby",test.get(3)[1]);
        assertEquals("asp",test.get(3)[2]);
        assertEquals("powershell",test.get(4)[0]);

        //System.out.print(test.toString());
        int i = 0;
        for(String[] sa: test)
        {
            System.out.println("+++Couche+++ n°" + i);
            for(String sb: sa)
            {
                System.out.println(sb);
            }
            i++;
        }

    }

    @Test
    public void TestStringVide() throws Exception {

        String s = "";
        List<String[]> test = MaitriseStrings.StringToListOfStringArrays(s);
        assertEquals(null,test);

    }

    @Test
    public void TestSousChaine() throws Exception {

        String s = "INFO9854=Java FTW 100 pour cent;24/11/2016";
        String test = MaitriseStrings.maitriseSubstring(s);
        assertEquals("9854=Java FTW 100 pour cent;24/11",test);

        System.out.println("TestSousChaine");
        System.out.println(test);

    }

    @Test
    public void testSplit() throws Exception {
        String[] sArr = MaitriseStrings.maitriseSplitString("9954=Pas de timinik;02/01");

        assertEquals(3, sArr.length);
        assertEquals("9954",sArr[0]);
        assertEquals("Pas de timinik",sArr[1]);
        assertEquals("02/01",sArr[2]);

    }

    @Test
    public void TestFullFunctionnality() throws Exception {

        String[] sArr = {"INFO9854=Java FTW 100 pour cent;24/11/2016",
                "INFO9954=Pas de timinik;02/01/2017",
                "INFO7954=Pas de timinik;02/11/2017",
                "INFO754=Passe Pas;22/08/2015",
                "INFO7854=Passe Pas;22/12/201",
                "INFO7854=Passe Pashj;02/12/2016",
        };
        //String test = MaitriseStrings.maitriseSubstring(s);
        //assertEquals("9854=Java FTW 100 pour cent;24/11",test);
        List<String[]> result = MaitriseStrings.logProcess(sArr);

        assertEquals(4,result.size());
        assertEquals(3,result.get(0).length);
        assertEquals(3,result.get(1).length);
        assertEquals(3,result.get(2).length);
        assertEquals(3,result.get(3).length);

        assertEquals("9854",result.get(0)[0]);
        assertEquals("Java FTW 100 pour cent",result.get(0)[1]);
        assertEquals("24/11",result.get(0)[2]);

        assertEquals("9954",result.get(1)[0]);
        assertEquals("Pas de timinik",result.get(1)[1]);
        assertEquals("02/01",result.get(1)[2]);

        assertEquals("7854",result.get(3)[0]);
        assertEquals("Passe Pashj",result.get(3)[1]);
        assertEquals("02/12",result.get(3)[2]);


        //System.out.println("TestSousChaine");
        //System.out.println(test);

    }
}
