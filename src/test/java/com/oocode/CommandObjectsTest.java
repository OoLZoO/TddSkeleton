package com.oocode;

import org.junit.Test;

import static org.junit.Assert.assertThat;

public class CommandObjectsTest {

    @Test
    public void canCreateCommandObject() {
        Command MoveOnto = new Command("move 1 onto 2");

        //assertThat(MoveOnto, is(new MoveOnto(1, 2)));

    }
}
