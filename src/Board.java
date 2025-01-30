import java.awt.Color;

public class Board {
    Property [][] properties = new Property[11][11];

    public Board(){
        Display.properties = properties;
        properties[0][0] = new Property(Color.BLACK, "Go", "none", 0, 0, 0, false, 0, 0);
        properties[1][0] = new Property(new Color(102,51,0), "Mediterranean Avenue", "none", 0, 0, 50, false, 60, 2);
        properties[2][0] = new Property(Color.BLACK, "Community Chest", "none", 0, 0, 0, false, 0, 0);
        properties[3][0] = new Property(new Color(102,51,0), "Baltic Avenue", "none", 0, 0, 50, false, 60, 4);
        properties[4][0] = new Property(Color.BLACK, "Income Tax", "none", 0, 0, 0, false, 0, 0);
        properties[5][0] = new Property(Color.BLACK, "Reading Railroad", "none", 0, 0, 0, false, 200, 25);
        properties[6][0] = new Property(new Color(0,153,204), "Oriental Avenue", "none", 0, 0, 50, false, 100, 6);
        properties[7][0] = new Property(Color.BLACK, "Chance", "none", 0, 0, 0, false, 0, 0);
        properties[8][0] = new Property(new Color(0,153,204), "Vermont Avenue", "none", 0, 0, 50, false, 100, 6);
        properties[9][0] = new Property(new Color(0,153,204), "Connecticut Avenue", "none", 0, 0, 50, false, 120, 8);
        properties[10][0] = new Property(Color.BLACK, "Jail", "none", 0, 0, 0, false, 0, 0);
        
        properties[10][1] = new Property(new Color(204,68,204), "St. Charles Place", "none", 0, 0, 100, false, 140, 10);
        properties[10][2] = new Property(Color.BLACK, "Electric Company", "none", 0, 0, 0, true, 150, 0);
        properties[10][3] = new Property(new Color(204,68,204), "States Avenue", "none", 0, 0, 100, false, 140, 10);
        properties[10][4] = new Property(new Color(204,68,204), "Virginia Avenue", "none", 0, 0, 100, false, 160, 12);
        properties[10][5] = new Property(Color.BLACK, "Pennsylvania Railroad", "none", 0, 0, 0, false, 200, 25);
        properties[10][6] = new Property(new Color(232, 128,9 ), "St. James Place", "none", 0, 0, 100, false, 180, 14);
        properties[10][7] = new Property(Color.BLACK, "Community Chest", "none", 0, 0, 0, false, 0, 0);
        properties[10][8] = new Property(new Color(232, 128,9 ), "Tennessee Avenue", "none", 0, 0, 100, false, 180, 14);
        properties[10][9] = new Property(new Color(232, 128,9 ), "New York Avenue", "none", 0, 0, 100, false, 200, 16);
        properties[10][10] = new Property(Color.BLACK, "Free Parking", "none", 0, 0, 0, false, 0, 0);
    
        properties[9][10] = new Property(new Color(255,0,0), "Kentucky Avenue", "none", 0, 0, 150, false, 220, 18);
        properties[8][10] = new Property(Color.BLACK, "Chance", "none", 0, 0, 0, false, 0, 0);
        properties[7][10] = new Property(new Color(255,0,0), "Indiana Avenue", "none", 0, 0, 150, false, 220, 18);
        properties[6][10] = new Property(new Color(255,0,0), "Illinois Avenue", "none", 0, 0, 150, false, 240, 20);
        properties[5][10] = new Property(Color.BLACK, "B&O Railroad", "none", 0, 0, 0, false, 200, 25);
        properties[4][10] = new Property(new Color(255,255,51), "Atlantic Avenue", "none", 0, 0, 150, false, 260, 22);
        properties[3][10] = new Property(new Color(255,255,51), "Ventnor Avenue", "none", 0, 0, 150, false, 260, 22);
        properties[2][10] = new Property(Color.BLACK, "Water Works", "none", 0, 0, 0, true, 150, 0);
        properties[1][10] = new Property(new Color(255,255,51), "Marvin Gardens", "none", 0, 0, 150, false, 280, 24);
        properties[0][10] = new Property(Color.BLACK, "Go to Jail", "none", 0, 0, 0, false, 0, 0);
    
        properties[0][9] = new Property(new Color(51,153,51), "Pacific Avenue", "none", 0, 0, 200, false, 300, 26);
        properties[0][8] = new Property(new Color(51,153,51), "North Carolina Avenue", "none", 0, 0, 200, false, 300, 26);
        properties[0][7] = new Property(Color.BLACK, "Community Chest", "none", 0, 0, 0, false, 0, 0);
        properties[0][6] = new Property(new Color(51,153,51), "Pennsylvania Avenue", "none", 0, 0, 200, false, 320, 28);
        properties[0][5] = new Property(Color.BLACK, "Short Line Railroad", "none", 0, 0, 0, false, 200, 25);
        properties[0][4] = new Property(Color.BLACK, "Chance", "none", 0, 0, 0, false, 0, 0);
        properties[0][3] = new Property(new Color(24, 9, 232), "Park Place", "none", 0, 0, 200, false, 350, 35);
        properties[0][2] = new Property(Color.BLACK, "Luxury Tax", "none", 0, 0, 0, false, 0, 0);
        properties[0][1] = new Property(new Color(24, 9, 232), "Boardwalk", "none", 0, 0, 200, false, 400, 50);}
}