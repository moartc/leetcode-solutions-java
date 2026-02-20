package solutions.algorithms._0_999._839_Similar_String_Groups;

class Solution {

    /*
    a brute force solution would use 2 loops and check if 2 words are "similar". That's quite expensive because a word can be up to 300
     chars long
    O(n^2 * m^2), n = number of words, m = avg word length
    Grouping is also a problem, but here I can use union-find
    to check whether 2 words are similar:
    instead of sorting and comparing indices, I can just iterate through both words and compare characters
    when I see 2 different for the first time I store them. If I encounter a second mismatch, the characters should match the previously
     stored pair but swapped.
    Example
    r a t s
    a r t s
    1st mismatch: r and a
    2nd mismatch: a and r
    all other chars must  be equal.

    so basically, I compare words as described above. I still iterate through the list in O(n^2) but since I'm using' union find,
    before comparing 2 words I can check whether they already have the same parent. If they do, I skip the comparison because they're
    already in the same group.

    complexity: O(n^2 * m * a(n)), where:
    n = number of strings
    m = length of each string
    a(n) = inverse ackermann (effectively constant)
     */
    public int numSimilarGroups(String[] strs) {

        int[] ranks = new int[strs.length];
        int[] parents = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            ranks[i] = 0;
            parents[i] = i;
        }

        for (int i = 0; i < strs.length; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                int firstParent = findParent(i, parents);
                int secondParent = findParent(j, parents);
                if (firstParent == secondParent) {
                    // they are already in the same group
                } else {
                    boolean areWordsSimilar = areSimilar(strs[i], strs[j]);
                    if (areWordsSimilar) {
                        union(i, j, ranks, parents);
                    }
                }
            }
        }


        int answer = 0;
        for (int i = 0; i < strs.length; i++) {
            if (parents[i] == i) {
                answer++;
            }
        }
        return answer;
    }

    boolean areSimilar(String w1, String w2) {
        char fc = '0';
        char sc = '0';
        int status = 0; // 0 - no mismatch, 1-mismatch, 2-swap done
        for (int i = 0; i < w1.length(); i++) {
            char c1 = w1.charAt(i);
            char c2 = w2.charAt(i);
            if (c1 != c2) {
                if (status == 0) {
                    fc = c1;
                    sc = c2;
                    status++;
                } else if (status == 1) {
                    if (c1 != sc || c2 != fc) {
                        return false;
                    }
                    status++;
                } else {
                    return false;
                }
            }
        }
        return status != 1;
    }

    int findParent(int i, int[] parents) {
        if (parents[i] != i) {
            parents[i] = findParent(parents[i], parents);
        }
        return parents[i];
    }

    void union(int f, int s, int[] ranks, int[] parents) {
        int parentF = findParent(f, parents);
        int parentS = findParent(s, parents);

        if (parentF == parentS) {
            return;
        }

        int rankF = ranks[parentF];
        int rankS = ranks[parentS];
        if (rankF > rankS) {
            parents[parentS] = parentF;
        } else if (rankS > rankF) {
            parents[parentF] = parentS;
        } else { // rankS == rankF
            parents[parentS] = parentF;
            ranks[parentF]++;
        }
    }
}