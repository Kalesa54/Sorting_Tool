class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {

        // checks how many steps are needed
        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();

        // checks if the robot is in desired position on X axis and if not, rotates the robot and moves it
        if (deltaX != 0) {
            // rotates the robot
            if (deltaX > 0) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
            } else {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
            }
            // moves the robot using the absolute value of deltaX variable
            for (int i = 0; i < Math.abs(deltaX); i++) {
                robot.stepForward();
            }
        }

        // checks if the robot is in desired position on Y axis and if not, rotates the robot and moves it
        if (deltaY != 0) {
            // rotates the robot
            if (deltaY > 0) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
            } else {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
            }
            // moves the robot using the absolute value of deltaY variable
            for (int i = 0; i < Math.abs(deltaY); i++) {
                robot.stepForward();
            }
        }

    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}