package andynag.tw.pokerhand

class StraightMatcher : HandsCategoryMatcher {

    override fun isMatch(cards: List<Card>): Boolean {
        val allDifference = cards.distinctBy { it.getPoints() }.count() == 5
        return if (allDifference) {
            if (hasA(cards) && is10JQKA(cards)) {
                return true
            } else {
                val max = cards.map { it.getPoints() }.max()!!
                val min = cards.map { it.getPoints() }.min()!!
                max - min == 4
            }
        } else {
            false
        }
    }

    private fun is10JQKA(cards: List<Card>) =
        cards.map { it.getPoints() }.sortedBy { it }.toList() == listOf(1, 10, 11, 12, 13)

    private fun hasA(cards: List<Card>) = cards.any { it.getPoints() == 1 }

    override fun getHandsCategory(): HandCategory {
        return HandCategory.Straight
    }
}
