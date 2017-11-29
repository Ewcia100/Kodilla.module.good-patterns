package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class ForumStatistics {

    private int userNo;
    private int postsNo;
    private int commentsNo;
    private double averagePostUser;
    private double averageCommUser;
    private double averageCommPost;

    public void calculateAdvStatistics(Statistics statistics) {
        userNo = statistics.usersNames().size();
        postsNo = statistics.postsCount();
        commentsNo = statistics.commentsCount();
        if (userNo >0) {
            averagePostUser = (double) postsNo / userNo;
        } else {
            averagePostUser = -1;
        }
        if (userNo > 0) {
            averageCommUser = (double) commentsNo / userNo;
        } else {
            averageCommUser = -1;
        }
        if (postsNo > 0) {
            averageCommPost = (double) commentsNo / postsNo;
        } else {
            averageCommPost = -1;
        }
    }

    public int getUserNo() {
        return userNo;
    }

    public int getPostsNo() {
        return postsNo;
    }

    public int getCommentsNo() {
        return commentsNo;
    }

    public double getAveragePostUser() {
        return averagePostUser;
    }

    public double getAverageCommUser() {
        return averageCommUser;
    }

    public double getAverageCommPost() {
        return averageCommPost;
    }
}
