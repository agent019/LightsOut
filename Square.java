import greenfoot.*;
import java.awt.*;

public class Square extends Actor
{
    private boolean walls[] = new boolean[4];
    private int row;
    private int col;
    private boolean hasBattery;
    private boolean levelUp;
    private boolean corners[] = new boolean[4];
    private boolean cornersIn[] = new boolean[4];

    private final static int SQUARE_UP = 0; // Upper wall
    private final static int SQUARE_DOWN = 1; //Bottom wall
    private final static int SQUARE_LEFT = 2; // Left wall
    private final static int SQUARE_RIGHT = 3; // Right wall
    private final static int SQUARE_SIZE = 60; // 50 for the number of pixels
    private final static int WALL_SIZE = 6;

    // Constructor to make a Square with walls and placement in the maze.
    public Square(boolean up, boolean down, boolean left, boolean right, int row, int col, boolean hasBattery, boolean levelUp, boolean topLeft, boolean topLeftIn, boolean topRight, boolean topRightIn, boolean botLeft, boolean botLeftIn, boolean botRight, boolean botRightIn)//, boolean inView)
    {
        this.walls[SQUARE_UP] = up;
        this.walls[SQUARE_DOWN] = down;
        this.walls[SQUARE_LEFT] = left;
        this.walls[SQUARE_RIGHT] = right;
        this.row = row;
        this.col = col;
        this.hasBattery = hasBattery;
        this.levelUp = levelUp;
        this.corners[0] = topLeft;
        this.cornersIn[0] = topLeftIn;
        this.corners[1] = topRight;
        this.cornersIn[1] = topRightIn;
        this.corners[2] = botLeft;
        this.cornersIn[2] = botLeftIn;
        this.corners[3] = botRight;
        this.cornersIn[3] = botRightIn;

        /*GreenfootImage back = new GreenfootImage(SQUARE_SIZE, SQUARE_SIZE);
        back.setColor(new Color(0, 0, 150));
        back.fillRect(0, 0, SQUARE_SIZE, SQUARE_SIZE);
        back.setColor(Color.green);
        this.setImage(back);*/
    }

    public void act()
    {
    }

    public Square(int row, int col)
    {
        this.row = row;
        this.col = col;
    }

    public int getRow()
    {
        return this.row;
    }

    public int getCol()
    {
        return this.col;
    }

    public boolean getBattery()
    {
        return this.hasBattery;
    }

    public boolean getLevel()
    {
        return this.levelUp;
    }

    public void setBattery(boolean hasBattery)
    {
        this.hasBattery = hasBattery;
    }

    public boolean getWalls(int direction)
    {
        return walls[direction];   
    }
    
    public boolean getCorners(int direction)
    {
        return corners[direction];
    }
    
    public boolean getCornersIn(int direction)
    {
        return cornersIn[direction];
    }
}