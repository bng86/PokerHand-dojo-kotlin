package andynag.tw.pokerhand.matcher

import andynag.tw.pokerhand.Card
import andynag.tw.pokerhand.HandCategory

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
