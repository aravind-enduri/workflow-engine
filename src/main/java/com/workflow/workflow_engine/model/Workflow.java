package com.workflow.workflow_engine.model;
import java.util.List;
public class Workflow {


    private String id;
    private String name;
    private List<WorkflowStep> steps;

    public Workflow(String id, String name, List<WorkflowStep> steps) {
        this.id = id;
        this.name = name;
        this.steps = steps;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<WorkflowStep> getSteps() {
        return steps;
    }

    @Override
    public String toString() {
        return "Workflow{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", steps=" + steps +
                '}';
    }
}
