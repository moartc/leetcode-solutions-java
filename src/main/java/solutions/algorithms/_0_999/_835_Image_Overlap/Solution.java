package solutions.algorithms._0_999._835_Image_Overlap;

class Solution {

    public int largestOverlap(int[][] img1, int[][] img2) {

        int maxFound = 0;
        int n = img1.length;


        for (int y2 = -(n - 1); y2 < img1.length; y2++) {
            for (int x2 = -(n - 1); x2 < img1[0].length; x2++) {
                maxFound = Math.max(scanSubarrays(img1, img2, y2, x2), maxFound);
            }
        }
        return maxFound;
    }

    int scanSubarrays(int[][] img1, int[][] img2, int startY2, int startX2) {

        int n = img1.length;
        int y1 = 0;
        int x1 = 0;
        int y2 = startY2;
        int x2 = startX2;

        // case for minus
        while (x2 < 0 || y2 < 0) {
            if (x2 < 0) {
                x2++;
                x1++;
            }
            if (y2 < 0) {
                y2++;
                y1++;
            }
        }

        int ctr = 0;
        while (y1 < n && x1 < n && y2 < n && x2 < n) {
            int v1 = img1[y1][x1];
            int v2 = img2[y2][x2];
            if (v1 == v2 && v1 == 1) {
                // both are 1 - increase ctr
                ctr++;
            }
            x1++;
            x2++;
            if (x1 == n || x2 == n) {
                // both go down
                y1++;
                y2++;
                x1 = 0;
                x2 = startX2;
            }
            while (x2 < 0) {
                x2++;
                x1++;
                if (y2 < 0) {
                    y2++;
                    y1++;
                }
            }
        }
        return ctr;
    }

}