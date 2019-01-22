package andynag.tw.pokerhand

import andynag.tw.pokerhand.HandCategory.*
import org.junit.Assert
import org.junit.Test

class HandCategoryTest {

    @Test
    fun test_hands_category_ranking_priority() {

        val expected = listOf(
            StraightFlush,
            FourOfAKind,
            FullHouse,
            Flush,
            Straight,
            ThreeOfAKind,
            TwoPair,
            OnePair,
            HighCard
        )

        val actual = listOf(
            HighCard,
            OnePair,
            TwoPair,
            ThreeOfAKind,
            Straight,
            Flush,
            FullHouse,
            FourOfAKind,
            StraightFlush
        ).sortedByDescending { it.value }

        Assert.assertEquals(expected, actual)
    }
}