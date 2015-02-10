import com.malotor.*;
import org.junit.*;


public class PokerGameTest {

    @Test
    public final void testOnlyOnCartWinHigher() throws Exception {

        PokerGame game = new PokerGame(new String[]{
                "1H",
                "2H"
        });

        Assert.assertEquals(2, game.getWinner());

        game = new PokerGame(new String[]{
                "3H",
                "1H"
        });

        Assert.assertEquals(1, game.getWinner());

        game = new PokerGame(new String[]{
                "5D",
                "4H"
        });

        Assert.assertEquals(1, game.getWinner());

        game = new PokerGame(new String[]{
                "TD",
                "4H"
        });

        Assert.assertEquals(1, game.getWinner());

        game = new PokerGame(new String[]{
                "4D",
                "TH"
        });

        Assert.assertEquals(2, game.getWinner());

        game = new PokerGame(new String[]{
                "KD",
                "TH"
        });

        Assert.assertEquals(1, game.getWinner());
    }


    @Test
    public final void testTwoCartsWinHigher() throws Exception
    {

        PokerGame game = new PokerGame(new String[]{
                "1H,8H",
                "2H,4S"
        });

        Assert.assertEquals(1, game.getWinner());

        game = new PokerGame(new String[]{
                "4H,5D",
                "8H,1S"
        });

        Assert.assertEquals(2, game.getWinner());
    }

    @Test
    public final void testFiveCardsWinsHigher() throws Exception
    {


        PokerGame game = new PokerGame(new String[]{
                "1H,8H,KD,AC,1D",
                "2H,4S,2D,3C,5D"
        });

        Assert.assertEquals(1, game.getWinner());

        game = new PokerGame(new String[]{
                "4H,5D,6H,1D,8S",
                "8H,1S,4D,3H,AH"
        });

        Assert.assertEquals(2, game.getWinner());
    }

}