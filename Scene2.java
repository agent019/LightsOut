import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scene2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scene2 extends World
{

    /**
     * Constructor for objects of class Scene2.
     * 
     */
    public Scene2()
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
        addObject(continue2, 510, 575);
        Next next = new Next();
        addObject(next, 502, 573);
        next.setLocation(337, 574);
        removeObject(next);
        removeObject(continue2);
        Next next2 = new Next();
        addObject(next2, 506, 573);
    }
}
