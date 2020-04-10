package com.jestly.application.db.model;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Follow
{
    private long timestamp = System.currentTimeMillis();
    @Valid
    private User user;
    @Valid
    private User follower;

    public long getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(long timestamp)
    {
        this.timestamp = timestamp;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public User getFollower()
    {
        return follower;
    }

    public void setFollower(User follower)
    {
        this.follower = follower;
    }
}
