package com.helloowen.angular.material.test.steps;


public class StepException extends RuntimeException {
    public StepException(String msg) {
        super(msg);
    }

    public StepException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
