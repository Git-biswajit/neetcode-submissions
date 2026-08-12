class Twitter {

    class Tweet {
        int tweetId;
        int time;

        Tweet(int tweetId, int time) {
            this.tweetId = tweetId;
            this.time = time;
        }
    }

    Map<Integer, List<Tweet>> tweets;
    Map<Integer, Set<Integer>> following;
    int time;

    public Twitter() {
        tweets = new HashMap<>();
        following = new HashMap<>();
        time = 0;
    }

    public void postTweet(int userId, int tweetId) {
        tweets.putIfAbsent(userId, new ArrayList<>());
        tweets.get(userId).add(new Tweet(tweetId, time++));
    }

    public List<Integer> getNewsFeed(int userId) {

        List<Tweet> allTweets = new ArrayList<>();

        // Add user's own tweets
        if (tweets.containsKey(userId)) {
            allTweets.addAll(tweets.get(userId));
        }

        // Add followees' tweets
        if (following.containsKey(userId)) {

            for (int followee : following.get(userId)) {

                if (tweets.containsKey(followee)) {
                    allTweets.addAll(tweets.get(followee));
                }
            }
        }

        // Sort newest first
        allTweets.sort((a, b) -> b.time - a.time);

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < Math.min(10, allTweets.size()); i++) {
            ans.add(allTweets.get(i).tweetId);
        }

        return ans;
    }

    public void follow(int followerId, int followeeId) {

        // Prevent self-follow
        if (followerId == followeeId) {
            return;
        }

        following.putIfAbsent(followerId, new HashSet<>());
        following.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {

        if (following.containsKey(followerId)) {
            following.get(followerId).remove(followeeId);
        }
    }
}