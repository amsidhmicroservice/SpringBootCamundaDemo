package com.amisdh.camunda.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class LoggerDelegate implements JavaDelegate {
    private final Logger LOGGER = Logger.getLogger(LoggerDelegate.class.getName());

    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("\n\n .... LoggerDelegate invoked by "
                + "processDefinitionId=" + delegateExecution.getProcessDefinitionId()
                + ", activityId=" + delegateExecution.getCurrentActivityId()
                + ", processInstanceId=" + delegateExecution.getProcessInstanceId()
                + ", processBusinessKey=" + delegateExecution.getProcessBusinessKey()
                + ", executionId=" + delegateExecution.getId()
                + "\n\n");
    }
}
