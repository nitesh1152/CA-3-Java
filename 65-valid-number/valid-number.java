class Solution {
    public boolean isNumber(String s) {
        boolean numSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                numSeen = true;
            } else if (c == '+' || c == '-') {
                // Sign is only valid at index 0 OR immediately after 'e'/'E'
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else if (c == '.') {
                // Decimal point cannot appear twice or after an exponent 'e'/'E'
                if (dotSeen || eSeen) {
                    return false;
                }
                dotSeen = true;
            } else if (c == 'e' || c == 'E') {
                // Exponent cannot appear twice and must follow at least one digit
                if (eSeen || !numSeen) {
                    return false;
                }
                eSeen = true;
                numSeen = false; // Reset because an integer MUST follow 'e'/'E'
            } else {
                // Any other letter or symbol is invalid
                return false;
            }
        }

        return numSeen;
    }
}