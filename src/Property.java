
import java.awt.Color;

public class Property {
    
    Color color;
    String name;
    String owner;
    int numHouses;  
    int numHotels;
    int costToBuildHouse;
    boolean isMortgaged;
    int cost;
    int rent;


    //Step 2
    public Property(Color c, String n, String o, int h, int ho, int costtbh, boolean m, int co, int r){
        color = c;
        name = n;
        owner = o;
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
    public String getOwner(){
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
}

