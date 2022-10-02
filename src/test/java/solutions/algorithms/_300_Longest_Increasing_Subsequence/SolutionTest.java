package solutions.algorithms._300_Longest_Increasing_Subsequence;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void lengthOfLISTest1() {

        int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        int actual = solution.lengthOfLIS(nums);
        Assertions.assertThat(actual).isEqualTo(4);
    }

    @Test
    void lengthOfLISTest2() {

        int[] nums = new int[]{0, 1, 0, 3, 2, 3};
        int actual = solution.lengthOfLIS(nums);
        Assertions.assertThat(actual).isEqualTo(4);
    }

    @Test
    void lengthOfLISTest3() {

        int[] nums = new int[]{7, 7, 7, 7, 7, 7, 7};
        int actual = solution.lengthOfLIS(nums);
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    void lengthOfLISTest4() {

        int[] nums = new int[]{1};
        int actual = solution.lengthOfLIS(nums);
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    void lengthOfLISTest5() {

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277};
        int actual = solution.lengthOfLIS(nums);
        Assertions.assertThat(actual).isEqualTo(277);
    }

    @Test
    void lengthOfLISTest6() {

        int[] nums = new int[]{3, 5, 6, 2, 5, 4, 19, 5, 6, 7, 12};
        int actual = solution.lengthOfLIS(nums);
        Assertions.assertThat(actual).isEqualTo(6);
    }

    @Test
    void lengthOfLISTest7() {

        int[] nums = new int[]{0, 3, 6, 9, 1, 2, 3, 4, 5};
        int actual = solution.lengthOfLIS(nums);
        Assertions.assertThat(actual).isEqualTo(6);
    }

    @Test
    void lengthOfLISTest8() {

        int[] nums = new int[]{-813, 82, -728, -82, -432, 887, -551, 324, -315, 306, -164, -499, -873, -613, 932, 177, 61, 52, 1000, -710, 372, -306, -584, -332, -500, 407, 399, -648, 290, -866, 222, 562, 993, -338, -590, 303, -16, -134, 226, -648, 909, 582, 177, 899, -343, 55, 629, 248, 333, 1, -921, 143, 629, 981, -435, 681, 844, 349, 613, 457, 797, 695, 485, 15, 710, -450, -775, 961, -445, -905, 466, 942, 995, -289, -397, 434, -14, 34, -903, 314, 862, -441, 507, -966, 525, 624, -706, 39, 152, 536, 874, -364, 747, -35, 446, -608, -554, -411, 987, -354, -700, -34, 395, -977, 544, -330, 596, 335, -612, 28, 586, 228, -664, -841, -999, -100, -620, 718, 489, 346, 450, 772, 941, 952, -560, 58, 999, -879, 396, -101, 897, -1000, -566, -296, -555, 938, 941, 475, -260, -52, 193, 379, 866, 226, -611, -177, 507, 910, -594, -856, 156, 71, -946, -660, -716, -295, -927, 148, 620, 201, 706, 570, -659, 174, 637, -293, 736, -735, 377, -687, -962, 768, 430, 576, 160, 577, -329, 175, 51, 699, -113, 950, -364, 383, 5, 748, -250, -644, -576, -227, 603, 832, -483, -237, 235, 893, -336, 452, -526, 372, -418, 356, 325, -180, 134, -698};
        int actual = solution.lengthOfLIS(nums);
        Assertions.assertThat(actual).isEqualTo(25);
    }

    @Test
    void lengthOfLISTest9() {

        int[] nums = new int[]{0, 1, 2};
        int actual = solution.lengthOfLIS(nums);
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void lengthOfLISTest10() {

        int[] nums = new int[]{10, 9, 2, 5, 3, 7, 200, 18, 101, 102, 103};
        int actual = solution.lengthOfLIS(nums);
        Assertions.assertThat(actual).isEqualTo(7);
    }
}
