package com.jestly.application.db.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = TableConstants.POST_INFORMATION_TABLE)
public class PostInformation
{
    @Id
    @GeneratedValue
    private UUID postId;
    @Column(nullable = false)
    private long timeStamp;
    private String post;
    @Column(nullable = false)
    private String resourceLocation; //needs to be updated
    private boolean isPrivate;
    private int likes;
    private int superLikes;
    @ManyToOne
    @JoinColumn(nullable = false)
    private User user;

    public UUID getPostId()
    {
        return postId;
    }

    public void setPostId(UUID postId)
    {
        this.postId = postId;
    }

    public long getTimeStamp()
    {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp)
    {
        this.timeStamp = timeStamp;
    }

    public String getPost()
    {
        return post;
    }

    public void setPost(String post)
    {
        this.post = post;
    }

    public String getResourceLocation()
    {
        return resourceLocation;
    }

    public void setResourceLocation(String resourceLocation)
    {
        this.resourceLocation = resourceLocation;
    }

    public boolean isPrivate()
    {
        return isPrivate;
    }

    public void setPrivate(boolean aPrivate)
    {
        isPrivate = aPrivate;
    }

    public int getLikes()
    {
        return likes;
    }

    public void setLikes(int likes)
    {
        this.likes = likes;
    }

    public int getSuperLikes()
    {
        return superLikes;
    }

    public void setSuperLikes(int superLikes)
    {
        this.superLikes = superLikes;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }
}
