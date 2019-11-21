import com.chess.Army;
import com.chess.Board;
import com.chess.Game;
import com.chess.Player;

public class Main {

    public static void main(String[] args) {
        Board board = new Board();
        Army player1Army = new Army();
        Army player2Army = new Army();
        Player player1 = new Player(player1Army);
        Player player2 = new Player(player2Army);
        Game game = new Game(board);
        System.out.println("Hello World!");
    }
}
