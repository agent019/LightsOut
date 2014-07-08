import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Next here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Next extends Button
{
    /**
     * Act - do whatever the Next wants to do. This method is called whenever
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
            Scene3 three = new Scene3();
            Greenfoot.setWorld(three);
        }
        /*if(Greenfoot.isKeyDown("enter")==true)
        {
            Scene3 three = new Scene3();
            Greenfoot.setWorld(three);
        }*/
    }
}
