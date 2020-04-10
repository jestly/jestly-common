package com.jestly.application.db.model;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Attachment
{
    @NotBlank
    private UUID uniqueId;
    @NotBlank
    private String attachmentId;
    @NotNull
    private AttachmentType type;

    public UUID getUniqueId()
    {
        return uniqueId;
    }

    public void setUniqueId(UUID uniqueId)
    {
        this.uniqueId = uniqueId;
    }

    public String getAttachmentId()
    {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId)
    {
        this.attachmentId = attachmentId;
    }

    public AttachmentType getType()
    {
        return type;
    }

    public void setType(AttachmentType type)
    {
        this.type = type;
    }
}
