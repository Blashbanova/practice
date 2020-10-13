package ru.ssau.tk.blashbanoba.practice;

public class Points {
    private Points() {
    }

    public static Point sum(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x + secondPoint.x, firstPoint.y + secondPoint.y, firstPoint.z + secondPoint.z);
    }

    public static Point subtract(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x - secondPoint.x, firstPoint.y - secondPoint.y, firstPoint.z - secondPoint.z);
    }

    public static Point multiply(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x * secondPoint.x, firstPoint.y * secondPoint.y, firstPoint.z * secondPoint.z);
    }

    public static Point divide(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x / secondPoint.x, firstPoint.y / secondPoint.y, firstPoint.z / secondPoint.z);
    }

    public static Point enlarge(Point firstPoint, double number) {
        return new Point(number * firstPoint.x, number * firstPoint.y, number * firstPoint.z);
    }

    public static double length(Point point) {
        return point.lenght();
    }

    public static Point opposite(Point point) {
        return new Point(-point.x, -point.y, -point.z);
    }

    public static Point inverse(Point point) {
        Point anotherPoint = new Point(1, 1, 1);
        return Points.divide(anotherPoint, point);
    }

    public static double scalarProduct(Point firstVector, Point secondVector) {
        return firstVector.x * secondVector.x + firstVector.y * secondVector.y + firstVector.z * secondVector.z;
    }

    public static Point vectorProduct(Point firstVector, Point secondVector) {
        double newX = firstVector.y * secondVector.z - firstVector.z * secondVector.y;
        double newY = firstVector.z * secondVector.x - firstVector.x * secondVector.z;
        double newZ = firstVector.x * secondVector.y - firstVector.y + secondVector.x;
        return new Point(newX, newY, newZ);
    }
}
