package solutions.algorithms._2000_2999._2709_Greatest_Common_Divisor_Traversal;

import java.util.*;

class Solution {

    /*
    It actually looks like union find
    I could call union for all combinations 0X1, 0X2, ... 0Xn, 1X2, 1X3, 1Xn, ..., n-1Xn, where gcd > 1
    and then iterate again and check all indices the problem asks about

    update: TLE - I'm adding caching for gcd
    update: still TLE, I need something like Prime Factor (Hint 1) and union indices based on these factors
    
     */
    public boolean canTraverseAllPairs(int[] nums) {

        int[] parents = new int[nums.length];
        int[] ranks = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            parents[i] = i;
            ranks[i] = 0;
        }

        Map<Integer, Integer> factorToIndex = new HashMap<>();
        for (int numIdx = 0; numIdx < nums.length; numIdx++) {
            int num = nums[numIdx];
            List<Integer> factors = primeFactors(num);
            for (Integer factor : factors) {
                if(factorToIndex.containsKey(factor)) {
                    Integer prevIdx = factorToIndex.get(factor);
                    union(numIdx, prevIdx, parents, ranks);
                } else {
                    factorToIndex.put(factor, numIdx);
                }
            }
        }

        Set<Integer> differentParents = new HashSet<>();
        for (int parent : parents) {
            differentParents.add(find(parent, parents));
        }

        return differentParents.size() == 1;
    }

    int find(int v, int[] parents) {
        if (parents[v] != v) {
            parents[v] = find(parents[v], parents);
        }
        return parents[v];
    }

    void union(int f, int s, int[] parents, int[] ranks) {
        int pf = find(f, parents);
        int ps = find(s, parents);
        int rf = ranks[pf];
        int rs = ranks[ps];

        if (rf > rs) {
            parents[ps] = pf;
        } else if (rs > rf) {
            parents[pf] = ps;
        } else {
            parents[ps] = pf;
            ranks[pf]++;
        }
    }

    List<Integer> primeFactors(int n) {
        List<Integer> res = new ArrayList<>();
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > 1) {
            res.add(n);
        }
        return res;
    }

}