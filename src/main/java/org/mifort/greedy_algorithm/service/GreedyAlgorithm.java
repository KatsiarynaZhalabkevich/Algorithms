package org.mifort.greedy_algorithm.service;

import org.mifort.greedy_algorithm.model.SocialConnector;
import org.mifort.greedy_algorithm.model.SocialUser;

import java.util.List;

public class GreedyAlgorithm {
    int currentLevel = 0;
    final int maxLevel = 3;
    SocialConnector sc;


    public GreedyAlgorithm(SocialConnector sc) {
        this.sc = sc;
    }

    public long findMostFollowersPath(String account) {
        long max = 0;
        SocialUser toFollow = null;

        List<SocialUser> followers = sc.getFollowers(account);
        for (SocialUser el : followers) {
            long followersCount = el.getFollowersCount();
            if (followersCount > max) {
                toFollow = el;
                max = followersCount;
            }
        }
        if (currentLevel < maxLevel - 1) {
            currentLevel++;
            max += findMostFollowersPath(toFollow.getUsername());
        }
        return max;
    }
}