package solutions.algorithms._3000_3999._3629_Minimum_Jumpsto__Reach_End_via_Prime_Teleportation;

import java.util.*;

class Solution {

    /*
    from a prime number I can jump to any other that has this value in its prime factors
     */

    public int minJumps(int[] nums) {
        int maxNum = (int) Math.pow(10, 6);
        boolean[] isPrime = new boolean[maxNum + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= maxNum; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxNum; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        Map<Integer, List<Integer>> primeFactorToIdx = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            List<Integer> primeFactors = primeFactors(num);
            for (Integer primeFactor : primeFactors) {
                List<Integer> indices = primeFactorToIdx.getOrDefault(primeFactor, new ArrayList<>());
                indices.add(i);
                primeFactorToIdx.put(primeFactor, indices);
            }
        }
        boolean[] visited = new boolean[nums.length];
        visited[0] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        int roundCtr = -1;
        while (!queue.isEmpty()) {
            roundCtr++;
            int elemsToFetch = queue.size();
            for (int i = 0; i < elemsToFetch; i++) {
                Integer currIdx = queue.poll();
                if (currIdx == nums.length - 1) {
                    return roundCtr;
                }
                if (currIdx != 0 && !visited[currIdx - 1]) {
                    visited[currIdx - 1] = true;
                    queue.add(currIdx - 1);
                }
                if (currIdx != nums.length - 1 && !visited[currIdx + 1]) {
                    visited[currIdx + 1] = true;
                    queue.add(currIdx + 1);
                }
                int currentNum = nums[currIdx];
                if (isPrime[currentNum]) {
                    List<Integer> indicesToJump = primeFactorToIdx.get(currentNum);
                    if (indicesToJump != null) {
                        for (Integer indexToJump : indicesToJump) {
                            if (!visited[indexToJump]) {
                                visited[indexToJump] = true;
                                queue.add(indexToJump);
                            }
                        }
                        primeFactorToIdx.remove(currentNum);
                    }
                }
            }
        }
        return -1;
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