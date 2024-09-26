package ex_4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    // Format par défaut
    public static final String FORMAT_DEFAUT = "dd/MM/yyyy HH:mm:ss";

    /**
     * Formate une date en chaine de caractères
     * @param pattern - modèle de formatage
     * @param date - date à formater
     * @return - date formatée (chaîne de caractères)
     */

    public static String format(String pattern, Date date) {

        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    /**
     * Formate une date avec le FORMAT_DEFAUT
     * @param date - date à formater
     * @return - date formatée (chaîne de caractères)
     */

    public static String formatDefaut(Date date) {
        return format(FORMAT_DEFAUT, date);
    }
}
