package andynag.tw.pokerhand

import org.junit.Assert
import org.junit.Test

class PokerHandGameTest {

    companion object {
        private const val STRAIGHT_FLUSH_A2345 = "CA,C2,C3,C4,C5"
        private const val STRAIGHT_FLUSH_10JQKA = "C10,CJ,CQ,CK,CA"
        private const val FOUR_OF_A_KIND = "CA,DA,HA,SA,C2"
    }

    @Test
    fun test_player1_win_player2_because_of_hands_category() {

        val player1 = Player("Andy", STRAIGHT_FLUSH_A2345)
        val player2 = Player("Merry", FOUR_OF_A_KIND)

        val pokerHandGame = PokerHandGame(player1, player2)
        val winner = pokerHandGame.getWinner()

        Assert.assertEquals("Andy win, because of StraightFlush", winner.toString())
    }

    @Test
    fun test_player2_win_player1_because_of_hands_category() {

        val player1 = Player("Andy", FOUR_OF_A_KIND)
        val player2 = Player("Merry", STRAIGHT_FLUSH_A2345)

        val pokerHandGame = PokerHandGame(player1, player2)
        val winner = pokerHandGame.getWinner()

        Assert.assertEquals("Merry win, because of StraightFlush", winner.toString())
    }

    @Test
    fun test_draw_because_of_hands_category() {

        val player1 = Player("Andy", STRAIGHT_FLUSH_A2345)
        val player2 = Player("Merry", STRAIGHT_FLUSH_A2345)

        val pokerHandGame = PokerHandGame(player1, player2)
        val winner = pokerHandGame.getWinner()

        Assert.assertEquals("Draw, because of StraightFlush", winner.toString())
    }

    @Test
    fun test_straight_flush_win_by_key_card() {

        val player1 = Player("Andy", STRAIGHT_FLUSH_10JQKA)
        val player2 = Player("Merry", STRAIGHT_FLUSH_A2345)

        val pokerHandGame = PokerHandGame(player1, player2)
        val winner = pokerHandGame.getWinner()

        Assert.assertEquals("Andy win, because of StraightFlush, key card: K", winner.toString())
    }
}