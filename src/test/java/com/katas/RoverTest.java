package com.katas;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class RoverTest {

    @Test
    @Parameters({"0 0 N, L, 0 0 W, 5 5",
                 "0 0 W, L, 0 0 S, 5 5",
                 "0 0 S, L, 0 0 E, 5 5",
                 "0 0 E, L, 0 0 N, 5 5",
                 "0 0 N, R, 0 0 E, 5 5",
                 "0 0 E, R, 0 0 S, 5 5",
                 "0 0 S, R, 0 0 W, 5 5",
                 "0 0 W, R, 0 0 N, 5 5",
                 "0 0 N, M, 0 1 N, 5 5",
                 "0 0 E, M, 1 0 E, 5 5",
                 "0 1 S, M, 0 0 S, 5 5",
                 "1 0 W, M, 0 0 W, 5 5",
                 "0 0 S, M, 0 0 S, 5 5",
                 "0 0 W, M, 0 0 W, 5 5",

                 "5 5 E, M, 5 5 E, 5 5",
                 "5 5 N, M, 5 5 N, 5 5",

                 "1 2 N, LM, 0 2 W, 5 5",
                 "1 2 N, LMLMLMLMM, 1 3 N, 5 5",
                 "3 3 E, MMRMMRMRRM, 5 1 E, 5 5"})
    public void testBasicMove(final String position,
                              final String instruction,
                              final String expectedPosition,
                              final String plateauLimit) throws Exception {
        Position roverPosition = Position.valueOf(position, plateauLimit);
        Rover rover = new Rover(roverPosition);
        rover.execute(instruction);
        assertEquals(expectedPosition, rover.getPosition().toString());
    }

}
