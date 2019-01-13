package andynag.tw.pokerhand

import org.junit.Assert
import org.junit.Test

class HandCategoryTest {

    @Test
    fun test_hands_category_ranking_mapping() {
        Assert.assertEquals(HandCategory.StraightFlush.value, 9)
        Assert.assertEquals(HandCategory.FourOfAKind.value, 8)
        Assert.assertEquals(HandCategory.FullHouse.value, 7)
        Assert.assertEquals(HandCategory.Flush.value, 6)
        Assert.assertEquals(HandCategory.Straight.value, 5)
        Assert.assertEquals(HandCategory.ThreeOfAKind.value, 4)
        Assert.assertEquals(HandCategory.TwoPair.value, 3)
        Assert.assertEquals(HandCategory.OnePair.value, 2)
        Assert.assertEquals(HandCategory.HighCard.value, 1)
    }
}