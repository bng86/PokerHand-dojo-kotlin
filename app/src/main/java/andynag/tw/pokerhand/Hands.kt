package andynag.tw.pokerhand

class Hands {

    private val matchers = listOf(
        StraightFlushMatcher(),
        FourOfAKindMatcher()
    )

    fun getHandCategory(cards: List<Card>): HandCategory {
        val handsCategory: HandCategory? = matchers.firstOrNull { it.isMatch(cards) }?.getHandsCategory()
        return handsCategory ?: throw Exception("known hands category exception")
    }
}
