/*
 * Copyright 2019 Expedia, Inc. All rights reserved.
 * EXPEDIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.jestly.common.exception;

public enum ErrorType
{
    INTERNAL_TECHNICAL_ERROR("Internal Technical Error"),
    INTERNAL_BUSINESS_ERROR("Internal Business Error"),
    DOWNSTREAM_ERROR("Downstream  Error"),
    REQUEST_VALIDATION_ERROR("Request Validation Error"),
    AUTHORIZATION_ERROR("Authorization Error");

    private final String errorType;

    public String getErrorType()
    {
        return errorType;
    }

    ErrorType(String errorType)
    {
        this.errorType = errorType;
    }
}
