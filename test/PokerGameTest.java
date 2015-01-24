import com.malotor.*;
import org.junit.*;


public class PokerGameTest {

    @Test
    public final void testOnlyOnCartWinHigher() throws Exception {

        PokerGame game = new PokerGame();

        int winner = game.resolve(new String[]{
                "1H",
                "2H"
        });

        Assert.assertEquals(2, winner);

        winner = game.resolve(new String[]{
                "3H",
                "1H"
        });

        Assert.assertEquals(1, winner);
    }


}