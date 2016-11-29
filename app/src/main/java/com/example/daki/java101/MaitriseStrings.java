package com.example.daki.java101;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

//region Description globale
/** Created by Manuel RIAM on 24/11/2016.
        *
        * Difficulté :  StringToListOfStringArrays 3/5 maitriseSubstring 2/5 logProcess 3/5
        *
        *  Veuillez implémenter la classe Maitrise String
 *  */
//endregion

//region Objectif n°1
/**
 *
 *  Méthode StringToListOfStringArrays :
 *  précondition : récoit 1 String sous le format  a1-a2|b1|c1-c2-c3| ...
 *  Post - Conditions :
 *  -Renvoie une List (le choix de l'implémentation interne est vôtre)
 *   de tableaux de strings au format
 *   List[
 *   {a1,a2},
 *   {b1},
 *   {c1,c2,c3},
 *   etc     ]
 *
 *  -Renvoie null si le string en argument est vide
 * *
 *  [+0.1 à +0.4]
 *
 *  Réussite dans les temps (15 minutes) : 0.1 pts de réserve
 *
 *  ou
 *
 *  Bonus : 0.2 pts de réserve si :
 *      Réussite 2/3 avant 12min (indice à 6 minutes)
 *      + Bonus : 0.1 pt de réserve si :
 *          Réussite avant l'indice avec une syntaxe de boucle
 *          exploitant l'itérateur interne du tableau
 *
 */
//endregion

//region Objectif n°2
/**
 *  Méthode maitriseSubstring :
 *  précondition : reçoit 1 String sous le format
 *          INFO<Id sur 4 chiffres>=<Caractère alphanumériques>;<Date format jj/mm/aaaa>
 *  Post - Conditions :
 *      retourne un string au format
 *      <Id sur 4 chiffres>=<Caractère alphanumériques>;<Date format jj/mm>
 *
 *  [+0.1] si réussite dans les temps (4 min)
 */
//endregion

//region Objectif n°3
/**  Méthode logProcess :
 *      précondition : recoit un tableau de string format maitriseSubstring dont certains peuvent être
 *      malformés
 *
 *      post-condition :
 *      -Renvoie null si tableau ne contient aucun élément
 *      -Valide chacun des String pour le format d'entrée décrit a maitriseSubstring
 *          -Si String valide , utilise maitriseSubstring pour ajuster la chaine
 *          - Renvoie une Liste de String[] agencés de la sorte
 *          {
 *              UA2016<Id sur 4 chiffres>,
 *              <Caractère alphanumériques>,
 *              <Date format jj/mm>
 *          } (Ecrire maitriseSplitString pour prendre soin de l'opération de transformation String -> String[])
 *          -Si String non valide passer silencieusement au traitement du string suivant
 */
//endregion

//region Objectif n°4
/**  Méthode Run4 :
 *      Déterminer les pré et post condition selon la description de logProcess
 *
 *  [+0.3 a +0.5]
 *
 *  Réussite dans les temps (25 minutes) +.3
 *      Bonus +.2 si en moins de 15 minutes
 *      ou
 *      Bonus +.1 si en moins de 20 minutes
 */
//endregion

/**
 * Created by DaKi on 24/11/2016.
 */

public class MaitriseStrings {



    //region Fonction StringToListOfStringArrays
    public static List<String[]> StringToListOfStringArrays(String s)
    {

        return new ArrayList<String[]>();
    }
    //endregion

    //region Fonction maitriseSubstring
    public static String maitriseSubstring(String s)
    {
        return "";
    }
    //endregion

    //region Fonction logProcess
    public static List<String[]> logProcess(String[] sArr)
    {

        return new ArrayList<String[]>();
    }
    //endregion

    //region maitriseSplitString
    public static String[] maitriseSplitString(String s)
    {
        return new String[0];
    }
    //endregion

}
