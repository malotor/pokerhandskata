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

        winner = game.resolve(new String[]{
                "5D",
                "4H"
        });

        Assert.assertEquals(1, winner);

        winner = game.resolve(new String[]{
                "TD",
                "4H"
        });

        Assert.assertEquals(1, winner);

        winner = game.resolve(new String[]{
                "4D",
                "TH"
        });

        Assert.assertEquals(2, winner);

        winner = game.resolve(new String[]{
                "KD",
                "TH"
        });

        Assert.assertEquals(1, winner);
    }

/*
    @Test
    public final void testTwoCartsWinHigher() throws Exception
    {

        PokerGame game = new PokerGame();

        int winner = game.resolve(new String[]{
                "1H,8H",
                "2H,4S"
        });

        Assert.assertEquals(1, winner);


    }
*/
}