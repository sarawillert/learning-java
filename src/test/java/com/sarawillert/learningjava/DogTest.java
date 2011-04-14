package com.sarawillert.learningjava;

import com.sun.tools.javac.model.JavacElements;
import org.hamcrest.Matcher;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DogTest {

    @Test
    public void shouldHaveAName() {
        Dog coco = new Dog("Coco", null);
        assertThat(coco.getName(), is("Coco"));
    }

    @Test
    public void shouldBeAbleToHaveANameOtherThanCoco(){
        Dog benny = new Dog("Benny", null);
        assertThat(benny.getName(), is("Benny"));
    }

    @Test
    public void shouldHaveABreed(){
        Dog max = new Dog(null, "Australian Shepard");
        assertThat(max.getBreed(), is("Australian Shepard"));
    }




}
