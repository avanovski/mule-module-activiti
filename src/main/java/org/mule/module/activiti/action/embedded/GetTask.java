/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.activiti.action.embedded;

import org.mule.api.MuleEvent;
import org.mule.api.MuleException;

public class GetTask extends AbstractEmbeddedActivitiAction
{
    private String taskIdExpression;

    public MuleEvent process(MuleEvent event) throws MuleException
    {
        // TODO Auto-generated method stub
        return null;
    }
    
    public String getTaskIdExpression()
    {
        return taskIdExpression;
    }

    public void setTaskIdExpression(String taskIdExpression)
    {
        this.taskIdExpression = taskIdExpression;
    }
}


