package solutions.algorithms._1000_1999._1358_Number_of_Substrings_Containing_All_Three_Characters;

class Solution {


    /*
    a
    ab
    abc -> count 1
    bca -> count 2
    ca
    cab -> count 3
    ab
    abc -> count 4
    todo clean up
     */
    public int numberOfSubstrings(String s) {

        // could be replaced by regular vars
        int[] prefA = new int[s.length()];
        int[] prefB = new int[s.length()];
        int[] prefC = new int[s.length()];

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            if (i > 0) {
                prefA[i] = prefA[i - 1] + (c == 'a' ? 1 : 0);
                prefB[i] = prefB[i - 1] + (c == 'b' ? 1 : 0);
                prefC[i] = prefC[i - 1] + (c == 'c' ? 1 : 0);
            } else {
                prefA[i] = c == 'a' ? 1 : 0;
                prefB[i] = c == 'b' ? 1 : 0;
                prefC[i] = c == 'c' ? 1 : 0;
            }
        }

        int ctr = 0;
        int left = 0;
        int right = 0;
        int aNumb;
        int bNumb;
        int cNumb;

        while (right < charArray.length) {
            if (left > 0) {
                aNumb = prefA[right] - prefA[left - 1];
                bNumb = prefB[right] - prefB[left - 1];
                cNumb = prefC[right] - prefC[left - 1];
            } else {
                aNumb = prefA[right];
                bNumb = prefB[right];
                cNumb = prefC[right];
            }
            if (aNumb > 0 && bNumb > 0 && cNumb > 0) {

                while (aNumb > 0 && bNumb > 0 && cNumb > 0) {
                    // it's valid
                    left++;
                    if (left > 0) {
                        aNumb = prefA[right] - prefA[left - 1];
                        bNumb = prefB[right] - prefB[left - 1];
                        cNumb = prefC[right] - prefC[left - 1];
                    } else {
                        aNumb = prefA[right];
                        bNumb = prefB[right];
                        cNumb = prefC[right];
                    }
                }
                left--;
                ctr += (left + 1);
            }

            // window not vlaid -> move right
            right++;
        }
        return ctr;
    }
}