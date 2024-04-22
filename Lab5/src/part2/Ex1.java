package part2;

// Abstract class part2.Shape
    abstract class Shape {
        // Abstract method to calculate area
        abstract double getArea();
    }

    // part2.Rectangle class extending part2.Shape
    class Rectangle extends Shape {
        private double width;
        private double height;

        // Constructor
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        // Implementing abstract method
        @Override
        double getArea() {
            return width * height;
        }
    }

    // part2.Triangle class extending part2.Shape
    class Triangle extends Shape {
        private double base;
        private double height;

        // Constructor
        public Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        // Implementing abstract method
        @Override
        double getArea() {
            return 0.5 * base * height;
        }
    }

    // TestShape class for testing part2.Rectangle and part2.Triangle classes
    public class Ex1 {
        public static void main(String[] args) {
            // Create instances of part2.Rectangle and part2.Triangle
            Rectangle rectangle = new Rectangle(5, 10);
            System.out.println("Area of part2.Rectangle: " + rectangle.getArea());
            Triangle triangle = new Triangle(6, 8);
            System.out.println("Area of part2.Triangle: " + triangle.getArea());
        }
    }

