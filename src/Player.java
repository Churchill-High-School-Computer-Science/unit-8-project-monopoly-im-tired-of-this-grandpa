
import java.util.ArrayList;

public class Player {

String Name;
int Money;
ArrayList<Property> Properties;
int Location;   

    //TODO FIX
public Player(String Name,int Money, ArrayList<Property> Properties, int Location){
    this.Name = Name;
    this.Money = Money;
    this.Properties = Properties;
    this.Location = Location;
}

    //TODO FIX
    public String getName(){
        return Name;
    }

    ///TODO FIX
    public int getMoney(){
        return Money;
    }

    //TODO FIX
    public ArrayList<Property> getProperties(){
        return Properties;
    }

    //TODO FIX
    //Go is the top left corner, location 0. Locations increase by 1 for each property that the player passes clockwise.
    public int getLocation(){
        return Location;
    }
    public void rollDice(){
        int die1 = (int)(Math.random()*6) + 1;
        int die2 = (int)(Math.random()*6) + 1;
        int total = die1 + die2;
        Display.inform("You rolled a " + die1 + " and a " + die2 + " for a total of " + total);
        Location += total;
        if(Location > 39){
            Location = Location % 40;     
        }
        Display.frame.repaint();
        Display.boardPanel.repaint();
   
    }
    public void buyProperty(Property p){
        Display.choice("YES_NO_OPTION", "Would you like to buy " + p.getName() + " for " + p.getCost(), new String[]{"Yes", "No"});
        if(Money >= p.getCost() && p.getCost() > 0 && p.getOwner()==null){
            Money -= p.getCost();
            Properties.add(p);
            p.setOwner(this);
            Display.inform("You bought " + p.getName() + " for " + p.getCost());
        }
        else{
            Display.inform("You do not have enough money to buy or it's already owned " + p.getName());
        } 
    }
    public void rent(){
        Property p = Board.propertiesMap.get(Location);
        if(p.getOwner() ==null){
            Display.inform("This property is not owned.");
        }
        else if(p.getOwner().equals(this)){
            Display.inform("You own this property.");
        }
        else{
            Display.inform("You owe " + p.getOwner() + " " + p.getRent());
            Money -= p.getRent();
            p.getOwner().Money += p.getRent();
        }

    }
    public void bankrupcy(){
        if(Money < 0){
            Display.inform("You are bankrupt!");
            for(Property p:Properties){
                p.setOwner(null);
            }
            Properties.clear();
            Display.players.remove(this);
        }
    }
}

