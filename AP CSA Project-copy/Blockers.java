import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blockers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blockers extends Actor
{
    public int poo = 1;
    public int speed = 5;
    /**
     * Act - do whatever the Blockers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.Questions()
    }

    public void Q1()
    {

        if(hitWalls() == true)
        {
            speed = 0;
            String q=Greenfoot.ask("Are you ready to start (yes/no)");
            if (q.contains("yes")){
                getWorld().removeObject(this);
                speed = 5;
            }
        }
    }
    public void Q2()
    {

        if(hitWalls() == true)
        {
            speed = 0;
            String q=Greenfoot.ask("Are you ready to start (yes/no)");
            if (q.contains("yes")){
                getWorld().removeObject(this);
                speed = 5;
            }
        }
    }
    public void Q3()
    {

        if(hitWalls() == true)
        {
            speed = 0;
            String q=Greenfoot.ask("Are you ready to start (yes/no)");
            if (q.contains("yes")){
                getWorld().removeObject(this);
                speed = 5;
            }
        }
    }
    public void Q4()
    {

        if(hitWalls() == true)
        {
            speed = 0;
            String q=Greenfoot.ask("Are you ready to start (yes/no)");
            if (q.contains("yes")){
                getWorld().removeObject(this);
                speed = 5;
            }
        }
    }

    public void moveAround()
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(x + speed, y);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(x - speed, y);
        }
    }

    public boolean hitWalls()
    {
        if(isTouching(Blockers.class))
        {
            return(true);
        }
        else
        {
            return(false);
        }
    }
}
