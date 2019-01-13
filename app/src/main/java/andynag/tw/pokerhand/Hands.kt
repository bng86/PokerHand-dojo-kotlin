package andynag.tw.pokerhand

class Hands {

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

    fun getHandCategory(cards: List<Card>): HandCategory {
        val handsCategory: HandCategory? = matchers.firstOrNull { it.isMatch(cards) }?.getHandsCategory()
        return handsCategory ?: HandCategory.HighCard
    }
}
