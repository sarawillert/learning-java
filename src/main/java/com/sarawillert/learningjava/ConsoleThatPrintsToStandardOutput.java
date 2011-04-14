package com.sarawillert.learningjava;

public class ConsoleThatPrintsToStandardOutput implements Console{
    @Override
    public void printLine(String line) {
        System.out.println(line);
    }
}
