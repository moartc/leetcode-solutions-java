package solutions.algorithms._3000_3999._3513_Number_of_Unique_XOR_Triplets_I;

class Solution {

    /*
    xor:
    0 0 = 0
    0 1 = 1
    1 0 = 1
    1 1 = 0
    ---
    max value = n
    min:
     - for n == 1 & n == 2 -> 1
     - for n >=3           -> 0
     a ^ a ^ b = b
     --
     checking first 8 values
     for n=1, res=1
    for n=2, res=2
    for n=3, res=4
    for n=4, res=8
    for n=5, res=8
    for n=6, res=8
    for n=7, res=8
    for n=8, res=16
    so it looks like the answer is the smallest power of 2 grater than n
     */
    public int uniqueXorTriplets(int[] nums) {

//        for(int i = 1; i < 9; i++) {
//            Set<Integer> all = new HashSet<>();
//            for(int a = 1 ; a <= i; a++) {
//
//                for(int b = 1 ; b <= i; b++) {
//                    for(int c = 1 ; c <= i; c++) {
//                        int r = a ^b^c;
//                        all.add(r);
//                    }
//                }
//            }
//            System.out.println("for n=" + i + ", res=" + all.size());
//        }

        if (nums.length < 3) {
            return nums.length;
        } else {
            int pow = 1;
            int n = nums.length;
            while (pow <= n) {
                pow = pow << 1;
            }
            return pow;
        }
    }
}