package com.sarawillert.learningjava;

public class ConsoleThatRemembersOutput implements Console {

    public String output = "";

    @Override
    public void printLine(String line) {
        output = line;
    }

    public String getOutput() {
        return output;
    }

}
