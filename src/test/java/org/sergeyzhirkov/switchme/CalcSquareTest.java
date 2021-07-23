package org.sergeyzhirkov.switchme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.sergeyzhirkov.switchme.Point;
import org.sergeyzhirkov.switchme.Utils;

public class CalcSquareTest {
    @Test
    public void testCalc1() {
        Point pointOne = new Point(1, 1);
        Point pointTwo = new Point(3, 4);
        int result = Utils.calcSquare(pointOne, pointTwo);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testCalc2() {
        Point pointOne = new Point(-5, -5);
        Point pointTwo = new Point(-1, -9);
        int result = Utils.calcSquare(pointOne, pointTwo);
        Assertions.assertEquals(16, result);
    }

    @Test
    public void testCalc3() {
        Point pointOne = new Point(-1, 2);
        Point pointTwo = new Point(1, -3);
        int result = Utils.calcSquare(pointOne, pointTwo);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void testCalc4() {
        Point pointOne = new Point(1, 200);
        Point pointTwo = new Point(1, -300);
        int result = Utils.calcSquare(pointOne, pointTwo);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testCalc5() {
        Point pointOne = new Point(700, 1);
        Point pointTwo = new Point(800, 1);
        int result = Utils.calcSquare(pointOne, pointTwo);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testCalcRandom() {
        Point pointOne = Utils.generateDataPoint();
        Point pointTwo = Utils.generateDataPoint();
        int result = Utils.calcSquare(pointOne, pointTwo);
        int expectedResult = Math.abs(pointOne.getX() - pointTwo.getX()) * Math.abs(pointOne.getY() - pointTwo.getY());
        Assertions.assertEquals(expectedResult, result);
    }

}
