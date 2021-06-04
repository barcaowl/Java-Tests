/**
 * @author Anuj Luitel
 */
public final class LeetCodeTests {

    /**
     * Leetcode #5
     * 
     * @return The longest palindrome
     */
    public static String longestPalindrome(String s) {
        String pal = "" + s.charAt(0);
        int i = 0;
        // Expanding from 1
        while (i < s.length()) {
            int lIn = i - 1;
            int rIn = i + 1;
            while (lIn >= 0 && rIn < s.length() && s.charAt(lIn) == s.charAt(rIn)) {
                String lastPal = s.substring(lIn, rIn + 1);
                if (lastPal.length() > pal.length()) {
                    pal = lastPal;
                }
                lIn--;
                rIn++;
            }
            i++;
        }
        // Expanding from 2
        int rInd = 1;
        while (rInd < s.length()) {
            int lIn = rInd - 1;
            int rIn = rInd;
            while (lIn >= 0 && rIn < s.length() && s.charAt(lIn) == s.charAt(rIn)) {
                String lastPal = s.substring(lIn, rIn + 1);
                if (lastPal.length() > pal.length()) {
                    pal = lastPal;
                }
                lIn--;
                rIn++;
            }
            rInd++;
        }

        return pal;
    }

    /**
     * Leetcode #6
     * 
     * @return Zig-Zagged String
     */
    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        // Vertical array of strings
        String[] zigzag = new String[numRows];
        // initializing to ''
        for (int k = 0; k < zigzag.length; k++) {
            zigzag[k] = "";
        }
        // looping through s
        int i = 0;
        int index = 0;
        boolean down = true;
        while (i < s.length()) {
            zigzag[index] += s.charAt(i);
            if (down) {
                index++;
                if (index == numRows - 1) {
                    down = false;
                }
            } else {
                index--;
                if (index == 0) {
                    down = true;
                }
            }
            i++;
        }
        String allStr = "";
        for (int d = 0; d < zigzag.length; d++) {
            allStr += zigzag[d];
        }
        return allStr;
    }

    /**
     * Leetcode #7
     * 
     * @return If expression matched
     */
    public static boolean isMatch(String s, String p) {

        return true;
    }

    public static void main(String[] args) {

    }
}