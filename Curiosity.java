import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Curiosity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Curiosity extends Button
{
    /**
     * Act - do whatever the Curiosity wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        pressed();
    }

    public void pressed()
    {
        if(Greenfoot.mouseClicked(this)==true)
        {
            FinalLevel finalLevel = new FinalLevel();
            Greenfoot.setWorld(finalLevel);
        }
    }   
}
