import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Board {
    Property [][] properties = new Property[11][11];
    static Map<Integer, Property> propertiesMap = new HashMap<>();
    public Board(){
        Display.properties = properties;
        properties[10][10] = new Property(Color.GRAY, "Go", 0, 0, 0, false, 0, 0);
        propertiesMap.put(0, properties[10][10]);
        properties[9][10] = new Property(new Color(102,51,0), "Mediterranean Avenue", 0, 0, 50, false, 60, 2);
        propertiesMap.put(1, properties[9][10]);
        properties[8][10] = new Property(new Color(100, 100, 255), "Community Chest", 0, 0, 0, false, 0, 0);
        propertiesMap.put(2, properties[8][10]);
        properties[7][10] = new Property(new Color(102,51,0), "Baltic Avenue" , 0, 0, 50, false, 60, 4);
        propertiesMap.put(3, properties[7][10]);
        properties[6][10] = new Property(Color.BLACK, "Income Tax", 0, 0, 0, false, 0, 0);
        propertiesMap.put(4, properties[6][10]);
        properties[5][10] = new Property(Color.BLACK, "Reading Railroad", 0, 0, 0, false, 200, 25);
        propertiesMap.put(5, properties[5][10]);
        properties[4][10] = new Property(new Color(0,220,255), "Oriental Avenue", 0, 0, 50, false, 100, 6);
        propertiesMap.put(6, properties[4][10]);
        properties[3][10] = new Property(new Color(232, 128,9 ), "Chance", 0, 0, 0, false, 0, 0);
        propertiesMap.put(7, properties[3][10]);
        properties[2][10] = new Property(new Color(0,220,255), "Vermont Avenue", 0, 0, 50, false, 100, 6);
        propertiesMap.put(8, properties[2][10]);
        properties[1][10] = new Property(new Color(0,220,255), "Connecticut Avenue", 0, 0, 50, false, 120, 8);
        propertiesMap.put(9, properties[1][10]);
        properties[0][10] = new Property(Color.DARK_GRAY, "Jail", 0, 0, 0, false, 0, 0);
        propertiesMap.put(10, properties[0][10]);

        properties[0][9] = new Property(new Color(204,68,204), "St. Charles Place", 0, 0, 100, false, 140, 10);
        propertiesMap.put(11, properties[0][9]);
        properties[0][8] = new Property(new Color(255,255,255), "Electric Company", 0, 0, 0, true, 150, 0);
        propertiesMap.put(12, properties[0][8]);
        properties[0][7] = new Property(new Color(204,68,204), "States Avenue", 0, 0, 100, false, 140, 10);
        propertiesMap.put(13, properties[0][7]);
        properties[0][6] = new Property(new Color(204,68,204), "Virginia Avenue", 0, 0, 100, false, 160, 12);
        propertiesMap.put(14, properties[0][6]);
        properties[0][5] = new Property(Color.BLACK, "Pennsylvania Railroad", 0, 0, 0, false, 200, 25);
        propertiesMap.put(15, properties[0][5]);
        properties[0][4] = new Property(new Color(232, 128,9 ), "St. James Place", 0, 0, 100, false, 180, 14);
        propertiesMap.put(16, properties[0][4]);
        properties[0][3] = new Property(new Color(100, 100,255), "Community Chest", 0, 0, 0, false, 0, 0);
        propertiesMap.put(17, properties[0][3]);
        properties[0][2] = new Property(new Color(232, 128,9 ), "Tennessee Avenue", 0, 0, 100, false, 180, 14);
        propertiesMap.put(18, properties[0][2]);
        properties[0][1] = new Property(new Color(232, 128,9 ), "New York Avenue", 0, 0, 100, false, 200, 16);
        propertiesMap.put(19, properties[0][1]);
        properties[0][0] = new Property(Color.GRAY, "Free Parking", 0, 0, 0, false, 0, 0);
        propertiesMap.put(20, properties[0][0]);

        properties[1][0] = new Property(new Color(255,0,0), "Kentucky Avenue", 0, 0, 150, false, 220, 18);
        propertiesMap.put(21, properties[1][0]);
        properties[2][0] = new Property(new Color(232, 128,9 ), "Chance", 0, 0, 0, false, 0, 0);
        propertiesMap.put(22, properties[2][0]);
        properties[3][0] = new Property(new Color(255,0,0), "Indiana Avenue", 0, 0, 150, false, 220, 18);
        propertiesMap.put(23, properties[3][0]);    
        properties[4][0] = new Property(new Color(255,0,0), "Illinois Avenue", 0, 0, 150, false, 240, 20);
        propertiesMap.put(24, properties[4][0]);
        properties[5][0] = new Property(Color.BLACK, "B&O Railroad", 0, 0, 0, false, 200, 25);
        propertiesMap.put(25, properties[5][0]);    
        properties[6][0] = new Property(new Color(255,255,51), "Atlantic Avenue", 0, 0, 150, false, 260, 22);
        propertiesMap.put(26, properties[6][0]);
        properties[7][0] = new Property(new Color(255,255,51), "Ventnor Avenue", 0, 0, 150, false, 260, 22);
        propertiesMap.put(27, properties[7][0]);    
        properties[8][0] = new Property(new Color(255,255,255), "Water Works", 0, 0, 0, true, 150, 0);
        propertiesMap.put(28, properties[8][0]);    
        properties[9][0] = new Property(new Color(255,255,51), "Marvin Gardens", 0, 0, 150, false, 280, 24);
        propertiesMap.put(29, properties[9][0]);
        properties[10][0] = new Property(Color.BLACK, "Go to Jail", 0, 0, 0, false, 0, 0);
        propertiesMap.put(30, properties[10][0]);

        properties[10][1] = new Property(new Color(51,153,51), "Pacific Avenue", 0, 0, 200, false, 300, 26);
        propertiesMap.put(31, properties[10][1]);
        properties[10][2] = new Property(new Color(51,153,51), "North Carolina Avenue", 0, 0, 200, false, 300, 26);
        propertiesMap.put(32, properties[10][2]);
        properties[10][3] = new Property(new Color(100, 100, 255), "Community Chest", 0, 0, 0, false, 0, 0);
        propertiesMap.put(33, properties[10][3]);
        properties[10][4] = new Property(new Color(51,153,51), "Pennsylvania Avenue", 0, 0, 200, false, 320, 28);
        propertiesMap.put(34, properties[10][4]);
        properties[10][5] = new Property(Color.BLACK, "Short Line Railroad", 0, 0, 0, false, 200, 25);
        propertiesMap.put(35, properties[10][5]);
        properties[10][6] = new Property(new Color(232, 128,9 ), "Chance", 0, 0, 0, false, 0, 0);
        propertiesMap.put(36, properties[10][6]);
        properties[10][7] = new Property(new Color(0, 0, 150), "Park Place", 0, 0, 200, false, 350, 35);
        propertiesMap.put(37, properties[10][7]);
        properties[10][8] = new Property(Color.BLACK, "Luxury Tax", 0, 0, 0, false, 0, 0);
        propertiesMap.put(38, properties[10][8]);
        properties[10][9] = new Property(new Color(0, 0, 150), "Boardwalk", 0, 0, 200, false, 400, 50);
        propertiesMap.put(39, properties[10][9]); 
            }
        }
    