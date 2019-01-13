package andynag.tw.pokerhand

class FlushMatcher : HandsCategoryMatcher {

    override fun isMatch(cards: List<Card>): Boolean {
        return cards.distinctBy { it.getSuit() }.count() == 1
    }

    override fun getHandsCategory(): HandCategory {
        return HandCategory.Flush
    }

}
