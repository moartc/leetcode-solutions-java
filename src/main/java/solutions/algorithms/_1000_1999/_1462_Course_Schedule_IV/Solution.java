package solutions.algorithms._1000_1999._1462_Course_Schedule_IV;

import java.util.*;

class Solution {

    /*
    I could create an array of sets where the index is the course id and the set contains all
    its prerequisites. I first visit the course from the query, then visit all its prerequisites and recursively their
    prerequisites.

    the version below beats 5%
    todo to improve
     */
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {

        Set<Integer>[] courseToPrerequisites = new HashSet[numCourses];
        for (int[] prerequisite : prerequisites) {
            if (prerequisite.length == 2) {
                int prereq = prerequisite[0];
                int course = prerequisite[1];

                if (courseToPrerequisites[course] == null) {
                    courseToPrerequisites[course] = new HashSet<>();
                }
                courseToPrerequisites[course].add(prereq);
            }
        }

        List<Boolean> answers = new ArrayList<>();

        for (int[] query : queries) {
            int prereq = query[0];
            int course = query[1];
            boolean singleAnswer = isXPrereqForCourse(prereq, course, courseToPrerequisites);
            answers.add(singleAnswer);
        }
        return answers;
    }

    boolean isXPrereqForCourse(int prereqId, int courseId, Set<Integer>[] courseToPrerequisites) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Set<Integer> visited = new HashSet<>();
        if (courseToPrerequisites[courseId] != null) {
            for (Integer i : courseToPrerequisites[courseId]) {
                queue.add(i);
                visited.add(i);
            }
        }

        while (!queue.isEmpty()) {
            Integer singleCourse = queue.poll();
            if (singleCourse == prereqId) {
                return true;
            }
            if (courseToPrerequisites[singleCourse] != null) {
                for (Integer anotherCourse : courseToPrerequisites[singleCourse]) {
                    if (visited.add(anotherCourse)) {
                        queue.add(anotherCourse);
                    }
                }
            }
        }
        return false;
    }
}