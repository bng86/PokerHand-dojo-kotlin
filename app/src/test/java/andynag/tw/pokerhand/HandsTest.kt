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

    @Test
    fun test_full_house() {
        val cards = listOf(
            Card("CA"),
            Card("DA"),
            Card("HA"),
            Card("C5"),
            Card("D5")
        )
        val hands = Hands()
        val actual: HandCategory = hands.getHandCategory(cards)
        val excepted : HandCategory = HandCategory.FullHouse
        Assert.assertEquals(excepted, actual)
    }

    @Test
    fun test_flush() {
        val cards = listOf(
            Card("CA"),
            Card("C3"),
            Card("C5"),
            Card("C7"),
            Card("C9")
        )
        val hands = Hands()
        val actual: HandCategory = hands.getHandCategory(cards)
        val excepted : HandCategory = HandCategory.Flush
        Assert.assertEquals(excepted, actual)
    }

    @Test
    fun test_straight() {
        val cards = listOf(
            Card("CA"),
            Card("D2"),
            Card("H3"),
            Card("C4"),
            Card("C5")
        )
        val hands = Hands()
        val actual: HandCategory = hands.getHandCategory(cards)
        val excepted : HandCategory = HandCategory.Straight
        Assert.assertEquals(excepted, actual)
    }

    @Test
    fun test_three_of_a_kind() {
        val cards = listOf(
            Card("CA"),
            Card("DA"),
            Card("HA"),
            Card("C5"),
            Card("D4")
        )
        val hands = Hands()
        val actual: HandCategory = hands.getHandCategory(cards)
        val excepted : HandCategory = HandCategory.ThreeOfAKind
        Assert.assertEquals(excepted, actual)
    }

    @Test
    fun test_two_pair() {
        val cards = listOf(
            Card("CA"),
            Card("DA"),
            Card("H2"),
            Card("C3"),
            Card("D3")
        )
        val hands = Hands()
        val actual: HandCategory = hands.getHandCategory(cards)
        val excepted : HandCategory = HandCategory.TwoPair
        Assert.assertEquals(excepted, actual)
    }
}