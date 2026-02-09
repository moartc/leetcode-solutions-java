package solutions.algorithms._0_999._65_Valid_Number;

class Solution {

    /*
    iterate through the number and validate it,
    I can exclude 'e' from validation and perform validation twice - once for the part
    before 'e' and once for the part after 'e'
    rules:
    1. [+-] - only at the first position
    sequence of numbers
    dot
    sequence of numbers
    must end or encounter e
    if there is 'e', the part after it must be a valid number, it cannot end immediately after 'e'

    update: it beats 100%, but it was pretty cumbersome, needs refactoring

     */
    public boolean isNumber(String s) {

        boolean wasE = false;
        boolean canBePlusOrMinus = true;
        boolean canBeDot = true;
        // after e I have to have number and cannot have dot
        boolean necessaryNumberNow = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+' || c == '-') {
                if (!canBePlusOrMinus) {
                    return false;
                }
            } else if (c == 'e' || c == 'E') {
                if (necessaryNumberNow) {
                    return false;
                }
                // I need a number before
                if (i == 0) {
                    return false;
                } else {
                    char charBefore = s.charAt(i - 1);
                    if (charBefore != '.' && (charBefore < '0' || charBefore > '9')) {
                        return false;
                    }
                }
                if (wasE) {
                    return false;
                } else {
                    wasE = true;
                    canBeDot = false;
                    canBePlusOrMinus = true;
                    necessaryNumberNow = true;
                    continue;
                }
            } else if (c == '.') {
                if (canBeDot) {
                    canBeDot = false;
                    // if there was a number before I don't need after, otherwise I need
                    if (i > 0) {
                        char charBefore = s.charAt(i - 1);
                        if (charBefore < '0' || charBefore > '9') {
                            necessaryNumberNow = true;
                        }
                    } else {
                        necessaryNumberNow = true;
                    }
                } else {
                    return false;
                }
            } else if (c >= '0' && c <= '9') {
                if (necessaryNumberNow) {
                    necessaryNumberNow = false;
                }
            } else {
                return false;
            }
            if (canBePlusOrMinus) {
                canBePlusOrMinus = false;
            }
        }
        // I went through the while number, it's valid
        if (necessaryNumberNow) {
            return false;
        }
        if (s.length() == 1) { // ugly check for 1 size 'numbers' if there are really numbers
            char c = s.charAt(0);
            return c >= '0' && c <= '9';
        }
        return true;
    }
}