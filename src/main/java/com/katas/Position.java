package com.katas;


public class Position {

    private int x;
    private int y;
    private int upperX;
    private int upperY;
    private Character orientation;

    private Position(int x, int y, Character orientation, int upperX, int upperY) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        this.upperX = upperX;
        this.upperY = upperY;
    }

    public void moveRight() {
        if (orientation.equals('N')) {
            orientation = 'E';
        } else if (orientation.equals('E')) {
            orientation = 'S';
        } else if (orientation.equals('S')) {
            orientation = 'W';
        } else if (orientation.equals('W')) {
            orientation = 'N';
        }
    }

    public void moveLeft() {
        if (orientation.equals('N')) {
            orientation = 'W';
        } else if (orientation.equals('W')) {
            orientation = 'S';
        } else if (orientation.equals('S')) {
            orientation = 'E';
        } else if (orientation.equals('E')) {
            orientation = 'N';
        }
    }

    public void moveAhead() {
        if (orientation.equals('W') && x != 0) {
            x = x - 1;
        } else if (orientation.equals('N') && y != upperY) {
            y = y + 1;
        } else if (orientation.equals('E') && x != upperX) {
            x = x + 1;
        } else if (orientation.equals('S') && y != 0) {
            y = y - 1;
        }
    }

    public static Position valueOf(String position, String upperRightCoordinates) {
        return new Position(Integer.parseInt(position.substring(0, 1)),
                Integer.parseInt(position.substring(2, 3)),
                position.charAt(4),
                Integer.parseInt(upperRightCoordinates.substring(0, 1)),
                Integer.parseInt(upperRightCoordinates.substring(2, 3))
        );
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(x).append(" ")
                .append(y).append(" ")
                .append(orientation)
                .toString();
    }
}
