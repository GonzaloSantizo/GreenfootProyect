import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{

    /**
     * Constructor for objects of class World2.
     * 
     */
    public World2()
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
        JumpingGuy jumpingGuy = new JumpingGuy();
        addObject(jumpingGuy,219,740);
        Platform platform = new Platform(100, 25);
        addObject(platform,712,526);
        Platform platform2 = new Platform(100, 25);
        addObject(platform2,857,519);
        Platform platform3 = new Platform(100, 25);
        addObject(platform3,946,377);
        Platform platform4 = new Platform(100, 25);
        addObject(platform4,616,381);
        Platform platform5 = new Platform(100, 25);
        addObject(platform5,465,541);
        Platform platform6 = new Platform(100, 25);
        addObject(platform6,521,691);
        platform5.setLocation(358,564);
        platform.setLocation(668,552);
        platform4.setLocation(516,398);
        platform2.setLocation(741,324);
        platform2.setLocation(715,290);
        platform3.setLocation(922,213);
        Platform platform7 = new Platform(100, 25);
        addObject(platform7,995,426);
        Platform platform8 = new Platform(100, 25);
        addObject(platform8,1084,119);
        platform7.setLocation(253,341);
        Platform platform9 = new Platform(100, 25);
        addObject(platform9,75,214);
        change3 change3 = new change3();
        addObject(change3,1083,81);
        platform5.setLocation(366,549);
    }
}
