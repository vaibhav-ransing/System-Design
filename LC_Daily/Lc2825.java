package LC_Daily;

public class Lc2825 {
    public boolean canMakeSubsequence(String str1, String str2) {
        if (str2.length() > str1.length())
            return false;

        int idx = 0;
        for (char ch1 : str1.toCharArray()) {
            char ch2 = str2.charAt(idx);
            if ((ch1 == 'z' && ch2 == 'a') || (ch1 == ch2) || ((int) (ch1 - 'a') + 1 == (ch2 - 'a'))) {
                idx++;
            }
            if (idx == str2.length())
                return true;
        }
        return false;
    }
}
