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

    @Test
    fun test_diamondsQ() {
        val card = Card("DQ")
        val actualSuitType: SuitType = card.getSuit()

        Assert.assertEquals(SuitType.Diamonds, actualSuitType)
        Assert.assertEquals(12, card.getPoints())
    }

    @Test
    fun test_heartsK() {
        val card = Card("HK")
        val actualSuitType: SuitType = card.getSuit()

        Assert.assertEquals(SuitType.Hearts, actualSuitType)
        Assert.assertEquals(13, card.getPoints())
    }
}