import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world3 extends World
{

    /**
     * Constructor for objects of class world3.
     * 
     */
    public world3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Platform platform = new Platform(100, 25);
        addObject(platform,966,307);
        Platform platform2 = new Platform(100, 25);
        addObject(platform2,996,427);
        Platform platform3 = new Platform(100, 25);
        addObject(platform3,832,489);
        Platform platform4 = new Platform(100, 25);
        addObject(platform4,292,677);
        platform3.setLocation(503,615);
        platform2.setLocation(729,560);
        platform.setLocation(918,500);
        Platform platform5 = new Platform();
        addObject(platform5,1108,451);
        JumpingGuy jumpingGuy = new JumpingGuy();
        addObject(jumpingGuy,55,751);
    }
}
