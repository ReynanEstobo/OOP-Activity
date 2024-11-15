import java.lang.reflect.WildcardType;

public class Activity4 {
    
    public static void main(String[] args) {
        Shape circle1 = new Circle(9.0, "Yellow", true);
        Shape rectangle1 = new Rectangle(10.0, 5.0, "Red", true);
        Shape square1 = new Square(4.0, 5.0, 5.0, "Blue", false);

        System.out.println(circle1.toString());
        System.out.println("Area is: " + circle1.getArea());
        System.out.println("Perimeter is: " + circle1.getPerimeter());

        System.out.println();

        System.out.println(rectangle1.toString());
        System.out.println("Area is: " + rectangle1.getArea());
        System.out.println("Perimeter is: " + rectangle1.getPerimeter());

        System.out.println();

        System.out.println(square1.toString());
        System.out.println("Area is: " + square1.getArea());
        System.out.println("Perimeter is: " + square1.getPerimeter());
    }
}


abstract class Shape{
    protected String Color;
    protected Boolean Filled;

    public Shape (String Color, Boolean Filled){
        this.Color = Color;
        this.Filled = Filled;
    }

    public void setColor(String color){
        this.Color = color;
    }

    public void Filled (Boolean filled){
        this.Filled = filled;
    }

    public Boolean isFilled(){
        return Filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    

    public String toString(){
        return "[Color= " + Color + " Filled= " +  Filled + "]";
    }
}

class Circle extends Shape{
    protected double Radius;

    public Circle (double Radius, String Color, Boolean Filled){
        super(Color, Filled);
        this.Radius = Radius;
    }

    public void setRadius(double Radius){
        this.Radius = Radius;
    }

    public double getRadius(){
        return Radius;
    }

    public double getArea(){
        return 3.14159265359 * (Radius * Radius);
    }

    public double getPerimeter(){
        return 2 * 3.14159265359 * Radius;
    } 
    public String toString(){
        return "Circle [Radius is: " + Radius + " Color is: " + Color + " Filled is: " + Filled + "]";
    }


}

class Rectangle extends Shape{
    protected double Length;
    protected double Width;

    public Rectangle (double Length, double Width, String Color, Boolean Filled){
        super(Color, Filled);
        this.Length = Length;
        this.Width = Width;
    }

    public void setLength(double Length){
        this.Length = Length;
    }

    public void setWidth(double Width){
        this.Width = Width;
    }

    public double getLength(){
        return Length;
    }

    public double getWidth(){
        return Width;
    }

    public double getArea(){
        return Length * Width;
    }
    public double getPerimeter(){
        return 2 * (Length + Width);
    }
    public String toString(){
        return "Rectangle [Length is: " + Length + " Width is: " + Width + " Color is: " + Color + " Filled is: " + Filled + "]"; 
    }

}

class Square extends Rectangle {
    protected double Side;

    public Square(double Side, double Length, double Width, String Color, boolean Filled){
        super(Width, Width, Color, Filled);
    }
    public void setSide(double Side){
        this.Side = Side;
    }
    public double getSide(){
        return this.Side;
    }
    
    public double getArea() {
        return Width * Length;
    }
    public double getPerimeter() {
        return 2 * (Width + Length);
    }
    
    public String toString() {
        return "Square [Side is: " + Side + " Length is: " + Length + " Width is: " + Width + " Color is: " + Color + " Filled is: " + Filled + "]"; 
    }
}