package andynag.tw.pokerhand

class TwoPairMatcher : HandsCategoryMatcher {

    override fun isMatch(cards: List<Card>): Boolean {
        return cards.groupBy { it.getPoints() }.size == 3
    }

    override fun getHandsCategory(): HandCategory {
        return HandCategory.TwoPair
    }

}
