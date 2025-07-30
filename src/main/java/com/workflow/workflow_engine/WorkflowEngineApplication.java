package com.workflow.workflow_engine;

import com.workflow.workflow_engine.model.StepType;
import com.workflow.workflow_engine.model.WorkflowStep;
import com.workflow.workflow_engine.core.WorkflowEngine;
import  com.workflow.workflow_engine.model.Workflow;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


public class WorkflowEngineApplication {

	public static void main(String[] args) {
		//Create workflow steps

		WorkflowStep step1 = new WorkflowStep("1", "Validate Resquest", StepType.AUTOMATED, "2");
		// Step 2: Manual step
		WorkflowStep step2 = new WorkflowStep("2", "Manager Approval", StepType.MANUAL, "3");

// Step 3: External step
		WorkflowStep step3 = new WorkflowStep("3", "Notify External System", StepType.EXTERNAL, null);


		//create the workflow
		Workflow workflow = new Workflow("WF001","Onboarding Workflow", Arrays.asList(step1, step2, step3));
		//Execute workflow
		WorkflowEngine engine = new WorkflowEngine();
		engine.execute(workflow);
	}

}
