/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.activiti.action.model;

public enum Operation
{
    CLAIM("claim"), COMPLETE("complete");

    private String operation;

    private Operation(String operation)
    {
        this.operation = operation;
    }

    public String toString()
    {
        return this.operation;
    }
}
