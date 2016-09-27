import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
  
    }    
    
    public boolean inspectCoin(){
        Coin coin = getWorldOfType(GumballWorld.class).insertedCoin;
        int messageX = getX();
        int messageY = getY() +20;
        boolean isValidCoin = false;
        Message coinCheckMessage = new Message();
        if(coin instanceof Quarter){
           if((Quarter)coin instanceof FakeQuarter ){
            coinCheckMessage.setText("Fake Quarter!!!");
            getWorld().addObject(coinCheckMessage, messageX, messageY); 
            }
        else{
            isValidCoin = true; 
            }
        }
        else if(coin instanceof Penny){
            coinCheckMessage.setText("Inserted Peny! It's not enough");
            getWorld().addObject(coinCheckMessage, messageX, messageY); 
        }

        return isValidCoin;
    }
    
    public Picker choosePicker(){
        List<Picker> pickers = new ArrayList<Picker>();
        RandomPicker randomPicker =((RandomPicker)getWorld().getObjects(RandomPicker.class).get(0));
        GreenPicker greenPicker =((GreenPicker)getWorld().getObjects(GreenPicker.class).get(0));
        
        pickers.add(randomPicker);
        pickers.add(greenPicker);
        
        Picker picker = pickers.get(new Random().nextInt(pickers.size()));
        return picker;
    }

}
