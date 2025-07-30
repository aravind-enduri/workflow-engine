package com.workflow.workflow_engine.model;

import java.util.Objects;

public class WorkflowStep {
        private String id;
        private String name;
        private StepType type; // ENUM: MANUAL, AUTO, EXTERNAL
        private String nextStepId;

        public WorkflowStep(String id, String name, StepType type, String nextStepId) {
            this.id = id;
            this.name = name;
            this.type = type;
            this.nextStepId = nextStepId;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public StepType getType() {
            return type;
        }

        public void setType(StepType type) {
            this.type = type;
        }

        public String getNextStepId() {
            return nextStepId;
        }

        public void setNextStepId(String nextStepId) {
            this.nextStepId = nextStepId;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            WorkflowStep that = (WorkflowStep) o;
            return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(type, that.type) && Objects.equals(nextStepId, that.nextStepId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name, type, nextStepId);
        }

        @Override
        public String toString() {
            return "WorkflowStep{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", type=" + type +
                    ", nextStepId='" + nextStepId + '\'' +
                    '}';
        }
        // toString(), equals(), hashCode()
    }


