package org.sergeyzhirkov.switchme;

import java.util.Random;

public class Utils {

    public static int calcSquare(Point point1, Point point2) {
        return Math.abs((point1.getX() - point2.getX()) * (point1.getY() - point2.getY()));
    }

    public static Point generateDataPoint() {
        Random random = new Random();
        int randomX = (int) ((Math.random() - 0.5) * 100);
        int randomY = (int) ((Math.random() - 0.5) * 100);
        Point randomPoint = new Point(randomX, randomY);
        return randomPoint;
    }
}
