/**
 * OOPSBannerApp UC4 - OOPS Banner using Array & Loop
 *
 * @author Namrata
 * @version 4.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] lines = new String[5];

        lines[0] = String.join(" ", " *** ", " *** ", " ****", " *****");
        lines[1] = String.join(" ", "*   *", "*   *", "*   *", "*    ");
        lines[2] = String.join(" ", "*   *", "*   *", "**** ", "*****");
        lines[3] = String.join(" ", "*   *", "*   *", "*    ", "    *");
        lines[4] = String.join(" ", " *** ", " *** ", "*    ", "**** ");

        for (String line : lines) {
            System.out.println(line);
        }
    }
}