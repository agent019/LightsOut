import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Continue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Button
{
    /**
     * Act - do whatever the Continue wants to do. This method is called whenever
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
            Background back = new Background();
            Greenfoot.setWorld(back);
        }
        if(Greenfoot.isKeyDown("enter")==true)
        {
            Background back = new Background();
            Greenfoot.setWorld(back);
        }
    }
}
