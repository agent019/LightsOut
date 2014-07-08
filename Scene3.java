import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scene3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene3 extends World
{

    /**
     * Constructor for objects of class Scene3.
     * 
     */
    public Scene3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Continue continue2 = new Continue();
        addObject(continue2, 522, 572);
        removeObject(continue2);
        Start start = new Start();
        addObject(start, 454, 573);
    }
}
