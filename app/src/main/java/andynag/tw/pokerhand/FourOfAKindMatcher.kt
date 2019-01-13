package andynag.tw.pokerhand

class FourOfAKindMatcher : HandsCategoryMatcher {

    override fun getHandsCategory(): HandCategory {
        return HandCategory.FourOfAKind
    }

    override fun isMatch(cards: List<Card>): Boolean {
        return cards.distinctBy { it.getSuit() }.count() == 4
    }
}
