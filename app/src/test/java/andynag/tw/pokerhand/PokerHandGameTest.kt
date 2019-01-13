package andynag.tw.pokerhand

import org.junit.Assert
import org.junit.Test

class PokerHandGameTest {

    @Test
    fun test_straight_flush_win_four_of_a_kind() {
        val cards1 = listOf(
            Card("CA"),
            Card("C2"),
            Card("C3"),
            Card("C4"),
            Card("C5")
        )

        val cards2 = listOf(
            Card("CA"),
            Card("DA"),
            Card("HA"),
            Card("SA"),
            Card("C5")
        )

        val player1 = Player("Andy", Hands(cards1))
        val player2 = Player("Merry", Hands(cards2))

        val pokerHandGame = PokerHandGame(player1, player2)
        val winner = pokerHandGame.getWinner()

        Assert.assertEquals("Andy win, because of StraightFlush", winner.toString())
    }
}