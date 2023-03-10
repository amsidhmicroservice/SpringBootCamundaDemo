package com.amisdh.camunda.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;

public class WeatherCheckDelegate implements JavaDelegate {
    public void execute(DelegateExecution delegateExecution) throws Exception {
        Random random = new Random();
        delegateExecution.setVariable("username", "Amsidh Lokhande");
        boolean flag = random.nextBoolean();
        System.out.println("weatherOk :" + flag);
        delegateExecution.setVariable("weatherOk", flag);
    }
}
