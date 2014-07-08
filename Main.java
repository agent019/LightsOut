import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main extends World
{

    /**
     * Constructor for objects of class Main.
     * 
     */
    public Main()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        prepare();
    }
    
    private void prepare()
    {
        NewGame newgame = new NewGame();
        addObject(newgame, 545, 415);
        Instructions instructions = new Instructions();
        addObject(instructions, 526, 555);
        removeObject(newgame);
        Start start = new Start();
        addObject(start, 545, 392);
        NewGame newgame2 = new NewGame();
        addObject(newgame2, 523, 421);
        newgame2.setLocation(523, 417);
        newgame2.setLocation(536, 415);
        removeObject(start);
    }
}
