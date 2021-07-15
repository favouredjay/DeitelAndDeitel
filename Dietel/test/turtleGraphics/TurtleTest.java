package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;


public class TurtleTest {
    Pen pen;
    Pen secondPen;
    Turtle ijapa;

    @BeforeEach
    void StartAllTestsWITHtHIS() {
        pen = new Pen();
        secondPen = new Pen();
        ijapa = new Turtle(pen);
    }


    @Test
    void turtleHasAPenTest() {
        assertNotNull(ijapa.getPen());
        assertEquals(pen, ijapa.getPen());
        assertNotEquals(secondPen, ijapa.getPen());

    }

    @Test
    void turtleCanMovePenUp() {
        //when
        ijapa.MovePenUp();

        assertTrue(ijapa.isPenUp());
    }

    @Test
    void turtleCanMovePenDown() {
        assertTrue(ijapa.isPenUp());
        //when
        ijapa.movePenDown();
        //assert
        assertFalse(ijapa.isPenUp());
    }

    @Test
    void turtleCanTurnRightWhileFacingEast() {
        //given
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        //assert
        assertSame(SOUTH, ijapa.getCurrentDirection());

    }

    @Test
    void turtleCanTurnRightWhileFacingSouth() {
        //given
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        //assert
        assertSame(WEST, ijapa.getCurrentDirection());

    }

    @Test
    void turtleCanTurnRightWhileFacingWest() {
        //given
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        //assert
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());

    }

    @Test
    void turtleCanTurnRightWhileFacingNorth() {
        //given
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        //assert
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());

        ijapa.turnRight();
        assertSame(EAST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanMoveForwardFacingEast() {
        //given
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.moveForwardBy(5);
        //assert
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardFacingSouth() {

        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.moveForwardBy(5);
        //assert
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());

//        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());

//        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.moveForwardBy(5);
        assertEquals(new Position(4, 4), ijapa.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardFacingWest() {
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.moveForwardBy(5);
        //assert
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());

//        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());

//        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.moveForwardBy(5);
        assertEquals(new Position(4, 4), ijapa.getCurrentPosition());

        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.moveForwardBy(5);
        assertEquals(new Position(4, 0), ijapa.getCurrentPosition());
    }

    @Test
    void turtleCanMoveForwardFacingNorth() {
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.moveForwardBy(5);
        //assert
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());

//        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());

//        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.moveForwardBy(5);
        assertEquals(new Position(4, 4), ijapa.getCurrentPosition());

        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.moveForwardBy(5);
        assertEquals(new Position(4, 0), ijapa.getCurrentPosition());

        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.moveForwardBy(5);
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());
    }

    @Test
    void turtleCanTurnLeftWhileFacingEast() {
        //given
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.turnleft();
        //assert
        assertSame(NORTH, ijapa.getCurrentDirection());

    }

    @Test
    void turtleCanTurnLeftWhileFacingNorth() {
        //given
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnleft();
        assertSame(NORTH, ijapa.getCurrentDirection());
        //when
        ijapa.turnleft();
        //assert
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeftWhileFacingWest() {
        //given
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnleft();
        assertSame(NORTH, ijapa.getCurrentDirection());
        //when
        ijapa.turnleft();
        //assert
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnleft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }
    @Test
    void turtleCanTurnLeftWhileFacingSouth() {
        //given
        assertSame(EAST, ijapa.getCurrentDirection());
        ijapa.turnleft();
        assertSame(NORTH, ijapa.getCurrentDirection());
        //when
        ijapa.turnleft();
        //assert
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.turnleft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnleft();
        assertSame(EAST, ijapa.getCurrentDirection());
    }

    @Test
    void turtleCanWriteWhileFacingEastTest(){
        ijapa.movePenDown();
        SketchPad sketchPad = new SketchPad(20,20);
        int numberOfSteps = 5;
        ijapa.writeOn(sketchPad, 5);
        int counter = 0;
        var floor = sketchPad.getFloor();
        while ( counter< numberOfSteps){
            assertEquals(1, sketchPad.getFloor()[0][counter]);
            counter++;
        }
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());
    }

    @Test
    void turtleCanWriteWhileFacingSouthTest(){

        ijapa.movePenDown();
        SketchPad sketchPad = new SketchPad(20,20);
        int numberOfSteps = 5;
        ijapa.writeOn(sketchPad, 5);
        int counter = 0;
        var floor = sketchPad.getFloor();
        while ( counter< numberOfSteps){
            assertEquals(1, sketchPad.getFloor()[0][counter]);
            counter++;
        }
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.movePenDown();
        ijapa.writeOn(sketchPad, 5);
        floor = sketchPad.getFloor();
        while ( counter< numberOfSteps){
            assertEquals(2, sketchPad.getFloor()[counter][4]);
            counter++;
        }
        assertEquals(new Position(4, 4), ijapa.getCurrentPosition());
    }
    @Test
    void  turtleCanWriteWhileFacingWestTest(){

        ijapa.movePenDown();
        SketchPad sketchPad = new SketchPad(20,20);
        int numberOfSteps = 5;
        ijapa.writeOn(sketchPad, 5);
        int counter = 0;
        var floor = sketchPad.getFloor();
        while ( counter< numberOfSteps){
            assertEquals(1, sketchPad.getFloor()[0][counter]);
            counter++;
        }
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.movePenDown();
       ijapa.writeOn(sketchPad, 5);
       floor = sketchPad.getFloor();
       while ( counter< numberOfSteps){
          assertEquals(2, sketchPad.getFloor()[counter][4]);
            counter++;
       }
        assertEquals(new Position(4, 4), ijapa.getCurrentPosition());
        ijapa.turnRight();
         numberOfSteps = 5;
        ijapa.writeOn(sketchPad, 5);
        counter = 0;
        floor = sketchPad.getFloor();
        while ( counter> numberOfSteps){
            assertEquals(3, sketchPad.getFloor()[4][counter]);
            counter++;
        }
        assertEquals(new Position(4, 0), ijapa.getCurrentPosition());
    }

    @Test
    void  turtleCanWriteWhileFacingNorthTest(){

        ijapa.movePenDown();
        SketchPad sketchPad = new SketchPad(20,20);
        int numberOfSteps = 5;
        ijapa.writeOn(sketchPad, 5);
        int counter = 0;
        var floor = sketchPad.getFloor();
        while ( counter< numberOfSteps){
            assertEquals(1, sketchPad.getFloor()[0][counter]);
            counter++;
        }
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        ijapa.movePenDown();
        ijapa.writeOn(sketchPad, 5);
        floor = sketchPad.getFloor();
        while ( counter< numberOfSteps){
            assertEquals(2, sketchPad.getFloor()[counter][4]);
            counter++;
        }
        assertEquals(new Position(4, 4), ijapa.getCurrentPosition());
        ijapa.turnRight();
        numberOfSteps = 5;
        ijapa.writeOn(sketchPad, 5);
        counter = 0;
        floor = sketchPad.getFloor();
        while ( counter> numberOfSteps){
            assertEquals(3, sketchPad.getFloor()[4][counter]);
            counter++;
        }
        assertEquals(new Position(4, 0), ijapa.getCurrentPosition());
        ijapa.turnRight();
        numberOfSteps = 5;
        ijapa.writeOn(sketchPad, 5);
        counter = 0;
        floor = sketchPad.getFloor();
        while ( counter> numberOfSteps){
            assertEquals(4, sketchPad.getFloor()[counter][0]);
            counter++;
        }
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());
    }
}
