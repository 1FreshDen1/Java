package ru.mirea.lab8;
import java.awt.*;
public class Circle extends Shape {
    private int radius;
    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }
    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}