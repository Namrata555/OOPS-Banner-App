/**
 * OOPSBannerApp UC3 - OOPS Banner Display Application
 *
 * Uses String.join() instead of + operator
 *
 * @author Namrata
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ", " *** ", " *** ", " ****", " *****"));
        System.out.println(String.join(" ", "*   *", "*   *", "*   *", "*    "));
        System.out.println(String.join(" ", "*   *", "*   *", "**** ", "*****"));
        System.out.println(String.join(" ", "*   *", "*   *", "*    ", "    *"));
        System.out.println(String.join(" ", " *** ", " *** ", "*    ", "**** "));
    }
}