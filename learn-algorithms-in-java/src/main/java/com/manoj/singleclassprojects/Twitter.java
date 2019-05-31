package com.manoj.singleclassprojects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Twitter {
	Map<Integer, List<Integer>> followersList;
	List<Posts> userPosts;

	/** Initialize your data structure here. */
	public Twitter() {
		followersList = new HashMap<Integer, List<Integer>>();
		userPosts = new ArrayList<Posts>();
	}

	/** Compose a new tweet. */
	public void postTweet(final int userId, final int tweetId) {
		Posts post = new Posts();
		post.tweetId = tweetId;
		post.userId = userId;
		System.out.println(post);
		userPosts.add(post);

	}

	/**
	 * Retrieve the 10 most recent tweet ids in the user's news feed. Each item
	 * in the news feed must be posted by users who the user followed or by the
	 * user herself. Tweets must be ordered from most recent to least recent.
	 */
	public List<Integer> getNewsFeed(final int userId) {
		List<Integer> list = new ArrayList<Integer>();
		System.out.println(userPosts.size());
		for (int i = userPosts.size() - 1; i >= 0; i--) {
			System.out.println("I cvalue is " + i);
			System.out.println(userPosts.get(i));
			if (list.size() == 10) {
				break;
			}
			if (userPosts.get(i).userId == userId || (followersList.containsKey(userId)
					&& followersList.get(userId).contains(userPosts.get(i).userId))) {
				list.add(userPosts.get(i).tweetId);
			}
		}
		return list;
	}

	/**
	 * Follower follows a followee. If the operation is invalid, it should be a
	 * no-op.
	 */
	public void follow(final int followerId, final int followeeId) {
		if (followersList.containsKey(followerId)) {
			followersList.get(followerId).add(followeeId);
		} else {
			List<Integer> followers = new ArrayList<Integer>();
			followers.add(followeeId);
			followersList.put(followerId, followers);
		}
	}

	/**
	 * Follower unfollows a followee. If the operation is invalid, it should be
	 * a no-op.
	 */
	public void unfollow(final int followerId, final int followeeId) {
		if (followersList.containsKey(followerId)) {
			followersList.get(followerId).remove((Object) followeeId);
		}
	}

	public static void main(final String[] args) {
		Twitter twitter = new Twitter();
		twitter.postTweet(1, 4);
		twitter.postTweet(2, 5);
		twitter.unfollow(1, 2);
		System.out.println(twitter.getNewsFeed(1));
	}
}

class Posts {
	Integer userId;
	Integer tweetId;

	@Override
	public String toString() {
		return userId + "\t" + tweetId;
	}
}

/**
 * Your Twitter object will be instantiated and called as such: Twitter obj =
 * new Twitter(); obj.postTweet(userId,tweetId); List<Integer> param_2 =
 * obj.getNewsFeed(userId); obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */