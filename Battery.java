import greenfoot.*;

public class Battery extends Actor
{
    private boolean found;
    Explorer e;

    public Battery()
    {}
    
    public void act()
    {
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
        if(getWorld() instanceof Background)
        {
            e = ((Explorer) getWorld().getObjects(Explorer.class).get(0));
            if(this.intersects(e))
            {
                e.addBat();
                getWorld().removeObject(this);
            }
        }
        else
        {}
    }
}