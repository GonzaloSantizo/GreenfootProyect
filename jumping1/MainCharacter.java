import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This characcter will be used by the main player
 * 
 * @author (Gonzalo Santizo) 
 * @version (7-21-21)
 */
public class MainCharacter extends Actor
{
    /**
     * Act - do whatever the MainCharacter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        
    }
    
    
    public void move(){
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("w")) y--; //W mueve hacia arriba
        if(Greenfoot.isKeyDown("S")) y++; //S mueve hacia abajo
        if(Greenfoot.isKeyDown("A")) x--; //A mueve hacia la izquierda
        if(Greenfoot.isKeyDown("D")) x++; //D mueve hacia la derecha
        setLocation(x,y);
    }
}
