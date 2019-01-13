package andynag.tw.pokerhand

class StraightFlushMatcher : HandsCategoryMatcher {

    private val flushMatcher = FlushMatcher()
    private val straightMatcher = StraightMatcher()

    override fun getHandsCategory(): HandCategory {
        return HandCategory.StraightFlush
    }

    override fun isMatch(cards: List<Card>): Boolean {
        return straightMatcher.isMatch(cards) && flushMatcher.isMatch(cards)
    }
}
