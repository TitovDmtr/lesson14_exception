package org.example.exceptions;

public class WorkerIsNotReadyException extends Exception {
    public WorkerIsNotReadyException(String message) {
        super(message);
    }
}