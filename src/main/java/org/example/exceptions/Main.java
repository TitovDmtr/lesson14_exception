package org.example.exceptions;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("John");
        worker.atWork();

        try {
            worker.work();
        } catch (WorkerIsNotReadyException e) {
            e.printStackTrace();
        }
    }
}