import greenfoot.*;
import java.awt.*;

public class Flashlight extends Actor
{
    int radius = 250;
    int x, y;
    int counter = 0;
    int incrRadSize = 250;

    public void act() 
    {
        followPlayer();
        createPortal(x, y, radius); //Code credit from greenfoot user 'danpost'. All credit goes to him!
        shrink();
        gameover();
    }

    public void createPortal(int x, int y, int r) // x and y are the center and r  is the radius  
    {
        GreenfootImage img = new GreenfootImage(600, 600);
        img.setColor(Color.black);
        img.fillRect(0, 0, 600, 600);
        Color color = Color.white;
        Color color2 = Color.blue;
        Color color3 = Color.cyan;
        Color color4 = Color.darkGray;
        Color color5 = Color.gray;
        Color color6 = Color.green;
        Color color7 = Color.lightGray;
        Color color8 = Color.magenta;
        Color color9 = Color.orange;
        Color color10 = Color.pink;
        Color color11 = Color.red;
        Color trans = new Color(0, 0, 0, 0);
        Color trans2 = new Color(0, 0, 0, 25);
        Color trans3 = new Color(0, 0, 0, 50);
        Color trans4 = new Color(0, 0, 0, 75);
        Color trans5 = new Color(0, 0, 0, 100);
        Color trans6 = new Color(0, 0, 0, 125);
        Color trans7 = new Color(0, 0, 0, 150);
        Color trans8 = new Color(0, 0, 0, 175);
        Color trans9 = new Color(0, 0, 0, 200);
        Color trans10 = new Color(0, 0, 0, 225);
        Color trans11 = new Color(0, 0, 0, 250);
        img.setColor(color11);
        img.fillOval(x - r - 10, y - r - 10, (r * 2) + 20, (r * 2) + 20);
        img.setColor(color10);
        img.fillOval(x - r - 9, y - r - 9, (r * 2) + 18, (r * 2) + 18);
        img.setColor(color9);
        img.fillOval(x - r - 8, y - r - 8, (r * 2) + 16, (r * 2) + 16);
        img.setColor(color8);
        img.fillOval(x - r - 7, y - r - 7, (r * 2) + 14, (r * 2) + 14);
        img.setColor(color7);
        img.fillOval(x - r - 6, y - r - 6, (r * 2) + 12, (r * 2) + 12);
        img.setColor(color6);
        img.fillOval(x - r - 5, y - r - 5, (r * 2) + 10, (r * 2) + 10);
        img.setColor(color5);
        img.fillOval(x - r - 4, y - r - 4, (r * 2) + 8, (r * 2) + 8);
        img.setColor(color4);
        img.fillOval(x - r - 3, y - r - 3, (r * 2) + 6, (r * 2) + 6);
        img.setColor(color3);
        img.fillOval(x - r - 2, y - r - 2, (r * 2) + 4, (r * 2) + 4);
        img.setColor(color2);
        img.fillOval(x - r - 1, y - r - 1, (r * 2) + 2, (r * 2) + 2);
        img.setColor(color);
        img.fillOval(x - r, y - r, r * 2, r * 2);

        for (int i = 0; i <(r * 2) + 20; i++)  
        {  
            for (int j = 0; j < (r * 2) + 20; j++)  
            {
                if((x - r - 10 + i) >= 0 && (y - r - 10 + j) >= 0 && (x - r - 10 + i) < 600 && (y - r - 10 + j) < 600)
                {
                    Color here = img.getColorAt(x - r - 10 + i, y - r - 10 + j);
                    if (color11.equals(here))
                        img.setColorAt(x - r - 10 + i, y - r - 10 + j, trans11);
                    if (color10.equals(here))
                        img.setColorAt(x - r - 10 + i, y - r - 10 + j, trans10);
                    if (color9.equals(here))
                        img.setColorAt(x - r - 10 + i, y - r - 10 + j, trans9);
                    if (color8.equals(here))
                        img.setColorAt(x - r - 10 + i, y - r - 10 + j, trans8);
                    if (color7.equals(here))
                        img.setColorAt(x - r - 10 + i, y - r - 10 + j, trans7);
                    if (color6.equals(here))
                        img.setColorAt(x - r - 10 + i, y - r - 10 + j, trans6);
                    if (color5.equals(here))
                        img.setColorAt(x - r - 10 + i, y - r - 10 + j, trans5);
                    if (color4.equals(here))
                        img.setColorAt(x - r - 10 + i, y - r - 10 + j, trans4);
                    if (color3.equals(here))
                        img.setColorAt(x - r - 10 + i, y - r - 10 + j, trans3);
                    if (color2.equals(here))
                        img.setColorAt(x - r - 10 + i, y - r - 10 + j, trans2);
                    if (color.equals(here))
                        img.setColorAt(x - r - 10 + i, y - r - 10 + j, trans);
                }
            }  
        }
        if(getWorld() instanceof FinalLevel)
        {
            img.setColor(color);
            img.fillOval(546, 306, 48, 48);
            for(int i = 540; i < 600; i++)
            {
                for(int j = 300; j < 360; j++)
                {
                    Color here = img.getColorAt(i,j);
                    if (color.equals(here))
                        img.setColorAt(i,j, trans);
                }
            }

        }
        setImage(img);  
    }

    public int getRadius()
    {
        return this.radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public void increaseRadius()
    {
        this.radius += incrRadSize;
        if (radius > 250)
            radius = 250;
    }

    public void followPlayer()
    {
        this.x = ((Explorer) getWorld().getObjects(Explorer.class).get(0)).getX();//also credit to greenfoot user danpost
        this.y = ((Explorer) getWorld().getObjects(Explorer.class).get(0)).getY();//same here
    }

    public void shrink()
    {
        counter++;
        if(getWorld() instanceof Background)
        {
            if(radius <= -20)
            {
                radius = -20;
            }
            else if((counter % 3) == 0)
                radius -= 1;
        }
        if(getWorld() instanceof FinalLevel)
        {
            if(radius <= -20)
                radius = -20;
            else if((counter % 100 == 1))
                radius -= 1;
        }
    }

    public void gameover()
    {
        if(radius==-20)
        {
            if(getWorld() instanceof FinalLevel)
            {
                FinalLevel finalLevel = ((FinalLevel) getWorld());
                finalLevel.backgroundMusic.stop();
                Gameover gameover = new Gameover();
                Greenfoot.setWorld(gameover);
            }
            if(getWorld() instanceof Background)
            {
                Background background = ((Background) getWorld());
                background.backgroundMusic.stop();
                Gameover gameover = new Gameover();
                Greenfoot.setWorld(gameover);
            }
        }
    }
}