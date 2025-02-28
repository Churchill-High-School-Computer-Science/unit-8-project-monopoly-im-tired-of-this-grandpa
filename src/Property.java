
import java.awt.Color;

public class Property {
    
   private Color color;
   private String name;
   private Player owner;
   private int numHouses;  
   private int numHotels;
   private int costToBuildHouse;
   private boolean isMortgaged;
   private int cost;
   private int rent;


    //Step 2
    public Property(Color c, String n, int h, int ho, int costtbh, boolean m, int co, int r){
        color = c;
        name = n;
        owner = null;
        numHouses = h;
        numHotels = ho; 
        costToBuildHouse = costtbh;
        isMortgaged = m;
        cost = co;
        rent = r;
    }
    //TODO fix
    public Color getColor(){
        return color;
    }

    //TODO fix
    public String getName(){
        return name;
    }

    //TODO fix
    public int getNumHouses(){
        return numHouses;
    }

    //TODO fix
    public Player getOwner(){
        return owner;
    }

    //TODO fix
    public int getRent(){
        return rent;
    }
    public int getnumHotels(){
        return numHotels;
    }
    public boolean getIsMortgaged(){
        return isMortgaged;
    }
    public int getCost(){
        return cost;
    }
    public int getCostToBuildHouse(){
        return costToBuildHouse;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }
    
}

