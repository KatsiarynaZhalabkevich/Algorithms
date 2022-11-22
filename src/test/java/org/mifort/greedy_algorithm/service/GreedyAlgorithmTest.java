package org.mifort.greedy_algorithm.service;

import org.junit.jupiter.api.Test;
import org.mifort.greedy_algorithm.model.SocialConnector;

import static org.junit.jupiter.api.Assertions.*;

class GreedyAlgorithmTest {

    @Test
    public void greedyAlgorithmTest() {
        GreedyAlgorithm ga = new GreedyAlgorithm(prepareNetwork());
        assertEquals(ga.findMostFollowersPath("root"), 5);
    }

    private SocialConnector prepareNetwork() {
        return new SocialConnector();
    }
}