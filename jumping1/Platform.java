import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * These will be the platforms
 * 
 * @author (Gonzalo Santizo) 
 * @version (7-21-21)
 */
public class Platform extends Actor
{
    public Platform(){
        this(50,25);
    }
    public Platform(int width, int height){
        GreenfootImage image = getImage();
        image.scale(width,height);
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
    }
}
