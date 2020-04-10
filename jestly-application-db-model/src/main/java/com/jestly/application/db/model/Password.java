package com.jestly.application.db.model;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Password
{
    @NotBlank
    private String password;
    private String passwordResetToken;
    private Date passwordResetTokenExpiry;

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getPasswordResetToken()
    {
        return passwordResetToken;
    }

    public void setPasswordResetToken(String passwordResetToken)
    {
        this.passwordResetToken = passwordResetToken;
    }

    public Date getPasswordResetTokenExpiry()
    {
        return passwordResetTokenExpiry;
    }

    public void setPasswordResetTokenExpiry(Date passwordResetTokenExpiry)
    {
        this.passwordResetTokenExpiry = passwordResetTokenExpiry;
    }
}
