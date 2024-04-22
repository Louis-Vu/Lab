package part2;

public class  Ex2 {
    // Interface Moveable
    interface Moveable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }

    // Point class implementing Moveable interface
    static class Point implements Moveable {
        private int x;
        private int y;

        // Constructor
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Implement moveUp method
        @Override
        public void moveUp() {
            y++;
        }

        // Implement moveDown method
        @Override
        public void moveDown() {
            y--;
        }

        // Implement moveLeft method
        @Override
        public void moveLeft() {
            x--;
        }

        // Implement moveRight method
        @Override
        public void moveRight() {
            x++;
        }

        // Method to display current position of the point
        public void display() {
            System.out.println("Current position: (" + x + ", " + y + ")");
        }
    }

    // Test class to check Point movement
    public static void main(String[] args) {
        // Create a Point object
        Point point = new Point(0, 0);
        point.display();

        // Move the point
        point.moveUp();
        point.moveRight();
        point.display();

        // Move the point again
        point.moveDown();
        point.moveLeft();
        point.display();
    }
}
