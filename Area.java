import java.io.*;

public class Area
{
public static void main(String args[])
{

Rectangle r = new Rectangle();
Triangle t = new Triangle();

r.len = 20;
r.breadth = 2;

t.base = 10;
t.height = 2;

r.CalculateArea();
t.CalculateArea();
}
}