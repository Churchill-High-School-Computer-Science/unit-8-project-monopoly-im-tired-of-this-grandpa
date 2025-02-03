
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
}
