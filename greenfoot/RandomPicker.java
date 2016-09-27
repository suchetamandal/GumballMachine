import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    
    public void pickGumBall(){    
        super.pickGumBall();
        getWorld().addObject(super.pickerMessage, 655, 120);
        
        List<Gumball> gumballs = new ArrayList<Gumball>();
        gumballs.add(new RedGumball());
        gumballs.add(new BlueGumball());
        gumballs.add(new GreenGumball());
        
        Gumball gumball = gumballs.get(new Random().nextInt(gumballs.size()));
        getWorld().addObject(gumball, 300, 500);
    }
}
