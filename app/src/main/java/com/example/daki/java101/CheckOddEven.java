package com.example.daki.java101;

/**
 * Created by Manuel RIAM on 24/11/2016.
 *
 * Difficulté : 1/5
 *
 *  Veuillez implémenter la CheckOddEven
 *
 *  précondition : récoit un entier en argument
 *  Post - Conditions :
 *  renvoie la chaine "Pair" si l'entier est pair (CheckOE_UnitTestSuite.NombresPairs())
 *  renvoie la chaine "Impair" si l'entier est impair (CheckOE_UnitTestSuite.NombresImpairs())
 *  renvoie la chaine "Zero" si l'entier est 0 (CheckOE_UnitTestSuite.NombresZero())
 *
 *
 *  [+0.05 à +0.2]
 *
 *  Réussite dans les temps (8 minutes) : 0.05 pts de réserve
 *
 *  ou
 *
 *  Bonus : 0.1 pts de réserve si :
 *      Réussite avant l'indice (indice à 4 minutes)
 *      + Bonus : 0.1 pt de réserve si :
 *          Réussite avant l'indice en < 6 lignes sans perte d'indentation
 *
 *
 */

public  class CheckOddEven {



    //region Fonction pairImpairOuNul
    public static String pairImpairOuNul(int num)
    {
        if(num == 0)
            return "Zero";
        if(num % 2 == 0)
            return "Pair";
        return "Impair";
    }
    //endregion
}
