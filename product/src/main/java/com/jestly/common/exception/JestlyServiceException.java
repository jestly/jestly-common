/*
 * Copyright 2019 Expedia, Inc. All rights reserved.
 * EXPEDIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.jestly.common.exception;

public class JestlyServiceException extends Exception
{
    private final ErrorCode errorCode;

    public JestlyServiceException(ErrorCode errorCode)
    {
        super(errorCode.getErrorMessage());
        this.errorCode = errorCode;
    }

    public JestlyServiceException(Throwable cause, ErrorCode errorCode)
    {
        super(errorCode.getErrorMessage(), cause);
        this.errorCode = errorCode;
    }

    public JestlyServiceException(String message, ErrorCode errorCode)
    {
        super(message);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode()
    {
        return errorCode;
    }
}
