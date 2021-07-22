import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldBackground extends World
{

    /**
     * Constructor for objects of class WorldBackground.
     * 
     */
    public WorldBackground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter,128,110);
        JumpingGuy jumpingGuy = new JumpingGuy();
        addObject(jumpingGuy,317,187);
        mainCharacter.setLocation(145,107);
        mainCharacter.setLocation(122,129);
        mainCharacter.setLocation(240,309);
        removeObject(mainCharacter);
        jumpingGuy.setLocation(295,589);
        jumpingGuy.setLocation(79,563);
        Platform platform = new Platform(100,25);
        addObject(platform, 450,400);
    }
}
