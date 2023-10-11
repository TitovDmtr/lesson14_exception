package org.example.exceptions;

public class Worker {
    String name;
    boolean isAtWork;
    boolean isProfessional;

    void atWork() {
        isAtWork = true;
    }

    void prof() {
        isProfessional = true;
    }

    public Worker(String name) {
        this.name = name;
    }

    public void work() throws WorkerIsNotReadyException {
        if (isAtWork && isProfessional) {
            System.out.println("Worker " + name + " can work");
        } else {
            throw new WorkerIsNotReadyException("Worker " + name + " is not ready");
        }
    }

}