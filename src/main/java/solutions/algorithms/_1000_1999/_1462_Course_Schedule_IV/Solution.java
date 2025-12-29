package solutions.algorithms._1000_1999._1462_Course_Schedule_IV;

import java.util.ArrayList;
import java.util.List;

class Solution {

    /*
    I could create an array of sets where the index is the course id and the set contains all
    its prerequisites. I first visit the course from the query, then visit all its prerequisites and recursively their
    prerequisites.

    the version below beats 5%
    New idea: fill the courseToPrerequisites map with all prerequisites for each course
    I can store it actually in 2d array -> beats 89/2%
     */
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {

        boolean[][] courseToPrereq = new boolean[numCourses][numCourses];
        for (int[] prerequisite : prerequisites) {
            if (prerequisite.length == 2) {
                int prereq = prerequisite[0];
                int course = prerequisite[1];
                courseToPrereq[course][prereq] = true;
            }
        }

        // for each course find all prerequisites
        for (int i = 0; i < numCourses; i++) {
            for (int j = 0; j < numCourses; j++) {
                if (courseToPrereq[i][j]) {
                    for (int k = 0; k < numCourses; k++) {
                        if (courseToPrereq[k][i]) {
                            // if j is prerequisite for i and i is for k, then j is for k
                            courseToPrereq[k][j] = true;
                        }
                    }
                }
            }
        }

        List<Boolean> answers = new ArrayList<>();
        for (int[] query : queries) {
            int prereq = query[0];
            int course = query[1];
            boolean singleAnswer = courseToPrereq[course][prereq];
            answers.add(singleAnswer);
        }
        return answers;
    }
}