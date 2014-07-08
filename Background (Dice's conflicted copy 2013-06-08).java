import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    private final static int SQUARE_UP = 0; // Upper wall
    private final static int SQUARE_DOWN = 1; //Bottom wall
    private final static int SQUARE_LEFT = 2; // Left wall
    private final static int SQUARE_RIGHT = 3; // Right wall
    private final static int SQUARE_SIZE = 60; // Size of the square in pixels
    private final static int WALL_SIZE = 6; //Size of the walls in pixels
    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Maze maze = new Maze(1);
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                addObject(maze.getSquare(i,j), (j * 60) + 30, (i * 60) + 30);
                if(maze.getSquare(i,j).getWalls(SQUARE_UP) == true)
                {
                    TopBottomWall topbottomwall = new TopBottomWall();
                    addObject(topbottomwall, maze.getSquare(i,j).getX(), (maze.getSquare(i,j).getY() - (SQUARE_SIZE/2)) + (WALL_SIZE/2));
                }
                if(maze.getSquare(i,j).getWalls(SQUARE_DOWN) == true)
                {
                    TopBottomWall topbottomwall2 = new TopBottomWall();
                    addObject(topbottomwall2, maze.getSquare(i,j).getX(), (maze.getSquare(i,j).getY() + (SQUARE_SIZE/2)) - (WALL_SIZE/2));
                }
                if(maze.getSquare(i,j).getWalls(SQUARE_LEFT) == true)
                {
                    SideWall sidewall = new SideWall();
                    addObject(sidewall, maze.getSquare(i,j).getX() - (SQUARE_SIZE/2) + (WALL_SIZE/2), maze.getSquare(i,j).getY());
                }
                if(maze.getSquare(i,j).getWalls(SQUARE_RIGHT) == true)
                {
                    SideWall sidewall2 = new SideWall();
                    addObject(sidewall2, (maze.getSquare(i,j).getX() + (SQUARE_SIZE/2)) - (WALL_SIZE/2), maze.getSquare(i,j).getY());
                }
                if(hasBattery == true)
                {
                    batt = new Battery();
                    getWorld().addObject(batt, getX() + (SQUARE_SIZE/2), getY() + (SQUARE_SIZE/2));
                }
            }
        }
        Explorer explorer = new Explorer();
        addObject(explorer, 30, 30);
        Flashlight flashlight = new Flashlight();
        addObject(flashlight, 300, 300);
    }
}
