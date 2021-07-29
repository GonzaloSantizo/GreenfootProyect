import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JumpingGuy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JumpingGuy extends Actor
{
    private final int Gravity = 1;
    private int Vel;
    public JumpingGuy(){
        Vel = 0;
    }
    public void act()
    {
        fall();
        if (Greenfoot.isKeyDown("w") && isOnSolidGround()) jump();
        move();
        
        if (TouchingAnt() == true){
            Greenfoot.setWorld(new World2());
        }
        if (TouchingFly() == true){
            Greenfoot.setWorld(new world3());
        }
    }
    public void fall(){
        setLocation(getX(),getY() + Vel);
        if (isOnSolidGround()) Vel = 0;
        else Vel += Gravity;
    }
    public void jump(){
        Vel = -20;
    }
    public void move(){
        int y = getY();
        int x = getX();
        if(Greenfoot.isKeyDown("A")) x-= 5; //A mueve hacia la izquierda
        if(Greenfoot.isKeyDown("D")) x+= 5; //D mueve hacia la derecha
        setLocation(x,y);
    }
    public boolean isOnSolidGround(){
        boolean isOnGround = false;
        
        if (getY() > getWorld().getHeight() - 50) isOnGround = true;
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if (getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, Platform.class) != null ||
            getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, Platform.class) != null) isOnGround = true;
        
        return isOnGround;
    }
    
        public boolean TouchingAnt(){
        boolean TouchingAnt = false;
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if (getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, change2.class) != null ||
            getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, change2.class) != null) TouchingAnt = true;
        
        return TouchingAnt;
    }
    
        public boolean TouchingFly(){
        boolean TouchingFly = false;
        
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if (getOneObjectAtOffset(imageWidth / -2, imageHeight / 2, change3.class) != null ||
            getOneObjectAtOffset(imageWidth / 2, imageHeight / 2, change3.class) != null) TouchingFly = true;
        
        return TouchingFly;
    }
    }
