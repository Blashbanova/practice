package ru.ssau.tk.blashbanoba.practice;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Point firstPoint = new Point(7.3, 39.3, 0.32);
        Point secondPoint = new Point(9.3, 0.23, 3.54);
    }

}
