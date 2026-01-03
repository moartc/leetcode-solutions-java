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

    this beats only 5%, next try - union-find:

    Go through all inputs and create a map as above.
    then for each name and set in the map I use union-find.
    First, I add all the emails as nodes. For each set, I take the first email and call union with all the others.
    then I move to the next set, take its first email, and union all others with it.
    At the end, I can go through all the emails and group them by parents.

    beats 16.75%
     */
    public List<List<String>> accountsMerge(List<List<String>> accounts) {

        Map<String, List<List<String>>> nameToAllEmails = new HashMap<>();

        for (List<String> account : accounts) {
            String name = account.get(0);
            nameToAllEmails.computeIfAbsent(name, x -> new ArrayList<>()).add(account.subList(1, account.size()));
        }

        List<List<String>> answer = new ArrayList<>();

        for (Map.Entry<String, List<List<String>>> keyValue : nameToAllEmails.entrySet()) {
            List<List<String>> listOfListOfEmails = keyValue.getValue();
            Map<String, String> parent = new HashMap<>();
            Map<String, Integer> rank = new HashMap<>();
            for (List<String> listOfEmails : listOfListOfEmails) {
                for (String e : listOfEmails) {
                    parent.put(e, e);
                    rank.put(e, 0);
                }
            }

            for (List<String> listOfEmails : listOfListOfEmails) {
                String first = listOfEmails.get(0);
                for (int i = 1; i < listOfEmails.size(); i++) {
                    union(first, listOfEmails.get(i), parent, rank);
                }
            }
            // now I can collect them
            Map<String, Set<String>> parentEmailToAllOther = new HashMap<>();
            for (String e : parent.keySet()) {
                String p = findParent(e, parent);
                parentEmailToAllOther.computeIfAbsent(p, x -> new HashSet<>()).add(e);
            }

            String name = keyValue.getKey();
            for (Map.Entry<String, Set<String>> entry : parentEmailToAllOther.entrySet()) {
                List<String> singleListForName = new ArrayList<>(entry.getValue());
                Collections.sort(singleListForName);
                // add it after sorting
                singleListForName.add(0, name);
                answer.add(singleListForName);
            }
        }
        return answer;
    }

    private boolean union(String f, String s, Map<String, String> parent, Map<String, Integer> rank) {
        String parentF = findParent(f, parent);
        String parentS = findParent(s, parent);
        if (parentF.equals(parentS)) {
            return false;
        }
        int rankF = rank.get(parentF);
        int rankS = rank.get(parentS);
        if (rankF < rankS) {
            parent.put(parentF, parentS);
        } else if (rankS < rankF) {
            parent.put(parentS, parentF);
        } else {
            parent.put(parentS, parentF);
            rank.put(parentF, rank.get(parentF) + 1);
        }
        return true;
    }

    private String findParent(String email, Map<String, String> parent) {
        if (!parent.get(email).equals(email)) {
            parent.put(email, findParent(parent.get(email), parent));
        }
        return parent.get(email);
    }
}