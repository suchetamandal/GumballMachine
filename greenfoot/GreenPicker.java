import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    
    public void pickGumBall(){ 
        super.pickGumBall();
        
        getWorld().addObject(super.pickerMessage, 655, 500);    
        getWorld().addObject(new GreenGumball(), 300, 500);
    }
}
