package be.vdab.theorie;

import java.util.regex.Pattern;

public class Regex {
    private static final Pattern PATTERN = Pattern.compile("^(\\d{4})-(\\d{4})$");
    /*1. De class Pattern stelt een regular expression voor. Je geeft die mee aan de method compile.
            Je moet \ als \\ typen om \ als letterlijk teken aan te geven.
            De method compile compileert de regular expression en geeft die als een Pattern object.*/
    public static void main(String[] args) {
        var matcher = PATTERN.matcher("2001-2002");
                /*2. Je geeft aan de method matcher een String mee. De method geeft een Matcher object terug.
            Dit bevat informatie over hoe de String past bij de regular expression.*/
        if (matcher.matches()) {
                  /*3. De method matches geeft true terug als de String past bij de regular expression.
            Anders geeft de method false terug.*/
            System.out.println(matcher.group(1));
            /*4. Je toont de 1° groep in de String (2001).*/
            System.out.println(matcher.group(2));
            /*5. Je toont de 2° groep in de String (2002).*/
        } else {
            System.out.println("Verkeerd");
        }
    }
}