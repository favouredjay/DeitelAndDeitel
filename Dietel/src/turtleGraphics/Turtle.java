package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {

    private final Pen pen;

    private Direction currentDirection;

    private Position currentPosition;


    public Turtle(Pen turtlePen) {
        pen = turtlePen;
        currentDirection = EAST;
        currentPosition = new Position(0, 0);
    }

    public Pen getPen() {
        return pen;

    }

    public void MovePenUp() {
        pen.setIsUp(true);
    }

    public boolean isPenUp() {
        return pen.isUp();
    }

    public void movePenDown() {
        pen.setIsUp(false);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection) {
            case EAST -> changeCurrentDirectionTo(SOUTH);
            case WEST -> changeCurrentDirectionTo(NORTH);
            case SOUTH -> changeCurrentDirectionTo(WEST);
            case NORTH -> changeCurrentDirectionTo(EAST);


        }
    }

    private void changeCurrentDirectionTo(Direction newDirection) {
        currentDirection = newDirection;
    }

    public void moveForwardBy(int numberOfSteps) {
        numberOfSteps = numberOfSteps-1;
        switch (currentDirection) {
            case EAST -> currentPosition.increaseColumnPositionBy(numberOfSteps);
            case SOUTH -> currentPosition.increaseRowPositionBy(numberOfSteps);
            case WEST-> currentPosition.decreaseColumnPositionBy(numberOfSteps);
            case NORTH -> currentPosition.decreaseRowPositionBy(numberOfSteps);

        }
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }


    public void turnleft() {
        if(currentDirection == EAST)
            currentDirection = NORTH;
          else  if (currentDirection == NORTH)
                currentDirection = WEST;
          else if (currentDirection == WEST)
              currentDirection = SOUTH;
          else if (currentDirection == SOUTH)
              currentDirection = EAST;


    }

    public void writeOn(SketchPad sketchPad, int numberOfSteps) {
        if(!isPenUp()){
            int counter = 0;
            switch (currentDirection){

                case EAST:
                    while(counter<numberOfSteps){
                        var floor = sketchPad.getFloor();
                        int rowPosition = currentPosition.getRowPosition();
                        int columnPosition = currentPosition.getColumnPosition();
//                        sketchPad.getFloor()[currentPosition.getRowPosition()][currentPosition.getColumPosition + counter] = 1;
                        floor[rowPosition][columnPosition+counter] = 1;
                        counter++;
                    }
                    break;
                case SOUTH:
                    while(counter<numberOfSteps) {
                        var floor = sketchPad.getFloor();
                        int rowPosition = currentPosition.getRowPosition();
                        int columnPosition = currentPosition.getColumnPosition();
//                        sketchPad.getFloor()[currentPosition.getRowPosition()][currentPosition.getRowPosition() + counter] = 1;
                        floor[rowPosition + counter][columnPosition] = 1;
                        counter++;
                    }
                    break;
                case WEST:
                    while(counter>numberOfSteps) {
                        var floor = sketchPad.getFloor();
                        int rowPosition = currentPosition.getRowPosition();
                        int columnPosition = currentPosition.getColumnPosition();
//                        sketchPad.getFloor()[currentPosition.getRowPosition()][currentPosition.getRowPosition() + counter] = 1;
                        floor[rowPosition][columnPosition - counter] = 1;
                        counter++;
                    }
                    break;
                case NORTH:
                    while(counter>numberOfSteps) {
                        var floor = sketchPad.getFloor();
                        int rowPosition = currentPosition.getRowPosition();
                        int columnPosition = currentPosition.getColumnPosition();
                        floor[rowPosition - counter][columnPosition] = 1;
                        counter++;
                    }
                    break;

            }
        }
        moveForwardBy(numberOfSteps);
    }
}