import greenfoot.*;

public class Explorer extends Actor //Credit to Eugene Park for this class image
{
    private int batNum;
    private int level;
    private Battery battery;
    private Flashlight flashlight;
    private Maze maze;
    private int explorerSize = 20;
    private boolean lastKeyLeft = false; //Check to see if last key pressed was left, then set image

    public Explorer()
    {
        this.batNum = 0;
        this.level = 1;
    }

    public void act()
    {
        changeImage();
        moving();
    }

    public int getBatNum()
    {
        return this.batNum;
    }

    public void addBat()
    {
        flashlight = ((Flashlight) getWorld().getObjects(Flashlight.class).get(0));
        flashlight.increaseRadius();
        batNum++;
    }

    public void addLevel()
    {
        if(getWorld() instanceof Background)
        {
            Background curWorld = ((Background) getWorld());
            curWorld.addLevel();
        }
        else {}
    }

    public Square location()
    {
        int col = getX();
        int row = getY();

        return (new Square(row, col));
    }

    public void moving()
    {
        int x = getX();
        int y = getY();

        if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("left"))
        {
            lastKeyLeft = true;
            if(moveUp() && moveLeft())
                setLocation(x-3, y-3);
            else if(moveUp())
                setLocation(x, y-3);
            else if(moveLeft())
                setLocation(x-3, y);
        }
        else if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("right"))
        {
            lastKeyLeft = false;
            if(moveUp() && moveRight())
                setLocation(x+3, y-3);
            else if(moveUp())
                setLocation(x, y-3);
            else if(moveRight())
                setLocation(x+3, y);
        }
        else if(Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("left"))
        {
            lastKeyLeft = true;
            if(moveDown() && moveLeft())
                setLocation(x-3, y+3);
            else if(moveDown())
                setLocation(x, y+3);
            else if(moveLeft())
                setLocation(x-3, y);
        }
        else if(Greenfoot.isKeyDown("down") && Greenfoot.isKeyDown("right"))
        {
            lastKeyLeft = false;
            if(moveDown() && moveRight())
                setLocation(x+3, y+3);
            else if(moveDown())
                setLocation(x, y+3);
            else if(moveRight())
                setLocation(x+3, y);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            if(moveUp())
                setLocation(x, y-3);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            if(moveDown())
                setLocation(x, y+3);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            lastKeyLeft = true;
            if(moveLeft())
                setLocation(x-3, y);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            lastKeyLeft = false;
            if(moveRight())
                setLocation(x+3, y);
        }
    }

    public boolean moveUp()
    {
        for(int i = (0 - explorerSize/2) + 3; i < explorerSize/2 - 2; i++)
        {
            if(getOneObjectAtOffset(i, 0 - explorerSize/2, Wall.class) != null)
                return false;
        }     
        return true;
    }

    public boolean moveDown()
    {
        for(int i = (0 - explorerSize/2) + 3; i < explorerSize/2 - 2; i++)
        {
            if(getOneObjectAtOffset(i, explorerSize/2, Wall.class) != null)
                return false;
        }
        return true;
    }

    public boolean moveLeft()
    {
        for(int i = (0 - explorerSize/2) + 3; i < explorerSize/2 - 2; i++)
        {
            if(getOneObjectAtOffset(0 - explorerSize/2, i, Wall.class) != null)
                return false;
        }
        return true;
    }

    public boolean moveRight()
    {
        for(int i = (0 - explorerSize/2) + 3; i < explorerSize/2 - 2; i++)
        {
            if(getOneObjectAtOffset(explorerSize/2, i, Wall.class) != null)
                return false;
        }
        return true;
    }

    public void changeImage()
    {
        if(lastKeyLeft == true)
            this.setImage("PlayerLeft.png");
        if(lastKeyLeft == false)
            this.setImage("PlayerRight.png");
    }
}
