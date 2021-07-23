package org.sergeyzhirkov.switchme;

import java.util.*;

public class Utils {
    enum Order {
        ASC, DESC
    }

    public static int calcSquare(Point point1, Point point2) {
        return Math.abs((point1.getX() - point2.getX()) * (point1.getY() - point2.getY()));
    }

    public static Point generateDataPoint() {
        //Random random = new Random();
        int randomX = (int) ((Math.random() - 0.5) * 100);
        int randomY = (int) ((Math.random() - 0.5) * 100);
        Point randomPoint = new Point(randomX, randomY);
        return randomPoint;
    }

    public static Integer[] sortArray(Integer[] array, Order order) {
        // if (array == null) return null;
        // в задании не указано как следует обрабатывать
        // NullPointerException поэтому оставим так, как вариант
        Integer[] arrayCopy = array.clone();
        if (order == Order.ASC) {
            Arrays.sort(arrayCopy);
        } else {
            Arrays.sort(arrayCopy, Comparator.reverseOrder());
        }
        return arrayCopy;
    }
}
