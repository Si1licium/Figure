import java.awt.*;

public abstract class Shape {

    String color;
    int x, y; //координата расположения верхней левой точки
    int a, b; // ширина и длина

    public abstract void draw(Graphics p, int x, int y, int a, int b);
}