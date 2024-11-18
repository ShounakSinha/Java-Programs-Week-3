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
class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the length and breadth of the rectangle : ");
        int length = Integer.parseInt(in.readLine());
        int breadth = Integer.parseInt(in.readLine());
        Shape rect=new Rectangle(length,breadth);
        rect.area();
        System.out.println("Enter the radius of the circle : ");
        double radius = Double.parseDouble(in.readLine());
        Shape circ= new Circle(radius);
        circ.area();
    }
}

