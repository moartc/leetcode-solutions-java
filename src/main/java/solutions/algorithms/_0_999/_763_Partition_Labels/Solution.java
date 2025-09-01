package solutions.algorithms._0_999._763_Partition_Labels;

import java.util.*;

class Solution {

    /*
    notes:
    I could iterate through the input string once and build a frequency map
    Then iterate again through the string, and for each character I see, decrease its count in the map.
    When the count reaches zero, it means there are no more occurrences of that character in the string.
    I also need to track the used characters (in a set).
    ----------
    update:
    it worked with beats 5.76% - I can replace map with an array of 26 chars
    this didn't really improve the performance, it beats ~10%

    ----------
    update:
    I found a hint that I could track the "last seen index".
    So instead of using a frequency map, I can track the last seen index
    Then, while iterating from index 0 to the last seen index of the character,
    I update the farthest index I need to reach by checking the "last seen index" of all characters along the way

    ----------
    and it beats 97.6%
     */
    public List<Integer> partitionLabels(String s) {
        char[] charArray = s.toCharArray();
        int[] lastSeen = new int[26];
        Arrays.fill(lastSeen, -1);

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            lastSeen[c - 97] = i;
        }
        List<Integer> answer = new ArrayList<>();

        int indexToGo = -1;
        int groupCounter = 0;
        for (int i = 0; i < charArray.length; i++) {
            groupCounter++;
            char c = charArray[i];
            if (i == 0) {
                indexToGo = lastSeen[c - 97];
            }
            // update index to go
            int anotherLastSeen = lastSeen[c - 97];
            if (anotherLastSeen > indexToGo) {
                indexToGo = anotherLastSeen;
            }
            if (indexToGo == i) {
                // I can make a group here
                answer.add(groupCounter);
                groupCounter = 0;
            }
        }
        return answer;
    }


    public List<Integer> partitionLabels_v1(String s) {

        char[] charArray = s.toCharArray();
        int[] frequencyMap = new int[26];
        for (char c : charArray) {
            frequencyMap[c - 97]++;
        }

        Set<Character> alreadyUsed = new HashSet<>();
        List<Integer> answer = new ArrayList<>();
        int currentCounter = 0;
        for (char c : charArray) {
            if (alreadyUsed.isEmpty()) {
                // nothing yet so just add it
                alreadyUsed.add(c);
                currentCounter++;
                frequencyMap[c - 97]--;
            } else {
                // I can check if I can split before adding the current character
                boolean canSplit = true;
                for (Character character : alreadyUsed) {
                    if (frequencyMap[character - 97] > 0) {
                        canSplit = false;
                        break;
                    }
                }
                if (canSplit) {
                    // I can split here
                    answer.add(currentCounter);
                    currentCounter = 0;
                    alreadyUsed.clear();
                    //
                }
                // I cannot split here
                currentCounter++;
                alreadyUsed.add(c);
                frequencyMap[c - 97]--;
            }
        }
        answer.add(currentCounter);
        return answer;
    }
}