package com.jestly.common.transformer;

import com.jestly.common.exception.JestlyServiceException;

/**
 *Transformer interface for transforming one type of object to another
 * @param <RS>      type of response
 * @param <RQ>      type of response
 */
public interface Transform<RS, RQ>
{
    RS transform(RQ request) throws JestlyServiceException;
}
