package andynag.tw.pokerhand

class ThreeOfAKindMatcher : HandsCategoryMatcher {

    override fun isMatch(cards: List<Card>): Boolean {
        return cards.groupBy { it.getPoints() }.any { it.value.size == 3 }
    }

    override fun getHandsCategory(): HandCategory {
        return HandCategory.ThreeOfAKind
    }

}
