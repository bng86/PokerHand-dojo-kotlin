package andynag.tw.pokerhand

import org.junit.Assert
import org.junit.Test

class PokerHandGameTest {

    private val straightFlushHands = Hands(
        listOf(
            Card("CA"),
            Card("C2"),
            Card("C3"),
            Card("C4"),
            Card("C5")
        )
    )

    private val fourOfAKindHands = Hands(
        listOf(
            Card("CA"),
            Card("DA"),
            Card("HA"),
            Card("SA"),
            Card("C5")
        )
    )

    @Test
    fun test_player1_win_player2_because_of_hands_category() {

        val player1 = Player("Andy", straightFlushHands)
        val player2 = Player("Merry", fourOfAKindHands)

        val pokerHandGame = PokerHandGame(player1, player2)
        val winner = pokerHandGame.getWinner()

        Assert.assertEquals("Andy win, because of StraightFlush", winner.toString())
    }

    @Test
    fun test_player2_win_player1_because_of_hands_category() {

        val player1 = Player("Andy", fourOfAKindHands)
        val player2 = Player("Merry", straightFlushHands)

        val pokerHandGame = PokerHandGame(player1, player2)
        val winner = pokerHandGame.getWinner()

        Assert.assertEquals("Merry win, because of StraightFlush", winner.toString())
    }

    @Test
    fun test_draw_because_of_hands_category() {

        val player1 = Player("Andy", straightFlushHands)
        val player2 = Player("Merry", straightFlushHands)

        val pokerHandGame = PokerHandGame(player1, player2)
        val winner = pokerHandGame.getWinner()

        Assert.assertEquals("Draw, because of StraightFlush", winner.toString())
    }
}