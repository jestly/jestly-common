package com.jestly.application.db.model;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User
{
    private long timestamp = System.currentTimeMillis();
    @NotBlank
    private String userId;
    @Valid
    private Name name;
    @NotBlank
    private String emailAddress;
    private Password password;
    private Attachment image;
    private Attachment coverImage;
    private boolean isOnline;
    private List<Post> posts;
    private List<Follow> followers;
    private List<Follow> following;
    private List<Message> messages;
    private List<Notification> notifications;

    public long getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(long timestamp)
    {
        this.timestamp = timestamp;
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public Name getName()
    {
        return name;
    }

    public void setName(Name name)
    {
        this.name = name;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public Password getPassword()
    {
        return password;
    }

    public void setPassword(Password password)
    {
        this.password = password;
    }

    public Attachment getImage()
    {
        return image;
    }

    public void setImage(Attachment image)
    {
        this.image = image;
    }

    public Attachment getCoverImage()
    {
        return coverImage;
    }

    public void setCoverImage(Attachment coverImage)
    {
        this.coverImage = coverImage;
    }

    public boolean isOnline()
    {
        return isOnline;
    }

    public void setOnline(boolean online)
    {
        isOnline = online;
    }

    public List<Post> getPosts()
    {
        return posts;
    }

    public void setPosts(List<Post> posts)
    {
        this.posts = posts;
    }

    public List<Follow> getFollowers()
    {
        return followers;
    }

    public void setFollowers(List<Follow> followers)
    {
        this.followers = followers;
    }

    public List<Follow> getFollowing()
    {
        return following;
    }

    public void setFollowing(List<Follow> following)
    {
        this.following = following;
    }

    public List<Message> getMessages()
    {
        return messages;
    }

    public void setMessages(List<Message> messages)
    {
        this.messages = messages;
    }

    public List<Notification> getNotifications()
    {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications)
    {
        this.notifications = notifications;
    }
}
