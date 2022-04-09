package solutions.algorithms._733_Flood_Fill;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        flood(image, sr, sc, (char) newColor, (char) image[sr][sc], visited);
        image[sr][sc] = newColor;
        return image;
    }

    void flood(int[][] image, int sr, int sc, char newColor, char startColor, boolean[][] visited) {
        if (!visited[sr][sc]) {
            visited[sr][sc] = true;
            if (sc > 0 && image[sr][sc - 1] == startColor) {
                image[sr][sc - 1] = newColor;
                flood(image, sr, sc - 1, newColor, startColor, visited);
            }
            if (sr > 0 && image[sr - 1][sc] == startColor) {
                image[sr - 1][sc] = newColor;
                flood(image, sr - 1, sc, newColor, startColor, visited);
            }
            if (sc < image[0].length - 1 && image[sr][sc + 1] == startColor) {
                image[sr][sc + 1] = newColor;
                flood(image, sr, sc + 1, newColor, startColor, visited);
            }
            if (sr < image.length - 1 && image[sr + 1][sc] == startColor) {
                image[sr + 1][sc] = newColor;
                flood(image, sr + 1, sc, newColor, startColor, visited);
            }
        }
    }
}