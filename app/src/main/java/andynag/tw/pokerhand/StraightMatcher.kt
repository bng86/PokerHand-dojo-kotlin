package andynag.tw.pokerhand

class StraightMatcher : HandsCategoryMatcher {

    override fun isMatch(cards: List<Card>): Boolean {
        val allDifference = cards.distinctBy { it.getPoints() }.count() == 5
        return if (allDifference) {
            val max = cards.map { it.getPoints() }.max()!!
            val min = cards.map { it.getPoints() }.min()!!
            max - min == 4
        } else {
            false
        }
    }

    override fun getHandsCategory(): HandCategory {
        return HandCategory.Straight
    }
}
