import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Picker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Picker extends Alien
{
    Message pickerMessage = new Message();
    
    public void pickGumBall(){
    Coin coin = getWorldOfType(GumballWorld.class).insertedCoin;
    pickerMessage.setText("I am picking!");
        if(coin==null){
        pickerMessage.setText("No Coin is inserted!");
        getWorldOfType(GumballWorld.class).addObject(pickerMessage, 655, 120);
    }
    
   //AT the End, remove coin instance from machine
    getWorldOfType(GumballWorld.class).insertedCoin = null;
}
    
    /**
     * Act - do whatever the Picker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
}
