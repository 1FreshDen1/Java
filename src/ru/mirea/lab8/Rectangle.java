package ru.mirea.lab8;
import java.awt.*;
public class Rectangle extends Shape{
    private int width, height;
    public Rectangle(Color color, int x, int y, int width, int height) {
        super(color, x, y);
        this.width = width;
        this.height = height;
    }
    @Override
    void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}