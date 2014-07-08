import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

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
    private int level = 0;
    Maze maze;
    GreenfootSound backgroundMusic = new GreenfootSound("Crappy Video Game BGM.wav"); //Credit to William Nakamura for this music
    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x600 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        addLevel();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                addObject(maze.getSquare(i,j), (j * 60) + 30, (i * 60) + 30);
                if(maze.getSquare(i,j).getWalls(SQUARE_UP) == true)
                {
                    TopWall topwall = new TopWall();
                    addObject(topwall, maze.getSquare(i,j).getX(), (maze.getSquare(i,j).getY() - (SQUARE_SIZE/2)) + (WALL_SIZE/2));
                }
                if(maze.getSquare(i,j).getWalls(SQUARE_DOWN) == true)
                {
                    BottomWall bottomwall = new BottomWall();
                    addObject(bottomwall, maze.getSquare(i,j).getX(), (maze.getSquare(i,j).getY() + (SQUARE_SIZE/2)) - (WALL_SIZE/2));
                }
                if(maze.getSquare(i,j).getWalls(SQUARE_LEFT) == true)
                {
                    LeftWall leftwall = new LeftWall();
                    addObject(leftwall, maze.getSquare(i,j).getX() - (SQUARE_SIZE/2) + (WALL_SIZE/2), maze.getSquare(i,j).getY());
                }
                if(maze.getSquare(i,j).getWalls(SQUARE_RIGHT) == true)
                {
                    RightWall rightwall = new RightWall();
                    addObject(rightwall, (maze.getSquare(i,j).getX() + (SQUARE_SIZE/2)) - (WALL_SIZE/2), maze.getSquare(i,j).getY());
                }
                if(maze.getSquare(i,j).getCorners(0) == true)
                {
                    if(maze.getSquare(i,j).getCornersIn(0) == true)
                    {
                        TopLeftCornerIn topleftcornerin = new TopLeftCornerIn();
                        addObject(topleftcornerin, maze.getSquare(i,j).getX() - (SQUARE_SIZE/2) + (WALL_SIZE/2), maze.getSquare(i,j).getY() - (SQUARE_SIZE/2) + (WALL_SIZE/2));
                    }
                    else
                    {
                        TopLeftCornerOut topleftcornerout = new TopLeftCornerOut();
                        addObject(topleftcornerout, maze.getSquare(i,j).getX() - (SQUARE_SIZE/2) + (WALL_SIZE/2), maze.getSquare(i,j).getY() - (SQUARE_SIZE/2) + (WALL_SIZE/2));
                    }
                }
                if(maze.getSquare(i,j).getCorners(1) == true)
                {
                    if(maze.getSquare(i,j).getCornersIn(1) == true)
                    {
                        TopRightCornerIn toprightcornerin = new TopRightCornerIn();
                        addObject(toprightcornerin, maze.getSquare(i,j).getX() + (SQUARE_SIZE/2) - (WALL_SIZE/2), maze.getSquare(i,j).getY() - (SQUARE_SIZE/2) + (WALL_SIZE/2));
                    }
                    else
                    {
                        TopRightCornerOut toprightcornerout = new TopRightCornerOut();
                        addObject(toprightcornerout, maze.getSquare(i,j).getX() + (SQUARE_SIZE/2) - (WALL_SIZE/2), maze.getSquare(i,j).getY() - (SQUARE_SIZE/2) + (WALL_SIZE/2));
                    }
                }
                if(maze.getSquare(i,j).getCorners(2) == true)
                {
                    if(maze.getSquare(i,j).getCornersIn(2) == true)
                    {
                        BottomLeftCornerIn bottomleftcornerin = new BottomLeftCornerIn();
                        addObject(bottomleftcornerin, maze.getSquare(i,j).getX() - (SQUARE_SIZE/2) + (WALL_SIZE/2), maze.getSquare(i,j).getY() + (SQUARE_SIZE/2) - (WALL_SIZE/2));
                    }
                    else
                    {
                        BottomLeftCornerOut bottomleftcornerout = new BottomLeftCornerOut();
                        addObject(bottomleftcornerout, maze.getSquare(i,j).getX() - (SQUARE_SIZE/2) + (WALL_SIZE/2), maze.getSquare(i,j).getY() + (SQUARE_SIZE/2) - (WALL_SIZE/2));
                    }
                }
                if(maze.getSquare(i,j).getCorners(3) == true)
                {
                    if(maze.getSquare(i,j).getCornersIn(3) == true)
                    {
                        BottomRightCornerIn bottomrightcornerin = new BottomRightCornerIn();
                        addObject(bottomrightcornerin, maze.getSquare(i,j).getX() + (SQUARE_SIZE/2) - (WALL_SIZE/2), maze.getSquare(i,j).getY() + (SQUARE_SIZE/2) - (WALL_SIZE/2));
                    }
                    else
                    {
                        BottomRightCornerOut bottomrightcornerout = new BottomRightCornerOut();
                        addObject(bottomrightcornerout, maze.getSquare(i,j).getX() + (SQUARE_SIZE/2) - (WALL_SIZE/2), maze.getSquare(i,j).getY() + (SQUARE_SIZE/2) - (WALL_SIZE/2));
                    }
                }
                if(maze.getSquare(i,j).getBattery() == true)
                {
                    Battery batt = new Battery();
                    addObject(batt, (j * 60) + 30, (i * 60) + 30);
                }
                if(maze.getSquare(i,j).getLevel() == true)
                {
                    LevelUp level = new LevelUp();
                    addObject(level, (j * 60) + 30, (i * 60) + 30);
                }
            }
        }
        Explorer explorer = new Explorer();
        addObject(explorer, 30, 30);
        Flashlight flashlight = new Flashlight();
        addObject(flashlight, 300, 300);
        backgroundMusic.playLoop();
    }

    public void addLevel()
    {
        List<Object> allObjects = getObjects(null);
        removeObjects(allObjects);
        if(level<3)
        {
            maze = new Maze(++level);
            if(backgroundMusic.isPlaying())
                backgroundMusic.stop();
            prepare();
        }
        else
        {
            maze = new Maze(++level);
            if(backgroundMusic.isPlaying())
                backgroundMusic.stop();
        }
    }

    public GreenfootSound getBackgroundMusic()
    {
        return backgroundMusic;
    }
}
