package com.oocode;

import org.junit.Test;

import java.awt.*;

public class MoveRobotTest {
    @Test
    public void instructRobotToMove() {
        Robot robot = new RobotImplementation();
        robot.moveOnto(1, 2);
       // assertThat("1 2", robot.toString());
    }

}
