import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelUp extends Actor
{
    private boolean found;
    private Explorer e;
    
    /**
     * Act - do whatever the LevelUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public LevelUp()
    {
    }
    
    public void act() 
    {
        // Add your action code here.
        checkCollision();
    }    
    
    public boolean found()
    {
        return found;
    }

    public void setFound()
    {
        found = true;
    }
    
    public Square location()
    {
        int col = getX();
        int row = getY();

        return (new Square(row, col));
    }
    
    public void checkCollision()
    {
        e = ((Explorer) getWorld().getObjects(Explorer.class).get(0));
        if(this.intersects(e))
        {
            e.addLevel();
        }
    }
}
