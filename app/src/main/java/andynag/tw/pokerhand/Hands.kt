package andynag.tw.pokerhand

class Hands {

    private val matchers = listOf(
        StraightFlushMatcher(),
        FourOfAKindMatcher(),
        FullHouseMatcher(),
        FlushMatcher(),
        StraightMatcher(),
        ThreeOfAKindMatcher()
    )

    fun getHandCategory(cards: List<Card>): HandCategory {
        val handsCategory: HandCategory? = matchers.firstOrNull { it.isMatch(cards) }?.getHandsCategory()
        return handsCategory ?: throw Throwable("known hands category exception")
    }
}
