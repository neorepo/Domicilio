/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domicilio;

/**
 *
 * @author neo
 */
public class Utils {

    public static String clean(String str) {
        if (str == null) {
            return "";
        }
        return str.trim().replaceAll("\\s\\s+", " ");
    }

    public static int getPositiveInt(String str) {
        if (str == null) {
            return 0;
        }
        int n = 0;
        do {
            n = getInt(str);
        } while (n < 1);
        return n;
    }

    public static int getInt(String str) {
        if (str == null) {
            return 0;
        }
        int n = 0;
        if (isInteger(str)) {
            n = Integer.parseInt(str);
        }
        return n;
    }

    public static boolean isInteger(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[-+]?\\d+$");
    }
}
