import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballMachine extends Actor
{

    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 350) ; 
    }

    public void act() 
    {
       
        if(getWorldOfType(GumballWorld.class).insertedCoin!=null && Greenfoot.mouseClicked(this) ){           
        Coin coin = getWorldOfType(GumballWorld.class).insertedCoin;
            turnCrank(coin);
        }
        else if (getWorldOfType(GumballWorld.class).insertedCoin==null && Greenfoot.mouseClicked(this)){
            Message noCoinMsg = new Message();
            noCoinMsg.setText("Please insert a coin");
             getWorld().addObject(noCoinMsg, 350, 270);
        }
    } 
    
    private void turnCrank(Coin insertedCoin){
       Greenfoot.playSound("turn_crank.mp3");
       boolean isValidCoin = ((Inspector)getWorld().getObjects(Inspector.class).get(0)).inspectCoin();
       
       //If Valid Coin then choose Picker
       if(isValidCoin){
            Picker picker = ((Inspector)getWorld().getObjects(Inspector.class).get(0)).choosePicker();
            if(picker !=null){
               picker.pickGumBall(); 
            }
        }
    }
}
