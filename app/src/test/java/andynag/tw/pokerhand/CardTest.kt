package andynag.tw.pokerhand

import org.junit.Assert
import org.junit.Test

class CardTest {

    @Test
    fun test_clubsJ() {
        val card = Card("CJ")
        val actualSuitType: SuitType = card.getSuit()

        Assert.assertEquals(SuitType.Clubs, actualSuitType)
        Assert.assertEquals(11, card.getPoints())
    }
}