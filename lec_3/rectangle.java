

class RectangleDemo {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(3, 4);
        Rectangle rectangle2 = new Rectangle(6, 7);
        Rectangle rectangle3 = new Rectangle(8, 9);
        Rectangle rectangle4 = new Rectangle(10, 11);
        
        System.out.println("RECTANGLE CALCULATIONS:");
        rectangle1.display();
        rectangle2.display();
        rectangle3.display();
        rectangle4.display();
    }
}

class Rectangle {
    double length;
    double breadth;
    double perimeter;
    double area;
    
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        // Calculate area and perimeter when object is created
        this.area = calculateArea();
        this.perimeter = calculatePerimeter();
    }
    
    public double calculateArea() {
        return length * breadth;
    }
    
    public double calculatePerimeter() {
        return 2 * length + 2 * breadth;
    }
    
    void display() {
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println(); // Add empty line for better readability
    }
}