package com.jestly.application.db.model;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Post
{
    private UUID postId = UUID.randomUUID();
    private long timeStamp = System.currentTimeMillis();
    private String title;
    @Valid
    private User author;
    @Valid
    private List<Attachment> attachments;
    private List<Like> likes;
    private List<Comment> comments;

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

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public User getAuthor()
    {
        return author;
    }

    public void setAuthor(User author)
    {
        this.author = author;
    }

    public List<Attachment> getAttachments()
    {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments)
    {
        this.attachments = attachments;
    }

    public List<Like> getLikes()
    {
        return likes;
    }

    public void setLikes(List<Like> likes)
    {
        this.likes = likes;
    }

    public List<Comment> getComments()
    {
        return comments;
    }

    public void setComments(List<Comment> comments)
    {
        this.comments = comments;
    }
}
