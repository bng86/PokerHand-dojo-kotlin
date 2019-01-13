package andynag.tw.pokerhand

class StraightFlushMatcher : HandsCategoryMatcher {

    private val flushMatcher = FlushMatcher()

    override fun getHandsCategory(): HandCategory {
        return HandCategory.StraightFlush
    }

    override fun isMatch(cards: List<Card>): Boolean {
        return isStraight(cards) && flushMatcher.isMatch(cards)
    }

    private fun isStraight(cards: List<Card>): Boolean {
        val allDifference = cards.distinctBy { it.getPoints() }.count() == 5
        return if (allDifference) {
            val max = cards.map { it.getPoints() }.max()!!
            val min = cards.map { it.getPoints() }.min()!!
            max - min == 4
        } else {
            false
        }
    }

}
