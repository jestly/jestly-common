/*
 * Copyright 2019 Expedia, Inc. All rights reserved.
 * EXPEDIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.jestly.common.exception;

public class ErrorCode
{
    private static final int baseCode = 10000;

    private final int code;
    private final String message;
    private final ErrorType errorType;
    private final boolean retryable;
    private final int httpStatusCode;

    public int getCode()
    {
        return code;
    }

    public String getErrorMessage()
    {
        return message;
    }

    public ErrorType getErrorType()
    {
        return errorType;
    }

    public boolean isRetryable()
    {
        return retryable;
    }

    public int getHttpStatusCode()
    {
        return httpStatusCode;
    }


    public ErrorCode(int code, String message, ErrorType errorType, boolean retryable, int httpStatusCode)
    {
        this.code = code;
        this.message = message;
        this.errorType = errorType;
        this.retryable = retryable;
        this.httpStatusCode = httpStatusCode;
    }

    @Override
    public String toString()
    {
        return new StringBuilder()
                .append(" ErrorCode=").append(code)
                .append(", Type=").append(errorType.getErrorType())
                .append(", Message=").append(message)
                .append(", Retryable=").append(retryable).toString();
    }
}
