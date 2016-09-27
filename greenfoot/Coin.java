import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List; 

/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Coin extends Actor
{

    public void act() 
    {
        int mouseX, mouseY ;
        
        if(Greenfoot.mouseDragged(this)) {          
            MouseInfo mouse = Greenfoot.getMouseInfo();  
            mouseX=mouse.getX();  
            mouseY=mouse.getY();  
            setLocation(mouseX, mouseY);  
            
            insertCoin(mouseX,mouseY);
            getWorldOfType(GumballWorld.class).insertedCoin = this;
        } 
    }  
    
    private void insertCoin(int mouseX, int mouseY){
        int gumballMachineX = 330;
         if(gumballMachineX< mouseX){
             //Remove all previous messages
             World world = getWorld();
             List<Message> messageActors = getWorld().getObjects(Message.class);
             world.removeObjects(messageActors);
             
             List<Gumball> gumballs = getWorld().getObjects(Gumball.class);
             world.removeObjects(gumballs);
             
             // Display message 'Have Coin'
             Message haveCoinMsg = new Message();
             haveCoinMsg.setText("Have Coin!");
             
             world.addObject(haveCoinMsg, 350, 270);
             
             // Remove Coin
             world.removeObject(this);
             Greenfoot.playSound("insert_coin.mp3"); 
             Greenfoot.delay(80);
             
             //Remove Message
             world.removeObject(haveCoinMsg);
             
            }
    }
}
