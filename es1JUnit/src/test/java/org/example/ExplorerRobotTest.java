package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExplorerRobotTest {

    private ExplorerRobot robo;
    private double TOLERANCE = 0.0000001;


    @BeforeEach
    public void setUp(){
        robo = new ExplorerRobot("robozinho", 2, 5, 0, 14);
    }

    @Test
    void setName() {

        assertEquals("robozinho", robo.getName());
        assertDoesNotThrow(()->robo.setName("roboo"));
        assertEquals("roboo", robo.getName());

        assertThrows(IllegalArgumentException.class, ()-> robo.setName(""));

    }

    @Test
    void setX() {
        assertEquals(2, robo.getX(), TOLERANCE);
        robo.setX(10);
        assertEquals(10, robo.getX(), TOLERANCE);
    }

    @Test
    void setY() {
        assertEquals(5, robo.getY(), TOLERANCE);
        robo.setY(10.4);
        assertEquals(10.4, robo.getY(), TOLERANCE);
    }

    @Test
    void setDirection() {
    }

    @Test
    void setBattery() {
    }

    @Test
    void useBattery() {
    }

    @Test
    void getName() {
    }

    @Test
    void getX() {
    }

    @Test
    void getY() {
    }

    @Test
    void getDirection() {
    }

    @Test
    void getBattery() {
    }

    @Test
    void getPosition() {
    }

    @Test
    void rotate() {
    }

    @Test
    void rotateLeft() {
    }

    @Test
    void rotateRight() {
    }

    @Test
    void move() {
    }
}