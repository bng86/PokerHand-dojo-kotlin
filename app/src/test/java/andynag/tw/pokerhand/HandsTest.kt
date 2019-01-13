package andynag.tw.pokerhand

import org.junit.Assert
import org.junit.Test

class HandsTest {

    @Test
    fun test_straight_flush() {
        val cards = listOf(
            Card("SA"),
            Card("S2"),
            Card("S3"),
            Card("S4"),
            Card("S5")
        )
        val hands = Hands()
        val actual: HandCategory = hands.getHandCategory(cards)
        val excepted : HandCategory = HandCategory.StraightFlush
        Assert.assertEquals(excepted, actual)
    }

    @Test
    fun test_four_of_a_kind() {
        val cards = listOf(
            Card("CA"),
            Card("DA"),
            Card("HA"),
            Card("SA"),
            Card("S5")
        )
        val hands = Hands()
        val actual: HandCategory = hands.getHandCategory(cards)
        val excepted : HandCategory = HandCategory.FourOfAKind
        Assert.assertEquals(excepted, actual)
    }
}