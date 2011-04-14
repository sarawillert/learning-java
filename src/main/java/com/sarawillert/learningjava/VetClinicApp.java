package com.sarawillert.learningjava;

public class VetClinicApp {

    private Console console;

    public VetClinicApp(Console console) {
        this.console = console;
    }

    public static void main(String[] args) {
        VetClinicApp app = new VetClinicApp(new ConsoleThatPrintsToStandardOutput());

        app.run();

        Dog lucky = new Dog("Lucky", "sheep dog");
        System.out.println("Hi " + lucky.getName());
        System.out.println(lucky.getBreed());
    }

    public void run() {
        console.printLine("Welcome.");
    }
}
