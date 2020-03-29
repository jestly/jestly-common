package com.jestly.application.db.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = TableConstants.USER_INFORMATION_TABLE)
public class User
{
    @Id
    private String userId;
    private Name name;
    private String emailAddress;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PostInformation> postInformations = new ArrayList<>();

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

    public List<PostInformation> getPostInformations()
    {
        return postInformations;
    }

    public void setPostInformations(List<PostInformation> postInformations)
    {
        this.postInformations = postInformations;
    }
}
