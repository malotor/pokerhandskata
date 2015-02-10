import com.malotor.*;
import org.junit.*;


public class PokerGameTest {

   
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