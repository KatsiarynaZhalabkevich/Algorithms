package org.mifort.greedy_algorithm.model;

import lombok.Getter;
import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class SocialUser {
    @Getter
    private String username;
    @Getter
    private List<SocialUser> followers;

    @Override
    public boolean equals(Object obj) {
        return ((SocialUser) obj).getUsername().equals(username);
    }

    public SocialUser(String username) {
        this.username = username;
        this.followers = new ArrayList<>();
    }

    public SocialUser(String username, List<SocialUser> followers) {
        this.username = username;
        this.followers = followers;
    }

    public void addFollowers(List<SocialUser> followers) {
        this.followers.addAll(followers);
    }

    public long getFollowersCount() {
        return this.followers.size();
    }
}
