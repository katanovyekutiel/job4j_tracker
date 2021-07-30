package ru.job4j.tracker.oop;

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double semiPerimeter(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }

    public boolean exist(double ab, double ac, double bc) {
                return  ab + ac > bc && ab + bc > ac && ac + bc > ab;
    }

    public double area() {
        double rsl = -1;
        double a = first.distance3d(second);
        double b = first.distance3d(third);
        double c = second.distance3d(third);
        if (this.exist(a, b, c)) {
            double p = semiPerimeter(a, b, c);
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
}
