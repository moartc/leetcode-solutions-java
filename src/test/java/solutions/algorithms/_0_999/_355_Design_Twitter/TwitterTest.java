package solutions.algorithms._0_999._355_Design_Twitter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TwitterTest {

    @Test
    void test1() {

        Twitter twitter = new Twitter();
        // User 1 posts a new tweet (id = 5).
        twitter.postTweet(1, 5);
        // User 1's news feed should return a list with 1 tweet id -> [5]. return [5]
        List<Integer> v1 = twitter.getNewsFeed(1);
        // User 1 follows user 2.
        twitter.follow(1, 2);
        // User 2 posts a new tweet (id = 6).
        twitter.postTweet(2, 6);
        // User 1's news feed should return a list with 2 tweet ids -> [6, 5]. Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
        List<Integer> v2 = twitter.getNewsFeed(1);
        // User 1 unfollows user 2.
        twitter.unfollow(1, 2);
        // User 1's news feed should return a list with 1 tweet id -> [5], since user 1 is no longer following user 2.
        List<Integer> v3 = twitter.getNewsFeed(1);

        Assertions.assertThat(v1).containsExactly(5);
        Assertions.assertThat(v2).containsExactlyInAnyOrder(5, 6);
        Assertions.assertThat(v3).containsExactly(5);
    }

    @Test
    void test2() {

        Twitter twitter = new Twitter();
        twitter.postTweet(1, 4);
        twitter.postTweet(2, 5);
        twitter.unfollow(1, 2);
        List<Integer> v1 = twitter.getNewsFeed(1);

        Assertions.assertThat(v1).containsExactly(4);
    }

    @Test
    void test3() {

        Twitter twitter = new Twitter();
        twitter.postTweet(1, 1);
        List<Integer> v1 = twitter.getNewsFeed(1);
        twitter.follow(2, 1);
        List<Integer> v2 = twitter.getNewsFeed(2);
        twitter.unfollow(2, 1);
        List<Integer> v3 = twitter.getNewsFeed(2);

        Assertions.assertThat(v1).containsExactly(1);
    }
}