import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NewGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewGame extends Button
{
    /**
     * Act - do whatever the NewGame wants to do. This method is called whenever
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
            Scene1 one = new Scene1();
            Greenfoot.setWorld(one);
        }
        /*if(Greenfoot.isKeyDown("enter")==true)
        {
                Scene1 one = new Scene1();
                Greenfoot.setWorld(one);
        }*/
        
    }
}
