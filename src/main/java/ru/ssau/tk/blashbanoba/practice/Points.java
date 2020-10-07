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
}
