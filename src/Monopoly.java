import java.util.ArrayList;
import javax.swing.SwingUtilities;
public class Monopoly {
    public static void main(String[] args) {

        Board board = new Board();
        Player a = new Player("Player 1", 1500, new ArrayList<Property>(), 0);
        Player b = new Player("Player 2", 1500, new ArrayList<Property>(), 0);
        Player c = new Player("Player 3", 1500, new ArrayList<Property>(), 0);
        Player d = new Player("Player 4", 1500, new ArrayList<Property>(), 0);
        Display.players.add(a);
        Display.players.add(b);
        Display.players.add(c);
        Display.players.add(d);
        //Graphics!
        SwingUtilities.invokeLater(() -> Display.setupFrame());
    }
}
