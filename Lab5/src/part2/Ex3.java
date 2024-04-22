package part2;

public class Ex3 {

    interface Movable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }

    // Class MovablePoint
    static class MovablePoint implements Movable {
        public int x;
        public int y;
        public int xSpeed;
        public int ySpeed;

        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }
        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getXSpeed() {
            return xSpeed;
        }

        public int getYSpeed() {
            return ySpeed;
        }


        @Override
        public void moveUp() {
            y -= ySpeed;
        }

        @Override
        public void moveDown() {
            y += ySpeed;
        }

        @Override
        public void moveLeft() {
            x -= xSpeed;
        }

        @Override
        public void moveRight() {
            x += xSpeed;
        }

        @Override
        public String toString() {
            return "MovablePoint{x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "}";
        }
    }

    // Class MovableCircle
    static class MovableCircle extends MovablePoint {
        private int radius;

        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
            super(x, y, xSpeed, ySpeed);
            this.radius = radius;
        }

        // Additional methods specific to MovableCircle can be added here

        @Override
        public String toString() {
            return "MovableCircle{x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + ", radius=" + radius + "}";
        }
    }


    // Main method
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(3, 5, 1, 2);

        // Move the MovablePoint object
        point.moveUp();
        point.moveRight();
        System.out.println("Moved MovablePoint: (" + point.getX() + ", " + point.getY() + ")");

        // Create an instance of MovableCircle
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 3);

        // Move the MovableCircle object
        circle.moveDown();
        circle.moveLeft();
        System.out.println("Moved MovableCircle: (" + circle.getX() + ", " + circle.getY() + ")");
    }
}
