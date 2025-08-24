package solutions.algorithms._0_999._355_Design_Twitter;

import java.util.*;

class Twitter {

    /*
    Looks like I need to keep the feed list per single user
    or
    single list of all tweets and then create a feed when needed
    I will start with the 2nd approach
    ---
    Performance is terrible - it beats 5.05%
    additionally I have a follower map <Integer, Set<Integer>>

    ---

    I am trying list of tweets per user - will do it in the map
    there is a problem how to create a feed list, since I don't have any timestamp - but I will add my own
    actually much better, ~50-60%%

     */

    Map<Integer, List<Tweet>> userToTweets = new HashMap<>();
    Map<Integer, Set<Integer>> followingMap = new HashMap<>();
    private int globalTimestamp = 0;

    public Twitter() {
    }

    public void postTweet(int userId, int tweetId) {
        List<Tweet> currentList = userToTweets.getOrDefault(userId, new ArrayList<>());
        userToTweets.put(userId, currentList);
        currentList.add(new Tweet(globalTimestamp, tweetId));
        globalTimestamp++;
    }

    public List<Integer> getNewsFeed(int userId) {

        PriorityQueue<Tweet> allTweetsToConsider = new PriorityQueue<>(10, Comparator.comparingInt(
                value -> -value.timestamp
        ));
        Set<Integer> followedUsers = followingMap.getOrDefault(userId, Set.of());

        for (Integer followedUser : followedUsers) {
            List<Tweet> userTweets = userToTweets.getOrDefault(followedUser, List.of());
            int ctr = 0;
            for (int i = userTweets.size() - 1; i >= 0; i--) {
                Tweet tweet = userTweets.get(i);
                allTweetsToConsider.add(tweet);
                ctr++;
                if (ctr == 10) {
                    break;
                }
            }
        }
        // also add own tweets
        List<Tweet> ownTweets = userToTweets.getOrDefault(userId, List.of());
        int ctr = 0;
        for (int i = ownTweets.size() - 1; i >= 0; i--) {
            Tweet tweet = ownTweets.get(i);
            allTweetsToConsider.add(tweet);
            ctr++;
            if (ctr == 10) {
                break;
            }
        }

        List<Integer> feed = new ArrayList<>();
        while (!allTweetsToConsider.isEmpty() && feed.size() < 10) {
            feed.add(allTweetsToConsider.poll().tweetId);
        }
        return feed;
    }

    public void follow(int followerId, int followeeId) {
        Set<Integer> currentSet = followingMap.get(followerId);
        if (currentSet != null) {
            currentSet.add(followeeId);
            followingMap.put(followerId, currentSet);
        } else {
            Set<Integer> newSet = new HashSet<>();
            newSet.add(followeeId);
            followingMap.put(followerId, newSet);
        }
    }

    public void unfollow(int followerId, int followeeId) {
        Set<Integer> currentSet = followingMap.get(followerId);
        if (currentSet != null) {
            currentSet.remove(followeeId);
            followingMap.put(followerId, currentSet);
        } else {
            // nothing to do
        }
    }

    private class Tweet {
        // the lower, the older
        int timestamp;
        int tweetId;

        public Tweet(int timestamp, int tweetId) {
            this.timestamp = timestamp;
            this.tweetId = tweetId;
        }
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */