import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startover extends Button
{
    /**
     * Act - do whatever the Startover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        pressed();
    }    
    
    public void pressed()
    {
        if(Greenfoot.mouseClicked(this)==true)
        {
            Main main = new Main();
            Greenfoot.setWorld(main);
        }
    }
}
