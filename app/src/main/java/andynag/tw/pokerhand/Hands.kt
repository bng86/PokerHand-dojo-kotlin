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
}
