package solutions.algorithms._0_999._997_Find_the_Town_Judge;

class Solution {

    /*
    I can iterate over the trust array and for each node count incoming and outgoing edges
     */
    public int findJudge(int n, int[][] trust) {

        int[] incoming = new int[n + 1];
        int[] outgoing = new int[n + 1];

        for (int[] t : trust) {
            int f = t[0];
            int s = t[1];
            outgoing[f]++;
            incoming[s]++;
        }

        // now I have to find all nodes where the number of incoming edges is equal to n-1
        // and all, where the number of outgoing is equal to 0
        // if there is only one such a node then it is my answer
        int answer = -1;
        boolean alreadyFound = false;

        for (int i = 1; i < outgoing.length; i++) {
            if (outgoing[i] == 0 && incoming[i] == n - 1) {
                if (alreadyFound) {
                    return -1;
                }
                answer = i;
                alreadyFound = true;
            }
        }
        return answer;
    }
}