package LC_Daily;

public class lc2337 {
    public boolean canChange(String start, String target) {
        if (start.length() != target.length()) {
            return false;
        }
        int idx = 0; // Pointer for `target`

        for (int i = 0; i < start.length(); i++) {
            char ch = start.charAt(i);

            if (ch == '_') {
                continue; // Skip blanks in `start`
            }

            while (idx < target.length() && target.charAt(idx) == '_') {
                idx++;
            }

            if (idx == target.length() || target.charAt(idx) != ch) {
                return false;
            }
            if (ch == 'L' && i < idx) {
                return false;
            }
            if (ch == 'R' && i > idx) {
                return false;
            }
            idx++;
        }
        while (idx < target.length()) {
            if (target.charAt(idx) != '_') {
                return false;
            }
            idx++;
        }

        return true;
    }
}
