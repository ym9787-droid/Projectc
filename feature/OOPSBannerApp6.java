/**
 * OOPSBannerApp - Modular Banner Application
 * This class generates an ASCII art banner for "OOPS" using dedicated methods 
 * for each letter's pattern to enhance reusability.
 */
public class OOPSBannerApp {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            " ***** ",
            " *    *",
            " *    *",
            " ***** ",
            " *     ",
            " *     ",
            " *     "
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            "  **** ",
            " *     ",
            " *     ",
            "  ***  ",
            "     * ",
            "     * ",
            " ****  "
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {
        
        // Step 2: Call methods to get the patterns and store them in String arrays
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Step 3: Use a loop to assemble and print each line of the banner "OOPS"
        // Note: All patterns must have the same number of rows (length)
        for (int i = 0; i < oPattern.length; i++) {
            // Concatenate the i-th line of each letter with spaces in between
            System.out.println(oPattern[i] + "  " + 
                               oPattern[i] + "  " + 
                               pPattern[i] + "  " + 
                               sPattern[i]);
        }
    }
}