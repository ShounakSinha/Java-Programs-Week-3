import java.io.*;
class Shape
{
    public void area()
    {
        System.out.println("Habi jabi");
    }
}
class Rectangle extends Shape
{
    int length, breadth, ar;
    
    Rectangle(int length, int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public void area()
    {
        ar=length*breadth;
        System.out.println("The area of a rectangle is : "+ar+" square units");
    }
}
class Circle extends Shape
{
    double radius, ar;
    
    Circle(double radius)
    {
        this.radius=radius;
    }
    public void area()
    {
        ar=3.142*radius*radius;
        System.out.println("The area of the circle is : "+ar+" square units");
    }
}

