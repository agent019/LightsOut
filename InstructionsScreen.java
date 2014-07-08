import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionsScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionsScreen extends World
{

    /**
     * Constructor for objects of class InstructionsScreen.
     * 
     */
    public InstructionsScreen()
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
        Battery battery = new Battery();
        addObject(battery, 79, 430);
        LevelUp levelup = new LevelUp();
        addObject(levelup, 75, 514);
        Explorer explorer = new Explorer();
        addObject(explorer, 75, 348);
        Back back = new Back();
        addObject(back, 514, 565);
    }
}
