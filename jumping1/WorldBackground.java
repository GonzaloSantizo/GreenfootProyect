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
        super(1200, 800, 1); 
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
        jumpingGuy.setLocation(103,746);
        platform.setLocation(513,580);
        Platform platform2 = new Platform(100, 25);
        addObject(platform2,945,394);
        Platform platform3 = new Platform(100, 25);
        addObject(platform3,1057,333);
        Platform platform4 = new Platform(100, 25);
        addObject(platform4,975,580);
        Platform platform5 = new Platform(100, 25);
        addObject(platform5,783,467);
        Platform platform6 = new Platform(100, 25);
        addObject(platform6,672,435);
        platform.setLocation(373,711);
        jumpingGuy.setLocation(117,798);
        platform.setLocation(414,672);
        jumpingGuy.setLocation(127,747);
        platform6.setLocation(681,576);
        platform5.setLocation(922,509);
        platform4.setLocation(723,359);
        platform4.setLocation(759,321);
        platform4.setLocation(773,314);
        platform2.setLocation(535,236);
        platform3.setLocation(382,138);
        change2 change2 = new change2();
        addObject(change2,379,89);
    }
}
