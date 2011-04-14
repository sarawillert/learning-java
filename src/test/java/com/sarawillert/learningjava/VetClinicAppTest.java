package com.sarawillert.learningjava;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class VetClinicAppTest {

    @Test
    public void shouldHaveAWelcomeMessage(){
        ConsoleThatRemembersOutput console = new ConsoleThatRemembersOutput();
        VetClinicApp app = new VetClinicApp(console);

        app.run();

        String output = console.getOutput();
        assertThat(output, is("Welcome.\nHi Lucky"));
    }
}
