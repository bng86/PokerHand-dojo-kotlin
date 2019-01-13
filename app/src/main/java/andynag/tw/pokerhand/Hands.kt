package andynag.tw.pokerhand

import andynag.tw.pokerhand.matcher.*

class Hands(val cards: List<Card>) {

    private val matchers = listOf(
        StraightFlushMatcher(),
        FourOfAKindMatcher(),
        FullHouseMatcher(),
        FlushMatcher(),
        StraightMatcher(),
        ThreeOfAKindMatcher(),
        TwoPairMatcher(),
        OnePairMatcher()
    )

    fun getHandCategory(): HandCategory {
        val handsCategory: HandCategory? = matchers.firstOrNull { it.isMatch(this.cards) }?.getHandsCategory()
        return handsCategory ?: HandCategory.HighCard
    }

    operator fun compareTo(hands: Hands): Int {
        return this.getHandCategory().value.compareTo(hands.getHandCategory().value)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Hands

        if (cards != other.cards) return false

        return true
    }

    override fun hashCode(): Int {
        return cards.hashCode()
    }

}
