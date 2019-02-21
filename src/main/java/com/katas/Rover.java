package com.katas;


public class Rover {

    private Position position;

    public Rover(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void execute(String instructions) {
        for (Character instruction : instructions.toCharArray()) {
            if (instruction.equals('L')) {
                position.moveLeft();
            }
            if (instruction.equals('R')) {
                position.moveRight();
            }
            if (instruction.equals('M')) {
                position.moveAhead();
            }
        }
    }

}
