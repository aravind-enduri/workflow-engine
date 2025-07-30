package com.workflow.workflow_engine.core;

import com.workflow.workflow_engine.model.Workflow;
import com.workflow.workflow_engine.model.WorkflowStep;
import com.workflow.workflow_engine.model.StepType;

public class WorkflowEngine {
    public void execute(Workflow workflow) {
        System.out.println("Starting workflow: " + workflow.getName());

        for (WorkflowStep step : workflow.getSteps()) {
            switch (step.getType()) {
                case MANUAL -> System.out.println("Manual step: " + step.getName() + " - Requires human action.");
                case AUTOMATED -> System.out.println("Automated step: " + step.getName() + " - Executing...");
                case EXTERNAL -> System.out.println("External step: " + step.getName() + " - Call external service.");
                default -> System.out.println("Unknown step type.");
            }
        }

        System.out.println("Workflow execution complete.");
    }
}
