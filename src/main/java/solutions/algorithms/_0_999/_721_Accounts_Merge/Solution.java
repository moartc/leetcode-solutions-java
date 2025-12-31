package solutions.algorithms._0_999._721_Accounts_Merge;

import java.util.*;

class Solution {
    /*
    First, I would go through the list of lists and store all accounts in a map <name, List of Set of emails>
    then, for each name, I start with the first set. For each email in this set, I try to find it in the remaining sets.
    If I do, I continue recursively visiting all emails from the matching set and trying to match them in another one.
    When I "go back" from a set where I found a match, I remove all its emails and move them to the starting set - I can pass its index
    as a parameter at the beginning.
    Then, in the main loop I continue iterating and when I find another non-empty set, it means there was no match before, so I start
    the same process. The result of this operation should be a pair -> name to list of emails.
    Once done with one name, I go to the next map entry (a different name) and repeat the process.

    this beats only 5%, next try - union-find
    todo refactor
     */
    public List<List<String>> accountsMerge(List<List<String>> accounts) {

        Map<String, List<Set<String>>> nameToAllEmails = new HashMap<>();
        for (List<String> account : accounts) {
            String name = account.get(0);
            if (!nameToAllEmails.containsKey(name)) {
                nameToAllEmails.put(name, new ArrayList<>());
            }
            Set<String> setOfEmail = new HashSet<>();
            for (int i = 1; i < account.size(); i++) {
                setOfEmail.add(account.get(i));
            }
            nameToAllEmails.get(name).add(setOfEmail);
        }
        List<List<String>> finalResult = new ArrayList<>();
        for (Map.Entry<String, List<Set<String>>> keyValue : nameToAllEmails.entrySet()) {
            String name = keyValue.getKey();
            List<Set<String>> listOfSets = keyValue.getValue();
            List<Set<String>> mergedSets = new ArrayList<>();
            // repeat for each set from the list
            boolean[] visited = new boolean[listOfSets.size()];
            for (int i = 0; i < listOfSets.size(); i++) {
                if (!listOfSets.get(i).isEmpty()) {
                    List<String> resultForName = new ArrayList<>();
                    resultForName.add(name);
                    Set<String> newResult = new HashSet<>();
                    visitAndMerge(listOfSets, i, visited, newResult);
                    mergedSets.add(newResult);
                    ArrayList<String> resultAsList = new ArrayList<>(newResult);
                    Collections.sort(resultAsList);
                    resultForName.addAll(resultAsList);
                    finalResult.add(resultForName);
                }
            }
        }
        return finalResult;
    }

    void visitAndMerge(List<Set<String>> listOfSets, int currentId, boolean[] visited, Set<String> result) {
        if (listOfSets.get(currentId).isEmpty()) {
            return;
        }
        visited[currentId] = true;
        Set<String> emailInTheCurrentSet = listOfSets.get(currentId);
        result.addAll(emailInTheCurrentSet);
        for (String e : emailInTheCurrentSet) {
            for (int i = 0; i < listOfSets.size(); i++) {
                if (!visited[i] && listOfSets.get(i).contains(e)) {
                    visitAndMerge(listOfSets, i, visited, result);
                }
            }
        }
        listOfSets.get(currentId).clear();
    }
}